# 생성자(Constructor)

객체 지향 프로그래밍에서 **객체가 생성될 때 자동으로 호출되어 초기화를 담당하는 특별한 메서드**를 의미한다.
생성자는 클래스 이름과 동일해야 하며, 반환 타입을 가지지 않는다.

---

## 생성자 선언과 호출

* `new` 연산자는 객체를 생성한 후 생성자를 호출해서 객체를 초기화하는 역할을 한다.
* 생성자가 실행을 마치면 `new` 연산자는 객체의 **주소값(참조값)** 을 리턴한다.
* 이 주소는 변수에 대입되어 객체의 필드나 메소드 접근에 사용된다.

```java
클래스 변수 = new 클래스();
```

---

### 1. 기본 생성자 (Default Constructor)

* 클래스에 생성자를 작성하지 않으면, 컴파일러가 **매개변수 없는 생성자**를 자동으로 만들어준다.
* 이 생성자를 **기본 생성자**라고 한다.
* 명시적으로 선언한 생성자가 있으면 컴파일러는 기본생성자를 만들지 않음

```java
public class Car {
    // 기본 생성자가 자동으로 추가됨
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 기본 생성자 호출
    }
}
```

---

### 2. 생성자 오버로딩 (Constructor Overloading)

* 하나의 클래스에서 매개변수의 **개수나 타입이 다른 생성자를 여러 개 선언**할 수 있다.
* 상황에 맞게 다양한 방식으로 객체를 초기화할 수 있다.
* 같은 타입과 개수 선언된 순서가 같은 경우는 생정자 오버로딩이 아니다

```java
public class Car {
    String model;
    int year;

    // 기본 생성자
    public Car() {
        this.model = "미정";
        this.year = 0;
    }

    // 매개변수가 있는 생성자
    public Car(String model) {
        this.model = model;
        this.year = 0;
    }

    // 매개변수가 2개인 생성자
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("소나타");
        Car car3 = new Car("그랜저", 2024);
    }
}
```

---

### 3. 다른 생성자 호출 (`this()` 활용)

* 생성자 내부에서 `this()`를 사용하면 **같은 클래스의 다른 생성자**를 호출할 수 있다.
* 코드 중복을 줄이고, 공통 초기화를 한 곳에 모을 수 있다.
* 생성자 오버로딩이 많아질 경우 생성자 간 중복 코드를 많이 줄일 수 있음.
```java
public class Car {
    String model;
    int year;

    public Car() {
        this("미정", 0); // 다른 생성자 호출
    }

    public Car(String model) {
        this(model, 0); // 다른 생성자 호출
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
```

### 4. `this`로 필드 초기화

생성자의 매개변수 이름과 **필드 이름이 같을 때** 구분하기 위해 `this` 키워드를 사용한다.

* `this.필드명` → 객체의 필드
* `필드명` → 생성자의 매개변수

```java
public class Car {
    String model;
    int year;

    // 생성자
    public Car(String model, int year) {
        this.model = model; // this.model → 필드, model → 매개변수
        this.year = year;
    }

    public void printInfo() {
        System.out.println("모델: " + this.model + ", 연식: " + this.year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("아반떼", 2023);
        car.printInfo(); // 모델: 아반떼, 연식: 2023
    }
}
```

## `this` 키워드 정리

1. **`this.필드`** → 객체의 필드에 접근
2. **`this.메서드()`** → 객체 자신의 메서드 호출
3. **`this()`** → 같은 클래스의 다른 생성자 호출
`