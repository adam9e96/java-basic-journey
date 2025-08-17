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
## 필드 선언과 사용
필드(Field)는 객체의 데이터를 저장하는 역할을 함.

필드 선언방법은 변수 선언방법과 동일하다.
단, 클래스 블록에서 선언 되어야 한다.
```java
타입 필드명 [ = 초기값]; 
```

로컬 변수와 필드 차이점
로컬변수는 메서드나 생성자 블록에서 선언되고 생성자와 메서드 호출 시에만 생성되고 사용된다.
필드는 클래스 내에서 선언되며, 객체 내부에서 존재하고 객체 내/외부에서 사용 가능함.


| 구분    | 필드             | (로컬)변수               |
|-------|----------------|----------------------|
| 선언위치  | 클래스선언블록        | 생성자, 메서드 선언 블록       |
| 존재위치  | 객체 내부에 존재      | 생성자, 메소드 호출 시에만 존재   |
| 사용 위치 | 객체 내/외부 어디든 사용 | 생성자, 메서드 블록 내부에서만 사용 |

필드는 초기값을 제공하지 않은 경우 필드는 객체 생성 시 기본값으로 초기화 된다.
(ex: int타입은 0, 배열or 클래스는 null 등)
