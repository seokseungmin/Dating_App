<center><img src="/images/solrae.png" width="100%" height="100%"></center>

# 이앱설레 - 동계 프로젝트
 `팀원` : 석승민(팀장), 허우행, 이우진, 이창세, 임병준

## 프로젝트 정보

**프로젝트 명:** 이앱설레

**개발 기간:** 10주

## 프로젝트 소개

이앱설레는 동계 프로젝트로, 메인 슬라이딩 화면, 회원가입, 매칭 로직, 푸시 메시지 등 다양한 기능을 포함한 안드로이드 어플리케이션입니다. 10주 동안의 개발 기간 동안 각 주차별로 구현된 기능들이 담겨있습니다.

## 개발툴 / 사용언어

![Kotlin](https://skillicons.dev/icons?i=kotlin)
![Firebase](https://skillicons.dev/icons?i=firebase)
![Android Studio](https://skillicons.dev/icons?i=androidstudio)

- Kotlin: 안드로이드 앱 개발을 위한 현대적이고 안전한 프로그래밍 언어로, 간결하고 표현력이 뛰어난 코드를 작성할 수 있습니다.
- Firebase: 구글의 모바일 플랫폼으로, 실시간 데이터베이스, 백엔드 기능, 사용자 인증 등을 제공하여 앱 개발을 간소화합니다.
- Android Studio: 안드로이드 앱 개발을 위한 공식 통합 개발 환경(IDE)으로, Kotlin과 완벽하게 호환되며 다양한 개발 도구와 시뮬레이션 기능을 제공합니다.

## 기능 / 작업

- 메인 슬라이딩 화면 구현
- 회원가입 및 회원 정보 저장
- 매칭 로직 및 확인 로직 구현
- 사용자 간 직접 푸시 메시지 보내기
- 쪽지 보내기 및 채팅방 시스템 구현
- 로티 애니메이션을 활용한 화면 꾸미기

## 주차별 작업 내용

### 1주차

- Splash 화면 구현
- Intro 화면 구현
- CardStackView 구현

### 2주차

- Firebase를 이용한 회원가입 (Email, Password 받아오기)
- 로그인 및 로그아웃 구현
- 스플래시 화면, 인트로 화면 꾸미기
- 회원가입 화면 디자인

### 3주차

- 사용자 정보를 Database에 저장
- 사용자 정보 받아오기
- 핸드폰 Image 불러오기
- Mypage 만들기
- Image 저장하기

### 4주차

- 새로운 사용자 정보 넣기
- 나와 다른 성별의 사용자 불러오기
- 스와이프를 활용한 좋아요 표시하기
- 내가 좋아요 누른 사람이 나를 좋아요 눌렀는지 확인하기
- 매칭이 성사되면 Notification 띄우기

### 5주차

- 내가 좋아요 누른 사용자 정보 보기
- 내가 좋아요 누른 사용자들의 정보 불러오기
- 유저 ListView 만들기
- 유저 ListView 클릭 시 매칭된 회원인지 확인하기

### 6주차

- 토큰 받아와서 나에게 좋아요를 누른 사용자에게 메시지 보내기
- 토큰 정보 사용자 정보에 저장하기
- FCM 보내기
- 새로운 사용자 생성

### 7주차

- 라이브러리 추가
- Firebase 서비스에서 메시지 받기
- RetroFit 사용하기
- 다른 사람에게 Push 날리기
- Invalid 캐쉬 삭제하기

### 8주차

- ListView LongClick 구현
- Alert Dialog 추가
- Message 저장 및 불러오기 구현
- Push 메시지 전송 구현

### 9주차

- 채팅방 시스템 구현
- UI 꾸미기

### 10주차

- 테스트 작업 및 버그 수정

# 스플래시 화면, 인트로 화면, 스와이프 화면
<img src="/images/splash.png" width="30%" height="30%">&nbsp;&nbsp;&nbsp;
<img src="/images/intro.png" width="30%" height="30%">&nbsp;&nbsp;&nbsp;
<img src="/images/mainActivity.png" width="30%" height="30%">

# 회원 가입화면, 로그인 화면, 마이페이지 화면
<img src="/images/join.png" width="30%" height="30%">&nbsp;&nbsp;&nbsp;
<img src="/images/login.png" width="30%" height="30%">&nbsp;&nbsp;&nbsp;
<img src="/images/mypage.png" width="30%" height="30%">

# 메인 화면, 호감 리스트 화면, 쪽지 리스트 화면
<img src="/images/setting.png" width="30%" height="30%">&nbsp;&nbsp;&nbsp;
<img src="/images/hogam.png" width="30%" height="30%">&nbsp;&nbsp;&nbsp;
<img src="/images/letter.png" width="30%" height="30%">

# 메시지 보내기 화면, 채팅창 화면, 채팅 화면
<img src="/images/mylistlistdialog.png" width="30%" height="30%">&nbsp;&nbsp;&nbsp;
<img src="/images/mylikelistmsg.png" width="30%" height="30%">&nbsp;&nbsp;&nbsp;
<img src="/images/messagechat.png" width="30%" height="30%">

# 마무리
3학년 2학기 안드로이드 프로그래밍 수업(A+)을 듣고, 관심이 생겨 자바를 기반으로 진행했던 학교 수업과는 달리 동계 방학 동안은 코틀린을 공부하고 적용해보기 위해 프로젝트를 시작했습니다. 
강의를 통해 클론코딩을 진행하면서, 로티 애니메이션을 활용하여 화면을 다양하게 꾸몄습니다. 또한, 팀원들과의 원활한 의사소통을 통해 쪽지 시스템 대신 채팅방 시스템을 추가 구현하는 결정을 내리고 구글링을 통해 채팅방 시스템을 성공적으로 구축했습니다.

회원가입, 로그인, 로그아웃, 호감 매칭, 쪽지 시스템, 채팅방 시스템, 내 정보 보기 등 다양한 기능을 직접 구현하면서 프로그래밍에 대한 흥미를 높일 수 있었습니다. 
프로젝트 진행을 통해 얻은 경험은 안드로이드 앱 개발에 대한 실전적인 능력 향상뿐만 아니라 팀 협업 및 문제 해결 능력도 향상시킬 수 있는 기회가 되었습니다. 
이번 프로젝트를 통해 배운 것들을 향후의 개발 경험에도 적용하여 더욱 성장해 나가고 싶습니다.
