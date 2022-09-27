# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
1. Controller
    * 게임 플레이어에게 입력받은 숫자에 대한 결과를 응답하는 컨트롤러
    * 게임 재시작 or 종료 처리를 해주는 컨트롤러
2. 비지니스
    * 게임에 사용할 랜덤수를 발급하여 메모리에 보관하는 기능
    * 입력받은 숫자를 랜덤수와 비교하는 기능
         * 입력받은 숫자가 랜덤수에 포함되어있는지 확인하는 기능
         * 입력받은 숫자가 랜덤수에 동일한 위치에 존재하는지 확인하는 기능
         * 각각의 확인 결과물을 저장하는 기능
         * 최종 결과물을 문자열로 변환하여 반환하는 기
    * 입력받은 숫자에 대해서 유효성을 검사하는 기