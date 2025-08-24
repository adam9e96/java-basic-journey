# 업캐스팅(Upcasting) & 다운캐스팅(Downcasting)

자바에서 **상속(Inheritance)** 관계가 형성되면, 부모 클래스와 자식 클래스 간에 타입 변환이 발생할 수 있다.  
이때 중요한 개념이 **업캐스팅**과 **다운캐스팅**이다.

---

## 1. 업캐스팅 (Upcasting)

- **정의**: 자식 클래스 타입을 부모 클래스 타입으로 변환하는 것.
- **특징**:
  - **자동 형변환**(Implicit Casting) → 명시적 캐스팅 연산자 불필요.
  - 부모 클래스가 가진 멤버(필드, 메서드)만 접근 가능.
  - 오버라이딩된 메서드는 **다형성(Polymorphism)**에 의해 자식 클래스의 메서드가 실행됨.
- **형식**:
  ```java
  Parent p = new Child();   // 업캐스팅

* **예제**:

  ```java
  class Parent {
      void show() {
          System.out.println("Parent show()");
      }
  }

  class Child extends Parent {
      @Override
      void show() {
          System.out.println("Child show()");
      }
      void play() {
          System.out.println("Child play()");
      }
  }

  public class Main {
      public static void main(String[] args) {
          Parent p = new Child();  // 업캐스팅
          p.show();                // Child show() 실행 (오버라이딩 적용)
          // p.play();             // 컴파일 오류 (Parent에 정의되지 않음)
      }
  }
  ```

---

## 2. 다운캐스팅 (Downcasting)

* **정의**: 부모 클래스 타입을 자식 클래스 타입으로 변환하는 것.
* **특징**:

    * **명시적 캐스팅** 필요.
    * 자식 클래스가 가진 고유한 멤버에도 접근 가능.
    * **잘못된 다운캐스팅** 시 `ClassCastException` 발생.
* **형식**:

  ```java
  Child c = (Child) p;   // 다운캐스팅
  ```
* **예제**:

  ```java
  public class Main {
      public static void main(String[] args) {
          Parent p = new Child();     // 업캐스팅
          Child c = (Child) p;        // 다운캐스팅
          c.show();                   // Child show()
          c.play();                   // Child play()
      }
  }
  ```

---

## 3. 안전한 다운캐스팅 (`instanceof` 연산자)

* 다운캐스팅 전 **객체의 실제 타입**을 확인해야 안전하다.
* **예제**:

  ```java
  Parent p = new Parent();

  if (p instanceof Child) {
      Child c = (Child) p;
      c.play();
  } else {
      System.out.println("다운캐스팅 불가");
  }
  ```

---

## 4. 정리

| 구분       | 업캐스팅 (Upcasting)   | 다운캐스팅 (Downcasting)                            |
| -------- | ------------------ | ---------------------------------------------- |
| 변환 방향    | 자식 → 부모            | 부모 → 자식                                        |
| 캐스팅 여부   | 자동 (명시적 캐스팅 불필요)   | 명시적 캐스팅 필요                                     |
| 접근 가능 범위 | 부모 클래스의 멤버만 접근 가능  | 자식 클래스 멤버까지 접근 가능                              |
| 위험성      | 안전                 | `ClassCastException` 발생 가능 → instanceof로 확인 필요 |
| 활용 목적    | 다형성 구현, 코드의 유연성 확보 | 자식 클래스 고유 기능 사용                                |

