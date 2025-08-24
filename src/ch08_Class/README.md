# Class (클래스)

클래스는 **객체(Object)** 를 만들기 위한 **설계도**나 **틀**이다.
객체의 **속성(필드, Field)** 과 **행동(메소드, Method)** 을 정의한다.

---

## 기본 클래스 구조

```java
public class ClassName {
    // 필드(멤버 변수)
    private String field1;
    private int field2;
    
    // 생성자 (Constructor)
    public ClassName() {
        // 기본 생성자
    }
    
    public ClassName(String field1, int field2) {
        // 매개변수가 있는 생성자
        this.field1 = field1;
        this.field2 = field2;
    }
    
    // 메서드
    public void method1() {
        // 메서드 구현
    }
    
    // Getter / Setter
    public String getField1() {
        return field1;
    }
    
    public void setField1(String field1) {
        this.field1 = field1;
    }
}
```

---

## 접근 제어자 (Access Modifier)

| 접근 제어자      | 같은 클래스 | 같은 패키지 | 하위 클래스 | 다른 패키지 |
| ----------- | ------ | ------ | ------ | ------ |
| public      | ✓      | ✓      | ✓      | ✓      |
| protected   | ✓      | ✓      | ✓      | ✗      |
| default(\*) | ✓      | ✓      | ✗      | ✗      |
| private     | ✓      | ✗      | ✗      | ✗      |

> `default` 는 별도의 키워드를 쓰지 않은 경우를 의미한다.

---

## 객체 생성 및 사용

```java
public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();
        
        // 메서드 호출
        myCar.power();
        myCar.speedUp();
    }
}
```

---

## 필드 (Field) 선언과 사용

* **필드(Field)** 는 객체의 데이터를 저장하는 역할을 한다.
* 선언 방법은 변수와 같지만, **클래스 블록 내부**에서 선언되어야 한다.

```java
타입 필드명 [ = 초기값];
```

### 필드 vs 로컬 변수 차이점

| 구분    | 필드(Field)       | 로컬 변수(Local Variable) |
| ----- | --------------- | --------------------- |
| 선언 위치 | 클래스 블록 내부       | 생성자, 메서드 블록 내부        |
| 존재 위치 | 객체 내부에 존재       | 생성자/메서드 호출 시에만 존재     |
| 사용 범위 | 객체 내/외부에서 접근 가능 | 해당 블록 내부에서만 사용 가능     |

* **필드** 는 객체 생성 시 **자동으로 기본값 초기화**

    * 숫자형: `0`, `0.0`
    * boolean: `false`
    * 참조형(배열, 클래스): `null`

* **로컬 변수** 는 반드시 **직접 초기화** 후 사용해야 한다.

---

## this 키워드

* `this` 는 **현재 객체 자신**을 참조한다.
* 주로 **필드와 매개변수 이름이 동일할 때 구분**하는 용도로 사용한다.

```java
class Student {
    private String name;

    public Student(String name) {
        this.name = name; // this.name은 필드, name은 매개변수
    }
}
```

---

## 메서드 오버로딩 (Method Overloading)

* 같은 이름의 메서드를 **매개변수의 타입, 개수**를 달리하여 여러 개 정의 가능하다.
* 코드 재사용성과 가독성을 높인다.

```java
class MathUtil {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

## **정리**
* 클래스 = 객체 설계도
* 필드 = 객체 속성, 메서드 = 객체 기능
* 생성자와 `this` 키워드로 객체 초기화
* 메서드 오버로딩으로 유연한 메서드 정의
* 접근 제어자를 통해 정보 은닉(캡슐화) 가능
