# 🍽️ TastyTrack

> ## 🔍 목차
> 1. [서비스 소개](#-서비스-소개)
> 2. [R&R 및 주요 소스 코드](#-rr)
> 3. [프로젝트 일정](#-프로젝트-일정)
> 4. [프로젝트 환경](#%EF%B8%8F-프로젝트-환경)
> 5. [ERD](#%EF%B8%8F-erd)
> 6. [협업 및 커뮤니케이션](#%EF%B8%8F-협업-및-커뮤니케이션)
> 7. [Github Issue & Jira 를 통한 Task 트래킹 관리 (WBS)](#%EF%B8%8F%EF%B8%8F-github-issue--jira-를-통한-task-트래킹-관리-wbs)
> 8. [Discord 를 활용한 소통 및 PR 알림 봇](#-discord를-활용한-소통-및-pr-알림-봇)
> 9. [트러블 슈팅](#-트러블-슈팅)
> 10. [고민한 흔적](#-고민한-흔적)
> 11. [디렉토리 구조](#%EF%B8%8F-디렉토리-구조)

<br>

## 📋 서비스 소개
- 서울시 음식점 공공데이터를 활용하여 서울의 맛집 목록을 자동으로 업데이트하고, 이를 기반으로 서비스를 제공합니다. **사용자의 위치에 맞춰 맛집 및 메뉴를 추천**함으로써 다양한 음식을 더욱 풍부하게 경험할 수 있도록 돕고, 음식을 좋아하는 사람들 간의 소통과 공유를 지원하는 애플리케이션의 API 서버입니다.

- 🔗 **활용한 공공데이터** | [<a href="https://data.seoul.go.kr/dataList/OA-16094/S/1/datasetView.do">https://data.seoul.go.kr/</a>](https://data.seoul.go.kr/dataList/OA-16094/S/1/datasetView.do)

<br/>

## 🧑🏻‍💻 R&R
| 담당자                                      | 담당 업무                                                        |
|:-------------------------------------------:|------------------------------------------------------------------|
| [오예령](https://github.com/ohyeryung) | 사용자 기능 구현 (로그인, 회원가입, 회원정보 조회, 회원정보 수정)     |
| [**유리빛나**](https://github.com/ryuneng)       | **데이터 파이프라인 구축 (서울시 공공데이터 수집, 전처리, 저장, 자동화)** |
| [김은정](https://github.com/rladmswjd119)       | 맛집 조회 기능 구현 (상세 조회, 위치 기반 맛집 추천, 평가 생성)      |
| [배서진](https://github.com/bsjin1122)       | 맛집 조회 기능 구현 (목록 조회, 지역명 기준 맛집 추천, 시군구 조회), 디스코드 점심메뉴 추천  |

### 담당 업무 소스 코드
1. <a href="https://github.com/ryuneng/tasty-track/blob/dev/src/main/java/com/allclear/tastytrack/domain/batch/config/BatchConfig.java">Spring Batch 주요 소스 코드 보기</a>
2. <a href="https://github.com/ryuneng/tasty-track/blob/dev/src/main/java/com/allclear/tastytrack/domain/batch/service/RawDataService.java">공공데이터를 수집하고 저장하는 로직의 주요 소스 코드 보기</a>
3. <a href="https://github.com/ryuneng/tasty-track/blob/dev/src/main/java/com/allclear/tastytrack/domain/batch/config/ScheduleConfig.java">배치 작업 스케줄링 주요 소스 코드 보기</a>

<br>

## 🗓 프로젝트 일정
<img src="https://github.com/user-attachments/assets/04066110-4312-4a57-b1df-a065f3f987fc">

<br>
<br>

## 🛠️ 프로젝트 환경

| Stack                                                                                                        | Version           |
|:------------------------------------------------------------------------------------------------------------:|:-----------------:|
| ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) | Spring Boot 3.3.x |
| ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)    | Gradle 8.8       |
| ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)    | JDK 17           |
| ![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)       | MySQL 8.0        |
| ![Redis](https://img.shields.io/badge/redis-%23DD0031.svg?style=for-the-badge&logo=redis&logoColor=white)    | Redis 6.0        |


<br>

## ⛓️ ERD
<img src="https://github.com/user-attachments/assets/feca69c7-e72e-4e58-8c41-dbdc79d8026b" width="80%">

<br>
<br>

## 🗣️ 협업 및 커뮤니케이션 

<details>
<summary>문서화 작업</summary>
<div markdown="1">
    <div>
        <h4>☑️ 1) 회의록</h4>
        <img src="https://github.com/user-attachments/assets/c0cf185c-6c8d-4d0d-94ed-a208d02d3f66" align="center" width="60%">
    </div><br>
    <div>
        <h4>☑️ 2) 개인 Daily TODO</h4>
        <img src="https://github.com/user-attachments/assets/af8b2113-4979-4064-ae7f-5acc74f5c003" align="center" width="60%">
    </div><br>
    <div>
        <h4>☑️ 3) 전체 TODO</h4>
        <img src="https://github.com/user-attachments/assets/b4b6f352-93a7-4a9d-8491-375868d2f0c6" align="center" width="60%">
    </div><br>
</div>
</details>

<br/>

## 🏃‍♀️‍➡️ Github Issue & Jira 를 통한 Task 트래킹 관리 (WBS) 

<details>
<summary>개발일정 관리</summary>
<div markdown="1">
    <div>
        <img width="30%" alt="image" src="https://github.com/user-attachments/assets/c8b56429-8c3a-4a7a-a474-39ba7d759255">
        <h4>☑️ 1) Github Issues</h4>
        <img src="https://github.com/user-attachments/assets/718d4ca2-0059-4c69-a89e-b697dbdb0801" align="center" width="70%">
    </div><br>
    <div>
        <h4>☑️ 2) Jira</h4>
        <img src="https://github.com/user-attachments/assets/cf2789be-c2aa-46da-aa16-948f6a73807e" align="center" width="70%">
    </div><br>
</div>
</details>

<br/>

## 🤖 Discord를 활용한 소통 및 PR 알림 봇 

<details>
<summary>소통 및 PR 알림 확인</summary>
<div markdown="1">
    <img src="https://github.com/user-attachments/assets/9a329b8b-bec5-4742-b32c-9073edf22f26">
    <img src="https://github.com/user-attachments/assets/1c5c0cc7-102b-4924-b0b4-2ba4bd5150e6" alt="Alt text" width="430" height="600"/>
</div>
</details>

<br>
<br>

## 💥 트러블 슈팅
- 원본 데이터를 가공 데이터에 저장하는 과정에서 발생한 6가지 주소 관련 문제 - <a href="https://github.com/ryuneng/tasty-track/wiki/%EC%9B%90%EB%B3%B8-%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%A5%BC-%EA%B0%80%EA%B3%B5-%EB%8D%B0%EC%9D%B4%ED%84%B0%EC%97%90-%EC%A0%80%EC%9E%A5%ED%95%98%EB%8A%94-%EA%B3%BC%EC%A0%95%EC%97%90%EC%84%9C-%EB%B0%9C%EC%83%9D%ED%95%9C-6%EA%B0%80%EC%A7%80-%EC%A3%BC%EC%86%8C-%EA%B4%80%EB%A0%A8-%EB%AC%B8%EC%A0%9C"> WIKI 이동 </a>
- Spring Batch 구현 중에 발생한 오류 - <a href="https://github.com/ryuneng/tasty-track/wiki/Spring-Batch-%EA%B5%AC%ED%98%84-%EC%A4%91%EC%97%90-%EB%B0%9C%EC%83%9D%ED%95%9C-%EC%98%A4%EB%A5%98"> WIKI 이동 </a>
- Docker 실행 과정에서 발생한 오류 - <a href="https://github.com/ryuneng/tasty-track/wiki/Docker-%EC%8B%A4%ED%96%89-%EA%B3%BC%EC%A0%95%EC%97%90%EC%84%9C-%EB%B0%9C%EC%83%9D%ED%95%9C-%EC%98%A4%EB%A5%98"> WIKI 이동 </a>

<br>

## 🤔 고민한 흔적
- Spring Batch를 도입한 이유 - <a href="https://github.com/ryuneng/tasty-track/wiki/Spring-Batch%EB%A5%BC-%EB%8F%84%EC%9E%85%ED%95%9C-%EC%9D%B4%EC%9C%A0"> WIKI 이동 </a>
- Entity 클래스의 PK 필드 타입 (Long vs int) - <a href="https://github.com/ryuneng/tasty-track/wiki/Entity-%ED%81%B4%EB%9E%98%EC%8A%A4%EC%9D%98-PK-%ED%95%84%EB%93%9C-%ED%83%80%EC%9E%85-(Long-vs-int)"> WIKI 이동 </a>
- 위도, 경도의 데이터 타입 (Double vs Decimal) - <a href="https://github.com/ryuneng/tasty-track/wiki/%EC%9C%84%EB%8F%84,-%EA%B2%BD%EB%8F%84%EC%9D%98-%EB%8D%B0%EC%9D%B4%ED%84%B0-%ED%83%80%EC%9E%85-(Double-vs-Decimal)"> WIKI 이동 </a>
 
<br>

## 🗂️ 디렉토리 구조
<details><summary>직관적인 구조 파악과 관리를 위해 <b>도메인형 구조</b>를 채택하였습니다.</summary>

<h3>🗂️ 전체 구조</h3>
    
```text
    Folder PATH listing
Volume serial number is D6B6-EE51
C:.
│   .env
│   .gitignore
│   .gitmessage.txt
│   build.gradle
│   docker-compose.yml
│   Dockerfile
│   gradlew
│   gradlew.bat
│   README.md
│   settings.gradle
│   structure.txt
│   
├───.github
│   │   PULL_REQUEST_TEMPLATE.md
│   ├───ISSUE_TEMPLATE
│   │       issue_form.yml
│   └───workflows
│           create-jira-issue.yml
├───.gradle
│
├───build
├───gradle
│   └───wrapper
│           gradle-wrapper.jar
│           gradle-wrapper.properties
└───src
    ├───main
    │   ├───java
    │   │   └───com
    │   │       └───allclear
    │   │           └───tastytrack
    │   │               │   TastytrackApplication.java
    │   │               │   
    │   │               ├───domain
    │   │               │   ├───auth
    │   │               │   │   └───token
    │   │               │   ├───region
    │   │               │   │   ├───controller
    │   │               │   │   ├───dto
    │   │               │   │   ├───entity
    │   │               │   │   ├───repository
    │   │               │   │   └───service
    │   │               │   │           
    │   │               │   ├───restaurant
    │   │               │   │   ├───controller
    │   │               │   │   ├───coordinate
    │   │               │   │   │   ├───dto
    │   │               │   │   │   └───service
    │   │               │   │   ├───dto
    │   │               │   │   ├───entity
    │   │               │   │   ├───repository
    │   │               │   │   └───service
    │   │               │   ├───review
    │   │               │   │   ├───controller
    │   │               │   │   ├───dto
    │   │               │   │   ├───entity
    │   │               │   │   ├───repository
    │   │               │   │   └───service
    │   │               │   └───user
    │   │               │       ├───controller
    │   │               │       ├───dto
    │   │               │       ├───entity
    │   │               │       ├───repository
    │   │               │       └───service
    │   │               │               
    │   │               └───global
    │   │                   ├───config
    │   │                   ├───domain
    │   │                   ├───entity
    │   │                   └───exception
    │   │                       └───handler
    │   └───resources
    │       │   application.yml
    │       └───db
    │               region.sql
    └───test
        └───java
            └───com
                └───allclear
                    └───tastytrack
                        │   TastytrackApplicationTests.java
                        ├───domain
                        │   ├───region
                        │   │   └───service
                        │   │           RegionServiceImplTest.java
                        │   └───user
                        │       ├───controller
                        │       │       UserControllerTest.java
                        │       └───service
                        │               TokenVerifyTest.java
                        │               UserServiceImplTest.java
                        ├───reivew
                        │       ReviewControllerTest.java
                        │       ReviewServiceImplTest.java
                        └───restaurant
                                RestaurantControllerTest.java
                                RestaurantServiceImplTest.java                                

```

<br>

<h3>📂 상세 구조</h3>

```text
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂allclear
 ┃ ┃ ┃ ┃ ┗ 📂tastytrack
 ┃ ┃ ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂auth
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂token
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JwtTokenUtils.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RefreshToken.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RefreshTokenCleanupScheduler.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RefreshTokenManager.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RefreshTokenRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TokenProvider.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JwtAuthenticationFilter.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserAuth.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserAuthImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserDetailsImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserDetailsServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂region
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RegionController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RegionGroupResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RegionResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Region.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RegionRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RegionService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RegionServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂restaurant
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RestaurantController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂coordinate
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Coordinate.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CoordinateAddress.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CoordinateMeta.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CoordinateResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CoordinateRoadAddress.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Documents.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CoordinateService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜CoordinateServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LocalData.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LocalDataResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RawRestaurantResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RestaurantDetail.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RestaurantListRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RestaurantSearch.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Result.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RawRestaurant.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Restaurant.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RawRestaurantRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RestaurantRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜DataProcessingService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RawDataService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RestaurantService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RestaurantServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂review
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ReviewController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ReviewRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ReviewResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Review.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ReviewRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ReviewService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ReviewServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂user
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜TokenController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜LoginRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserCreateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserInfo.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserLocationInfo.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserUpdateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜User.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜UserService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserServiceImpl.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂global
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜JpaConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜SwaggerConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜WebSecurityConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂entity
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Timestamped.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂exception
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂handler
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RestApiExceptionHandler.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ErrorCode.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ErrorResponse.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜TastytrackApplication.java
 ┃ ┗ 📂resources
 ┃ ┃ ┣ 📂db
 ┃ ┃ ┃ ┗ 📜region.sql
 ┃ ┃ ┗ 📜application.yml
 ┗ 📂test
 ┃ ┗ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂allclear
 ┃ ┃ ┃ ┃ ┗ 📂tastytrack
 ┃ ┃ ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂region
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RegionServiceImplTest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂user
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserControllerTest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜TokenVerifyTest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜UserServiceImplTest.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂reivew
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ReviewControllerTest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ReviewServiceImplTest.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂restaurant
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜RestaurantControllerTest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜RestaurantServiceImplTest.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜TastytrackApplicationTests.java
```
</details>
