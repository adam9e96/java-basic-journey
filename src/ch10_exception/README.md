# ch09 예외 (Exception)

## 1. 예외란?

* **프로그램 실행 중 발생하는 오류**를 처리하기 위한 객체 기반 메커니즘.
* 예외가 발생하면 프로그램이 강제 종료될 수 있으므로, 예외 처리를 통해 안정성을 높인다.

---

## 2. 예외의 종류

### (1) `Error`

* 시스템 레벨 오류 (메모리 부족 등).
* 개발자가 처리 불가, 예외 처리 코드 작성 불필요.

### (2) `Exception`

* 개발자가 처리할 수 있는 실행 중 오류.
* 다시 두 가지로 나뉜다:

    * **Checked Exception**

        * 컴파일 시점에 예외 처리 여부를 검사.
        * 반드시 `try-catch` 또는 `throws`로 처리해야 함.
        * 예: `IOException`, `SQLException`
    * **Unchecked Exception (Runtime Exception)**

        * 실행 중 발생.
        * 명시적 예외 처리 강제되지 않음.
        * 예: `NullPointerException`, `ArrayIndexOutOfBoundsException`

---

## 3. 예외 처리 방법

### (1) `try-catch` 구문

```java
try {
    // 예외 발생 가능 코드
} catch (ExceptionType e) {
    // 예외 처리 코드
}
```

### (2) `try-catch-finally`

```java
try {
    // 예외 발생 가능 코드
} catch (ExceptionType e) {
    // 예외 처리 코드
} finally {
    // 예외 발생 여부와 관계없이 항상 실행됨
}
```

### (3) `throws` 키워드

```java
public void readFile() throws IOException {
    // IOException 발생 가능 코드
}
```

### (4) `throw` 키워드

* 직접 예외 객체를 발생시킬 때 사용.

```java
throw new IllegalArgumentException("잘못된 값입니다.");
```

---

## 4. 예외 처리 흐름

1. 예외 발생 → JVM이 해당 예외 객체 생성
2. 가장 가까운 `catch` 블록 탐색
3. 해당 타입이 일치하거나 상위 클래스라면 처리
4. 없으면 상위 메소드로 예외 전파
5. 최종적으로 `main`까지 전달되면 프로그램 종료

---

## 5. 다중 `catch`

* 여러 예외를 순차적으로 처리 가능.

```java
try {
    int[] arr = new int[2];
    arr[5] = 10; // 예외 발생
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("인덱스 범위 초과");
} catch (Exception e) {
    System.out.println("그 외 예외");
}
```

---

## 6. 예외 클래스 계층

```
Throwable
 ├── Error
 └── Exception
      ├── IOException
      ├── SQLException
      └── RuntimeException
           ├── NullPointerException
           ├── ArithmeticException
           ├── ArrayIndexOutOfBoundsException
           └── ClassCastException
```

---

## 7. 사용자 정의 예외

* `Exception` 또는 `RuntimeException` 상속받아 구현.

```java
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}
```

사용 예:

```java
public void test(int num) throws MyException {
    if (num < 0) {
        throw new MyException("음수는 허용되지 않습니다.");
    }
}
```

---

## 8. 예외 처리 사용법

* 구체적인 예외부터 먼저 처리.
* `catch (Exception e)`는 마지막에 배치.
* 불필요한 예외 무시하지 말고, 로그 기록.
* Checked Exception은 반드시 처리.
* 필요하면 사용자 정의 예외를 만들어 의미 전달.