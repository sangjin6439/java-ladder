1. 참여할 사람 이름 입력 -> 조건 : 사람 최소 2명, 이름은 쉼표(,)로 구분, 이름 최대 5글자, 이름 빈칸 X
2. 사다리 게임 높이 입력 -> 조건 : 최소 높이 2이상, 높이 숫자만 입력
3. 사다리 게임 -> 조건 : 사람
4. 실행 결과: 사람 이름, 사다리 동시 출력, 사람 이름 5글자 맞춰서 출력, 라인 겹치지 않게 출력

- 모든 기능을 TDD로 구현해 단위 테스트가 존재해야 한다. 단, UI(System.out, System.in) 로직은 제외
    - 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    - UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
- 함수(또는 메서드)의 길이가 10라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메서드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- 배열 대신 컬렉션을 사용한다.
- Java Enum을 적용한다.
- 모든 원시 값과 문자열을 포장한다.
- 줄여 쓰지 않는다(축약 금지).
- 일급 컬렉션을 쓴다.


Merge된 후 회고: 
만족한 점:  자바8 이상부터 나오는 람다식,메서드 참조를 적극 활용했다. 일급 컬렉션과 enum을 잘 사용해서 코드를 작성한거 같다. 한 메서드에 한가지 책임을 맡게 잘 구현된거 같다.
아쉬운 점: Line클래스에서 createLine메서드 로직을 나만 이해할 수 있게 좋지 않은 코드를 작성했다. 다른사람이 내 코드를 보고 이해하기 쉬운 코드를 만드는 걸 항상 생각하고 코드를 짰어야 했는데 구현에만 힘썼던 거 같다. Test 코드 설명을 좀 더 명확하게 해야한다고 느꼈다.
