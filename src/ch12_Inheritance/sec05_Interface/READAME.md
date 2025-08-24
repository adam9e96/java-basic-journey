# ch10 Interface (인터페이스)

인터페이스는 **클래스가 구현해야 할 규칙(규약)** 을 정의하는 일종의 설계도이다.  
추상 메서드, 상수, 기본 메서드(default), 정적 메서드(static)를 가질 수 있다.  
다중 상속을 지원하지 않는 자바에서 **다형성과 표준화**를 위해 사용된다.

---

## 인터페이스의 특징
- **추상 메서드**만 선언 가능 (JDK 8 이후: default / static 메서드 허용).
- 모든 메서드는 **public abstract** (생략 가능).
- 모든 변수는 **public static final 상수** (생략 가능).
- 클래스는 `implements` 키워드로 인터페이스를 구현.
- 다중 구현 가능 (클래스는 여러 인터페이스를 동시에 구현할 수 있음).
- 인터페이스끼리는 `extends`로 다중 상속 가능.

---

## 기본 문법

### 인터페이스 선언
```java
public interface InterfaceName {
    // 상수
    int MAX_VALUE = 100;  // public static final 생략됨
    
    // 추상 메서드
    void abstractMethod();  // public abstract 생략됨
    
    // 디폴트 메서드 (JDK 8+)
    default void defaultMethod() {
        System.out.println("Default method in interface");
    }
    
    // 정적 메서드 (JDK 8+)
    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}
````

### 인터페이스 구현

```java
public class MyClass implements InterfaceName {
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstractMethod");
    }
}
```

---

## 다중 구현

```java
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
    public void methodA() {
        System.out.println("A 구현");
    }
    public void methodB() {
        System.out.println("B 구현");
    }
}
```

---

## 인터페이스 상속

```java
interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

class C implements B {
    public void methodA() {
        System.out.println("A 구현");
    }
    public void methodB() {
        System.out.println("B 구현");
    }
}
```

---

## default 메서드 충돌 해결

여러 인터페이스에 동일한 **default 메서드**가 있을 경우 반드시 재정의해야 함.

```java
interface A {
    default void print() { System.out.println("A"); }
}
interface B {
    default void print() { System.out.println("B"); }
}

class C implements A, B {
    @Override
    public void print() {
        A.super.print(); // 특정 인터페이스의 메서드 호출
    }
}
```

---

## 활용 예시

```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("야옹");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.sound(); // 멍멍
        cat.sound(); // 야옹
    }
}
```

---

## 정리

* **규칙/표준 정의**: 모든 구현체가 동일한 메서드 시그니처를 갖게 함.
* **다형성 보장**: 부모 타입(인터페이스)으로 다양한 구현체를 다룰 수 있음.
* **다중 구현 가능**: 클래스 상속의 한계를 보완.
* **JDK 8 이후 확장성 강화**: default, static 메서드 지원.

