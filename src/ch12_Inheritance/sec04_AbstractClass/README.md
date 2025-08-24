# ch09 Abstract Class (추상 클래스)

추상 클래스는 **객체를 직접 생성할 수 없는 클래스**로,  
상속을 통해서만 사용되며 공통된 속성과 기능을 정의하고 **구현을 강제**할 수 있다.

---

## 1. 추상 클래스 정의

- `abstract` 키워드를 사용하여 선언한다.
- **추상 메소드(abstract method)** 를 포함할 수 있다.
- **일반 메소드와 필드**도 가질 수 있다.
- 직접 인스턴스 생성 불가 → 반드시 **상속받은 서브클래스에서 구현**해야 한다.

```java
public abstract class Animal {
    // 필드
    String name;

    // 생성자
    public Animal(String name) {
        this.name = name;
    }

    // 일반 메소드
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // 추상 메소드 (구현 강제)
    public abstract void sound();
}
````

---

## 2. 추상 메소드

* 선언만 하고 **구현(몸체)이 없는 메소드**.
* 자식 클래스가 반드시 오버라이딩 해야 한다.

```java
public abstract void sound();
```

---

## 3. 상속과 구현

* 추상 클래스를 상속받은 **구체 클래스(Concrete Class)** 는
  모든 추상 메소드를 구현해야 인스턴스 생성 가능.
* 구현하지 않으면 그 클래스도 추상 클래스로 선언해야 한다.

```java
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Woof!");
    }
}

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says: Meow!");
    }
}
```

---

## 4. 사용 예시

```java
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Kitty");

        dog.eat();
        dog.sound();

        cat.eat();
        cat.sound();
    }
}
```

**출력 결과**

```
Buddy is eating.
Buddy says: Woof!
Kitty is eating.
Kitty says: Meow!
```

---

## 5. 특징 정리

* `abstract` 클래스는 **new로 직접 생성 불가**.
* **일반 메소드 + 추상 메소드** 혼합 가능.
* 생성자, 필드, static 메소드, final 메소드 모두 가질 수 있다.
* 다형성을 활용해 **공통 인터페이스** 제공 가능.
* 인터페이스와 달리 **상태(필드)와 구체 메소드**를 가질 수 있다.

---

## 6. 추상 클래스 vs 인터페이스

| 구분    | 추상 클래스                  | 인터페이스                          |
| ----- | ----------------------- | ------------------------------ |
| 다중 상속 | 불가능 (단일 상속만 가능)         | 가능 (여러 개 구현 가능)                |
| 필드    | 가질 수 있음 (일반/상수 모두)      | `public static final` 상수만 가능   |
| 메소드   | 일반 메소드 + 추상 메소드 모두 가능   | `default`, `static`, 추상 메소드 가능 |
| 생성자   | 가질 수 있음                 | 가질 수 없음                        |
| 목적    | **공통 기능 제공 + 일부 강제 구현** | **행동 규약 정의**                   |

---

**요약**

* 추상 클래스는 **공통 속성 + 동작**을 정의하고,
  구체적인 동작은 자식 클래스에서 구현하도록 강제하는 클래스이다.
* **상속 관계에서 기본 골격 제공** 역할을 한다.