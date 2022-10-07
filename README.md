# 자동차 경주 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


----

## 기능 목록

- 레이싱 게임
    - 경주 초기화
    - 경주 시작
    - 경주 진행중
    - 경주 종료
- 클라이언트
    - 자동차 이름 입력 (n 개)
        - 쉼표 구분
        - 5자 이하
    - 자동차 이동 횟수 입력
- Util
    - Random 생성
        - 0 ~ 9 사이
- 자동차
    - 초기화
        - 이름 (String -> CarName) -> 모든 원시값과 문자열을 포장
            - CarName : 유효성 검증(5자 이하)
        - 위치 = 0
    - 이동 (인자값 : int -> AccelPower(악셀 밟는 힘)) -> 모든 원시값과 문자열을 포장
        - 정지 (0~3)
        - 전진 (4~9)
    - 위치 출력
        - 이름 + 위치 (ex. pobi : ---)
- 자동차 목록 (일급 컬렉션)
    - 속성 : List<Car> cars
    - 전체 자동차 위치 출력 (인자값 : List<Car>)
    - 최장거리 이동 자동차 목록 조회