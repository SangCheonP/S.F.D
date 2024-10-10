# S.F.D (Smart Factory Detector)

## 💡 UCC

![UCC](./README_ASSETS/logo.gif)

## 🚩 목차

1. 기획 배경
2. 서비스 소개
3. 기능 소개
4. 기술 스택
5. 프로젝트 일정 및 기타 산출물
6. 팀원 소개 및 소감

## ✨ 기획 배경

### 개요

- 한 줄 설명 : 도메인 제한없이 스마트팩토리 공정 프로세스에서 불량품을 탐지하는 프로젝트
- 서비스명 : **S.F.D**

### 목적

- 다양한 도메인을 **한 곳에서**
- 불량품의 불량 **구별**까지
- 대시보드를 통한 **실시간** 상황 파악과 **불량 통계**
- 관리자 페이지를 통한 **보안**
- 시제품을 통한 실제 현업 프로세스를 체험

### 현 상황

- 치열한 경쟁 속에서 살아남기 위한 선택이 아닌 필수 [('선택' 아닌 '필수' 스마트팩토리)①단순 자동화 그 이상 '스마트팩토리'](https://www.newstomato.com/ReadNews.aspx?no=1241653)
- 위험/복잡한 작업 사람대신 기계가 작업 [위험·복잡한 작업 '뚝딱'‥진화하는 스마트팩토리](https://imnews.imbc.com/replay/2024/nw1700/article/6619754_36500.html)

## ✨ 서비스 소개

### 페르소나

- 제조업 현장에서 품질 관리를 담당하는 **문범수**씨
  - **실시간 불량 모니터링**: 생산 라인의 실시간 데이터를 통해 현재 불량률을 지속적으로 확인하고 싶어 한다.
  - **자동 불량 탐지**: 다양한 제품과 공정에서 발생하는 불량을 AI 기반 시스템이 자동으로 탐지하고 싶어 한다.
  - **문제 공유 및 협업**: 불량 사례를 팀원들과 쉽게 공유하고, 공동으로 문제를 분석하여 해결 방안을 모색할 기반이 필요하다.
  - **데이터 기반 의사 결정**: 축적된 데이터를 바탕으로 품질 관리 전략을 최적화하고, 생산 효율성을 높일 수 있는 인사이트를 얻고 싶어 한다.
  - **사용자 친화적 인터페이스**: 직관적인 대시보드와 사용자 인터페이스를 통해 복잡한 데이터를 쉽게 이해하고 활용하고 싶어 한다.
  - **지속적인 학습 및 개선**: AI 모델이 지속적으로 학습하여 새로운 불량 패턴을 인식하고, 품질 관리 능력을 향상시키고 싶어한다.

### 기대효과

- 실시간 모니터링과 자동화된 불량 탐지를 통해 **생산 효율성 향상**
- AI을 통해 다양한 패턴의 불량을 정확하게 식별함으로써, **불량률 낮춤**
- 축적된 생산 데이터를 분석하여 품질 관리 전략을 최적화하고, **더 나은 의사 결정**을 내릴 수 있음
- 도메인에 구애받지 않고 다양한 산업 환경에서 적용 가능한 통합된 불량 탐지 모델을 제공하여, **여러 제조업체의 요구를 충족**

## ✨ 기능 소개

- **품목 선택**
  - **불량 검사하기** : 품목을 선택하고 불량을 검사할 수 있습니다. 현재 너트 항목에 대한 검사만 가능합니다. 검사 시 불량 검출 페이지로 이동합니다.
  - **검사 진행** : 탐지 모델, 분류 모델, 불량 원인 탐지 모델 3가지 모델이 유기적으로 연결되어 불량 탐지 프로세스를 진행합니다.

- **불량 검출** 
  - **실시간 불량 탐지** : 현재 수행 중인 검사 중 가장 최신의 불량이 나타납니다. 하단에 지금까지 탐지된 불량과 불량 유형의 정보 테이블을 제시해줍니다.
  - **시간당 불량 개수 통계** : 탐지 시간에 따른 불량 개수 통계 정보를 제공합니다.
  - **불량 종류 통계** : 불량 종류에 대한 통계 정보를 제공합니다.

- **전체 기록 조회**
  - **총 불량 개수 통계** : 불량 종류에 대한 총 불량 개수 통계를 제공합니다.
  - **날짜 당 불량 개수 통계** : 선택 날짜 포함 이전 5일 간의 일일 불량 개수에 대한 정보를 제공합니다.
  - **불량 사진 탐색** : 선택된 날짜의 불량 정보를 제공합니다. 불량 정보를 클릭하면 해당 사진과 정보를 제공합니다.

- **회원가입 & 로그인**
  - **회원가입** : 이메일, 비밀번호, 전화번호, 닉네임 입력 후 가입할 수 있습니다. 기존에 가입한 이메일은 사용할 수 없습니다.
  - **로그인 & 로그아웃** : JWT Token을 사용하여 로그인 및 로그아웃이 가능합니다.
  - **회원정보** : 내 정보를 제공합니다.

## ✨ 기술 스택

- **프론트엔드** : React, TypeScript, Vite, Tailwind, React Context, react-datepicker, SSE
- **백엔드** : Spring, Spring Security, JWT, JPA, SSE
- **인프라** : Docker, Nginx, Jenkins, MySQL, Certbot, EC2
- **AI** : 
  - 탐지 : YoloV5(최종 선정), Yoloworld
  - 분류 : MobileNetV3(최종 선정), Inception-ResNet-v2, DenseNet128, Resnet, MobileNetV4
  - 분석 : YoloV8(최종 선정), Swin-transformer, Swin-Detr
- **HW** : YoloV5(객체 탐지), Arduino, S3
- **이슈 관리** : Git Lab, JIRA, Mattermost, Notion

## ✨ 아키텍처 설계도

![architecture](./README_ASSETS/architecture.png)

## ✨ 프로젝트 일정 및 기타 산출물

### 프로젝트 일정

**전체 일정** : 2024.08.16 ~ 2024.10.11(총 55일)

- **기획** : 2024.08.16 ~ 2024.08.30(총 14일)
- **개발** : 2024.09.01 ~ 2024.10.11(총 41일)

### Git Flow

![git_flow](./README_ASSETS/git_flow.gif)

### 기능 명세서

![functional_specification1](./README_ASSETS/functional_specification1.png)
![functional_specification2](./README_ASSETS/functional_specification2.png)

### Use Case
![use_case](./README_ASSETS/use_case.png)

### 피그마 화면 정의서

![figma](./README_ASSETS/figma.PNG)

### ERD

![ERD](./README_ASSETS/erd.png)

### API 명세서

![api1](./README_ASSETS/RecordAPI.PNG)  
![api2](./README_ASSETS/ScannerAPI.PNG)  
![api3](./README_ASSETS/API3.PNG)  
![api4](./README_ASSETS/UserAPI.PNG)  
![api5](./README_ASSETS/AdminAPI.PNG)  
![api6](./README_ASSETS/SSEAPI.PNG)

## ✨ HW

<table>
  <tr>
    <td colspan="2" align="center">
      <img src="./README_ASSETS/hw.gif" width="500px">
    </td>
  </tr>
  <tr>
    <td><img src="./README_ASSETS/hw1.png" width="300px"></td>
    <td><img src="./README_ASSETS/hw2.jpg" width="300px"></td>
  </tr>
  <tr>
    <td><img src="./README_ASSETS/hw3.jpg" width="300px"></td>
    <td><img src="./README_ASSETS/hw4.jpg" width="300px"></td>
  </tr>
</table>

## ✨ 화면

| ![시작 페이지](./README_ASSETS/start.PNG) | ![로그인](./README_ASSETS/login.PNG) | ![회원가입](./README_ASSETS/register.PNG) |
|:----------------------------------------:|:------------------------------------:|:----------------------------------------:|
|              시작 페이지                |               로그인                |               회원가입                 |
| ![품목 선택](./README_ASSETS/select.PNG) | ![불량 검출](./README_ASSETS/detect.PNG) | ![전체 기록 조회](./README_ASSETS/log.PNG) |
|              품목 선택                 |               불량 검출              |               전체 기록 조회            |
| ![회원 정보](./README_ASSETS/user_info.PNG) |                                |                                        |
|              회원 정보                 |                                      |                                        |



## ✨ 소감

|                      이름                      |      역할       | 소감                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| :--------------------------------------------: | :-------------: | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
|  ![문범수](./README_ASSETS/mbs.png)<br>문범수  |    팀장(BE)     | 첫 프로젝트 팀장으로서 진행에 있어서 많은 부족함이 있었지만 잘 따라와준 팀원들에게 고맙고, 그 어느 팀들보다 자기주도적으로 열심히 참여한 팀이라고 자부합니다.
프로젝트 설정부터 DB설계, 보안 설정 등 백엔드와 관련한 모든 사항에 대해서 기획부터 설계를 담당할 수 있어 좋았습니다.<br> 특히 JPA와 Security, JWT 등 기초적인 보안 파트와 DB 로직 설계에 대해 역량을 기를 수 있었고, SSE를 활용한 실시간 통신을 구현했습니다.<br> 다음 기회에는 저장 데이터를 빠르고 안정적이게 업데이트 할 수 있는 방식에 대해 학습하고자 합니다.                                                                                                                    |
| ![김예현](./README_ASSETS/kyh.png) <br> 김예현 |     FE     | Figma부터 리액트 코드까지 전반적인 부분들을 처음으로 대표로 맡게 되어 디자인, 코드 부분에 있어서 부담스럽고 긴장이 되었습니다. <br> 하지만 걱정했던 부분에서 팀원분들이 괜찮다고 해주셔서 조금 자신감을 얻어서 작업을 차근차근 진행할 수 있었고 구현하기 원했던 기능들을 완성할 수 있었습니다. <br> 다른 부분을 걱정하지 않고 Front End 부분에 집중할 수 있도록 해준 팀원분들께 감사드립니다...!                                                                                                                                        |
| ![박상천](./README_ASSETS/psc.png) <br>박상천  | 인프라, AI | 이번 프로젝트에서 AI 실시간 처리 공정에 맞는 인프라 환경을 구축하며, 도메인의 특성에 따라 인프라 구조가 달라진다는 중요한 교훈을 얻었습니다.<br> 또한, SSE를 통해 실시간 분석 결과를 클라이언트로 전송하는 과정에서 발생한 오류를 해결하며 Nginx의 buffering 기능을 알게 되었고, 기술을 사용할 때는 그 기술에 대한 깊은 이해가 필요하다는 점을 다시 한 번 느꼈습니다.<br><br> AI라는 새로운 분야에 도전하면서, 모델의 정확도를 높이기 위해 배치 사이즈, 에폭, 학습률, 전이 학습, 모델 수정 등을 직접 조정하며 AI의 기초 지식과 역량을 쌓을 수 있었습니다.<br> 이 경험은 향후 AI가 포함된 프로젝트를 진행할 때 프로젝트의 전반적인 이해도를 높이는 데 큰 도움이 될 것이라고 생각합니다.<br><br> 비록 여러 오류와 새로운 분야에서의 도전이 쉽지 않았지만, 팀원들과의 소통과 협업을 통해 문제를 해결하며 좋은 결과물을 만들어낼 수 있었습니다.<br> 이번 프로젝트를 통해 개발자로서 한 단계 성장하는 소중한 기회가 되었습니다. |
| ![김진기](./README_ASSETS/kjg.png) <br> 김진기 |     AI      | 이번 프로젝트에서는 스마트 팩토리에서 사용할 수 있는 불량 탐지 시스템 개발에 중점을 두었습니다. <br> 목표는 다양한 제품에서 불량을 실시간으로 높은 정확도로 탐지하고 분석할 수 있는 시스템을 구축하는 것이었습니다. <br> 탐지 단계에서는 YoloV5 모델을 활용해 실시간 성능과 정확도에서 우수한 결과를 얻었으며, 이를 통해 실제로 발생할 수 있는 제품의 불량을 빠르게 탐지할 수 있었습니다. <br> 불량 분류 단계에서는 MobileNetV3를 적용해 속도와 정확도를 균형 있게 유지할 수 있었습니다. <br> 이후, 분석 단계에서는 YoloV8 모델을 사용해 더욱 세밀한 결함을 찾아내는 성능을 강화했습니다.<br><br> 이 과정에서 InceptionV5, DenseNet128, MobileNetV4, Swin Transformer, Swin Detr 등 다양한 AI 모델들을 실험하며 최적의 성능을 탐구했습니다.<br> 실제 데이터셋 처리와 라벨링 작업 등 실무에서 필요한 여러 과정들을 거쳐 시스템을 구축할 수 있었고, 데이터셋이 부족한 상황에 대비한 분석 방법도 모색했습니다.<br><br> 이번 프로젝트를 통해 스마트 팩토리 내 불량 탐지 시스템 개발에 대한 깊은 이해와 경험을 쌓을 수 있었고, 각 모델의 특성을 비교하며 프로젝트 요구 사항에 적합한 최적의 솔루션을 도출하는 데 성공했습니다.                                                                                                                                                           |
| ![복현우](./README_ASSETS/bhw.png) <br>복현우  |       AI        | 특화라는 이름에 걸맞게 AI 기술에 치중했던 프로젝트였습니다.<br>  패키지 버전 충돌, 기대 이하의 성능 등 AI를 다루는 데 있어 많은 어려움이 있었습니다.<br> 하지만 그 문제들을 해결하고 제어하여 결국 원하는 결과물을 만들어 내는 AI의 묘미를 느낄 수 있던 프로젝트였습니다.<br> 또 그 과정에서 GPU 서버와 프론트엔드, 백엔드의 소통 방식을 배우고 알아가는 재미를 느낄 수 있었습니다.<br>  이 프로젝트를 통해 AI 기술을 다루는 역량이 한 층 더 성장시킬 수 있어 좋았습니다.<br><br> 특화라는 이름에 걸맞게 AI 기술에 치중했던 프로젝트였습니다.<br>  패키지 버전 충돌, 기대 이하의 성능 등 AI를 다루는 데 있어 많은 어려움이 있었습니다.<br> 하지만 그 문제들을 해결하고 제어하여 결국 원하는 결과물을 만들어 내는 AI의 묘미를 느낄 수 있던 프로젝트였습니다.<br> 또 그 과정에서 GPU 서버와 프론트엔드, 백엔드의 소통 방식을 배우고 알아가는 재미를 느낄 수 있었습니다.<br>  이 프로젝트를 통해 AI 기술을 다루는 역량이 한 층 더 성장시킬 수 있어 좋았습니다.<br> |
| ![이동복](./README_ASSETS/ldb.png) <br>이동복  |       BE, HW        | 기존 팀의 사정으로 중간에 팀에 합류하게 되었는데, 팀원 분들이 많이 도와주셔서 미약하지만 조금이나마 기여를 할 수 있어 다행이었다고 생각합니다.<br> 한 달 남짓의 짧은 시간이었지만, 유능한 팀원들과 함께 프로젝트를 진행하며 많은 것을 배웠고, 덕분에 만족스러운 결과물이 나왔다고 생각합니다.<br>                                                                                                                                                                                                                                                              |
