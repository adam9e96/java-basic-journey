# 접근제한자(Access Modifier)

클래스, 변수, 메서드 생성자 등의 요소에 대한 접근 범위를 지정하는 키워드

접근 제어자를 통해 불필요한 정보 노출을 막고, 데이터의 안정성을 높일 수 있음

## 1. public

모든 접근을 허용함

```java
// public 클래스
public class PublicClass {
    // public 변수
    public int publicVariable = 10;

    // public 메서드
    public void publicMethod() {
        System.out.println("누구나 접근 가능한 메서드");
    }
}
```

### 2. protected

같은 패키지 내부에 있는 클래스와 다른 패키지에 있더라도 해당 클래스를 상속받은 자식 클래스에선
접근할 수 있음

```java
// 부모 클래스
public class ParentClass {
    // protected 변수
    protected String protectedVariable = "보호된 변수";
}

// 다른 패키지에 있는 자식 클래스
package anotherPackage;
import somePackage.ParentClass;

public class ChildClass extends ParentClass {
    public void display() {
        // 상속받았기 때문에 접근 가능
        System.out.println(protectedVariable);
    }
}
```

### 3. default

별도의 접근 제어자를 명시하지 않았을때 적용되는 기본값.

같은 패키지 내부에 있는 클래스에서만 접근가능.

```java
// 같은 패키지 내 클래스
class DefaultClass {
    // default 변수
    int defaultVariable = 20;

    // default 메서드
    void defaultMethod() {
        System.out.println("같은 패키지에서만 접근 가능");
    }
}
```

### 4. private

가장 엄격한 접근 제어자로, 해당 클래스 내부에서만 접근가능

외부 클래스는 물론, 같은 패키지나 상속관계에 있는 클래스에서도 접근 불가능

```java
public class PrivateClass {
    // private 변수
    private double privateVariable = 3.14;

    // private 메서드
    private void privateMethod() {
        System.out.println("오직 이 클래스 안에서만 접근 가능");
    }

    public void accessPrivate() {
        // 같은 클래스 내부이므로 접근 가능
        privateMethod();
        System.out.println(privateVariable);
    }
}
```

## 요약

| 접근제어      | 같은클래스 | 같은 패키지 | 자식 클래스(다른 패키지) | 모든 클래스 |
|-----------|-------|--------|----------------|--------|
| public    | O     | O      | O              | O      |
| protected | O     | O      | O              | X      |
| default   | O     | O      | X              | X      |
| private   | O     | X      | X              | X      |

