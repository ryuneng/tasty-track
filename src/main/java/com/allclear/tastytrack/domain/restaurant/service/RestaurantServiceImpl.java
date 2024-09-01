package com.allclear.tastytrack.domain.restaurant.service;


import com.allclear.tastytrack.domain.restaurant.dto.RestaurantListRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.allclear.tastytrack.domain.restaurant.entity.Restaurant;
import com.allclear.tastytrack.domain.restaurant.repository.RestaurantRepository;
import com.allclear.tastytrack.domain.review.dto.ReviewRequest;
import com.allclear.tastytrack.domain.review.repository.ReviewRepository;
import com.allclear.tastytrack.global.exception.CustomException;
import com.allclear.tastytrack.global.exception.ErrorCode;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;
    private final ReviewRepository reviewRepository;

    @Override
    public Restaurant getRestaurant(int id, int deletedYn) {

        Restaurant restaurant = restaurantRepository.findByIdAndDeletedYn(id, deletedYn);
        if (restaurant == null) {
            throw new CustomException(ErrorCode.NOT_VALID_PROPERTY);
        }

        if (restaurant.getDeletedYn() == 0) {
            throw new CustomException(ErrorCode.NOT_EXISTENT_RESTAURANT);
        }

        return restaurant;
    }

    @Override
    @Transactional
    public Restaurant updateRestaurantScore(ReviewRequest request) {

        Restaurant restaurant = restaurantRepository.getReferenceById(request.getRestaurantId());

        if (restaurant.getDeletedYn() == 0) {
            throw new CustomException(ErrorCode.NOT_EXISTENT_RESTAURANT);
        }

        double beforeScore = restaurant.getRateScore();
        int countReview = reviewRepository.countByRestaurantId(request.getRestaurantId());
        int score = request.getScore();

        double newScore = (restaurant.getRateScore() * (countReview - 1) + score) / countReview;
        double newScoreFormat = Math.floor((newScore * 10)) / 10.0;
        restaurant.setRateScore(newScoreFormat);

        return restaurantRepository.save(restaurant);
    }

    /**
     * 위치 정보에 따른 맛집 목록을 조회합니다.
     * 작성자: 배서진
     *
     * @param request
     * @return 맛집 리스트 반환
     */
    @Override
    public List<Restaurant> getRestaurantList(RestaurantListRequest request) {

        request = validateRequest(request); // 요청 객체 유효성 검사

        String type = (request.getType() != null) ? request.getType() : "";
        String name = (request.getName() != null) ? request.getName() : "";

        log.info("맛집 검색 - 위도: {}, 경도: {}, 범위: {}, 타입: {}, 이름: {}",
                request.getLat(), request.getLon(), request.getRange(), type, name);

        List<Restaurant> response = restaurantRepository.findUserRequestRestaurant(request.getLat(), request.getLon(),
                request.getRange(), type, name);

        log.info("검색된 식당 수: {}", response.size());

        return response;
    }

    /**
     * request의 유효성 검사를 진행합니다.
     * 작성자: 배서진
     *
     * @param request 위도, 경도, 범위 숫자 유효성 검사를 진행합니다.
     * @return RestaurantsList 객체
     */
    private RestaurantListRequest validateRequest(RestaurantListRequest request) {

        log.info("요청 유효성 검사: {}", request);

        // 1. 요청 객체가 null인지 확인
        if (request == null) {
            log.error("요청이 null입니다.");
            throw new CustomException(ErrorCode.NULL_REQUEST_DATA);
        }

        // 2. 위도(lat)와 경도(lon) 유효성 검사
        if (request.getLat() < -90 || request.getLat() > 90 ||
                request.getLon() < -180 || request.getLon() > 180) {
            log.error("잘못된 위도 또는 경도. 위도: {}, 경도: {}", request.getLat(), request.getLon());
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }

        // 3. 범위(range) 유효성 검사 (0 이하 값 체크)
        if (request.getRange() <= 0) {
            log.error("잘못된 범위: {}", request.getRange());
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }
        
        log.info("요청이 유효합니다.");
        return request;
    }

}
