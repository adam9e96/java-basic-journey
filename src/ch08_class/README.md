# ch08 Class(클래스)

클래스는 객체를 만들기 위한 설계도나 틀이다. 

객체의 속성(필드)과 행동(메소드)을 정의한다.

## 기본 클래스 구조

```java
public class ClassName {
    // 필드(멤버변수)
    private String field1;
    private int field2;
    
    // 생성자
    public ClassName() {
        // 기본 생성자
    }
    
    public ClassName(String field1, int field2) {
        // 매개변수가 있는 생성자
        this.field1 = field1;
        this.field2 = field2;
    }
    
    // 메소드
    public void method1() {
        // 메소드 구현
    }
    
    public String getField1() {
        return field1;
    }
    
    public void setField1(String field1) {
        this.field1 = field1;
    }
}
```

## 접근 제어자

| 접근 제어자 | 같은 클래스 | 같은 패키지 | 하위 클래스 | 다른 패키지 |
|------------|------------|------------|------------|------------|
| public     | ✓          | ✓          | ✓          | ✓          |
| protected  | ✓          | ✓          | ✓          | ✗          |
| default    | ✓          | ✓          | ✗          | ✗          |
| private    | ✓          | ✗          | ✗          | ✗          |


## 객체 생성 및 사용

```java
public class Main {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();
        
        // 메소드 호출
        myCar.power();
        myCar.speedUp();
        
        
    }
}
```