# Java 매개변수 전달 방식 정리

## 1. Call by Value (값에 의한 호출)
- **자바의 모든 매개변수 전달 방식은 Call by Value**이다.
- 원시 타입(`int`, `double`, `char`, `boolean` 등)을 메소드에 넘기면 **실제 값이 복사**되어 전달된다.
- 메소드 안에서 값을 변경해도 **원본 변수에는 영향 없음**.

### 예시
```java
public static void changeValue(int x) {
    x = 100; // 복사된 값만 변경
}

public static void main(String[] args) {
    int a = 10;
    changeValue(a);
    System.out.println(a); // 10 (변경 안됨)
}
```

---

## 2. Call by Reference (참조에 의한 호출, 자바에서는 직접 지원하지 않음)

* C/C++처럼 참조 자체를 전달해서 원본을 바꾸는 방식.
* 자바에서는 **순수 Call by Reference는 존재하지 않음**.
* 다만 객체(참조 타입)를 전달하면 **참조값(주소)이 복사**되어 전달되므로,
  메소드 안에서 해당 참조가 가리키는 객체의 상태를 변경할 수 있다.
* 즉, 객체 내부 데이터는 바뀔 수 있지만, **참조 자체를 다른 객체로 바꾸면 원본에는 영향 없음**.

### 예시 (참조형 데이터)

```java
public static void changeElement(int[] arr) {
    arr[0] = 99; // 배열 내부 원소 변경
}

public static void changeArray(int[] arr) {
    arr = new int[]{5, 6, 7}; // 새로운 배열 참조
}

public static void main(String[] args) {
    int[] numbers = {1, 2, 3};
    
    changeElement(numbers);
    System.out.println(numbers[0]); // 99 (내부 값 변경됨)

    changeArray(numbers);
    System.out.println(numbers[0]); // 99 (참조는 안 바뀜)
}
```

---

## 3. Call by String (문자열에 의한 호출, 오해 주의)

* `String`은 참조형이지만 **불변(Immutable)** 객체라서 특별하게 보일 뿐이다.
* 메소드에 문자열을 전달해도 참조값이 복사되므로 Call by Value다.
* 단, `String`은 내부 값을 바꿀 수 없으므로 메소드 안에서 새로운 문자열을 만들어 반환하지 않는 한 원본은 절대 변하지 않는다.

### 예시

```java
public static void setAddress(String addr) {
    addr = "경기도 수원시 장안구"; // 새로운 문자열 객체 생성
}

public static String setAddress2(String addr) {
    addr = "경기도 수원시 장안구"; 
    return addr; // 새로운 문자열 참조 반환
}

public static void main(String[] args) {
    String address1 = "서울시 강남구 논현동";
    setAddress(address1);
    System.out.println(address1); // "서울시 강남구 논현동" (그대로)

    address1 = setAddress2(address1);
    System.out.println(address1); // "경기도 수원시 장안구" (변경된 참조 반환받음)
}
```

---

## 정리

* **자바는 항상 Call by Value**이다.
* 원시 타입 → 값이 복사됨 (원본 불변).
* 참조 타입 → 참조값(주소)이 복사됨. 객체 내부는 바뀔 수 있지만 참조 자체는 변경 불가.
* `String` → 참조형이지만 불변(Immutable). 따라서 메소드 안에서 바꿔도 원본은 변하지 않는다.