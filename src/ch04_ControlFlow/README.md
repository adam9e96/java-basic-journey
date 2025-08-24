# CH04 제어문 (Control Flow)

조건문은 자바 프로그램의 실행 흐름을 조절할 수 있다.
조건에 따라 다른 코드를 실행하거나, 특정 코드를 반복해서 실행할 수 있다.
---
## 1. If 문
- 조건이 참(`true`)일 때만 실행되는 구문.
- 형식:
  ```java
  if (조건식) {
      // 실행문
  }

* 예시:

  ```java
  int score = 80;
  if (score >= 60) {
      System.out.println("합격");
  }
  ```

---

## 2. If-Else 문

* 조건이 참이면 if 블록, 거짓이면 else 블록 실행.
* 형식:

  ```java
  if (조건식) {
      // 조건이 true일 때 실행
  } else {
      // 조건이 false일 때 실행
  }
  ```
* 예시:

  ```java
  int score = 50;
  if (score >= 60) {
      System.out.println("합격");
  } else {
      System.out.println("불합격");
  }
  ```

---

## 3. If 중첩 (Nested If)

* if 문 안에 또 다른 if 문을 포함하여 조건을 세분화.
* 형식:

  ```java
  if (조건1) {
      if (조건2) {
          // 조건1 && 조건2가 true일 때 실행
      }
  }
  ```
* 예시:

  ```java
  int score = 85;
  if (score >= 60) {
      if (score >= 80) {
          System.out.println("우수");
      } else {
          System.out.println("보통");
      }
  } else {
      System.out.println("불합격");
  }
  ```

---

## 4. If-Else If 문

* 여러 조건을 순차적으로 검사.
* 형식:

  ```java
  if (조건1) {
      // 실행문1
  } else if (조건2) {
      // 실행문1false 이고 실행문2 true 일때
  } else {
      // 위 조건이 모두 false일 때 실행
  }
  ```
* 예시:

  ```java
  int score = 75;
  if (score >= 90) {
      System.out.println("A");
  } else if (score >= 80) {
      System.out.println("B");
  } else if (score >= 70) {
      System.out.println("C");
  } else {
      System.out.println("F");
  }
  ```

---

## 5. Switch 문

* 하나의 변수 값에 따라 실행 경로를 선택.
* 형식:

  ```java
  switch (변수) {
      case 값1:
          // 실행문
          break;
      case 값2:
          // 실행문
          break;
      default:
          // 위의 값과 일치하지 않을 때 실행
  }
  ```
* 특징:

    * `break`를 쓰지 않으면 **fall-through** 현상 발생 (다음 case 실행).
    * `default`는 선택 사항.
* 예시:

  ```java
  int num = 2;
  switch (num) {
      case 1:
          System.out.println("One");
          break;
      case 2:
          System.out.println("Two");
          break;
      default:
          System.out.println("Other");
  }
  ```

---

## 요약

* **if 문** → 단일 조건 분기
* **if-else 문** → 조건이 참/거짓일 때 분기
* **nested if** → 조건을 중첩하여 세분화
* **if-else if** → 여러 조건을 순차적으로 검사
* **switch 문** → 값에 따라 다중 분기, `break` 사용 주의