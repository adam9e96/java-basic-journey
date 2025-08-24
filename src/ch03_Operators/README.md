## ch03 연산자

### 1. Scanner (입력)
- `Scanner` 클래스를 사용하여 사용자로부터 입력을 받을 수 있다.
- 주요 메서드:
  - `nextInt()`: 정수 입력
  - `nextDouble()`: 실수 입력
  - `nextLine()`: 문자열 입력
- 예시:
  ```java
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();

---

### 2. Arithmetic Operator (산술 연산자)

* 기본적인 수학 연산을 수행.
* `+`, `-`, `*`, `/`, `%`
* `%` 는 나머지를 구하는 연산자.
* 예시:

  ```java
  int a = 10, b = 3;
  System.out.println(a / b); // 3
  System.out.println(a % b); // 1
  ```

---

### 3. Inc/Dec Operator (증감 연산자)

* 변수 값을 1 증가(`++`) 또는 감소(`--`)시킨다.
* 전위/후위 차이:

    * `++a`: 먼저 증가 → 사용
    * `a++`: 사용 후 → 증가
* 예시:

  ```java
  int x = 5;
  System.out.println(++x); // 6
  System.out.println(x++); // 6 (출력 후 7)
  ```

---

### 4. Comparison Operator (비교 연산자)

* 두 값을 비교하여 **논리값(true/false)** 반환.
* `==`, `!=`, `<`, `>`, `<=`, `>=`
* 예시:

  ```java
  int a = 5, b = 10;
  System.out.println(a < b); // true
  ```

---

### 5. Logical Operator (논리 연산자)

* 논리식을 연결하거나 부정할 때 사용.
* `&&` (AND), `||` (OR), `!` (NOT)
* 예시:

  ```java
  boolean result = (a > 0) && (b > 0);
  ```

---

### 6. Random (난수 생성)

* `Math.random()` 또는 `Random` 클래스 사용.
* 범위 조정:

  ```java
  int r = (int)(Math.random() * 6) + 1; // 1~6 주사위
  ```

---

### 7. Floating Point Operator (부동소수점 연산)

* 실수 타입(`float`, `double`) 연산 시 발생하는 **오차** 주의.
* 예시:

  ```java
  double d1 = 0.1;
  double d2 = 0.2;
  System.out.println(d1 + d2); // 0.30000000000000004
  ```

---

### 8. Ternary Operator (삼항 연산자)

* 조건식에 따라 결과 선택.
* 형식:

  ```java
  (조건식) ? 값1 : 값2
  ```
* 예시:

  ```java
  int score = 85;
  String result = (score >= 60) ? "합격" : "불합격";
  ```

---

### 정리
* 산술, 증감, 비교, 논리, 삼항 연산자는 **프로그래밍의 기본**.
* `Scanner`로 입력을 받아 다양한 연산자를 실습 가능.
* 부동소수점 연산과 난수 처리 시 주의가 필요하다.