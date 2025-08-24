# Java 메서드(Method)

## 1. 메서드 
특정한 작업을 수행하는 코드의 집합

```java
접근제어자 [static] 반환타입 메서드명(매개변수) {
    // 실행할 코드
    return 반환값; // 반환타입이 void 가 아니면 필수
}
```

- 메소드 선언: 객체의 동작을 실행 블록으로 정의한것
- 메소드 호출: 실행 블록을 실제로 실행 하는 것

## 2. 메서드 구조 예시
```java
static int getMax(int a, int b, int c) {
    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;
    return max;
}

public int add(int a, int b){
    return a + b;
}
```

## 3. 메서드 구조 설명
1. **접근 제어자**
    * public, private, protected, (default)
    * 외부에서 이 메서드를 얼마나 접근할 수 있는지 결정
2. **static 여부**
    * `static` → 객체 생성 없이 호출 가능 (클래스 메서드)
    * 비static → 객체를 생성해야 호출 가능 (인스턴스 메서드)
3. **반환 타입**
    * int, double, String 등 기본·참조형
    * `void` → 아무 값도 반환하지 않음
4. **메서드 이름**
    * 소문자로 시작, camelCase 권장 (`calculateSum`)
5. **매개변수**
    * 호출 시 전달받는 값 (여러 개 가능, 자료형 지정 필수)
6. **메서드 본문**
    * 중괄호 `{}` 안에 실행 코드 작성
7. **return 문**
    * 반환 타입이 void가 아니면 반드시 값 반환

## 4. 메서드 호출

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Calculator cal = new Calculator();  // 객체 생성
        int result = cal.add(5, 3);          // 호출
        System.out.println(result);          // 8
    }
}
```
## 5. 메서드 종류
* **인스턴스 메서드**: 객체 생성 후 호출 (`obj.methodName()`)
* **클래스 메서드 (static)**: 클래스명으로 직접 호출 (`ClassName.methodName()`)
* **Getter / Setter**: 객체 속성 읽기·변경용
* **메서드 오버로딩**: 같은 이름, 다른 매개변수

  ```java
  void print(int x) { ... }
  void print(String s) { ... }
  ```
* **메서드 오버라이딩**: 상속받은 메서드 재정의

---
## 6. 메서드가 필요한 이유

### 1. 코드 재사용 
같은 코드를 여러 번 쓸 필요 없음
```java
// ❌ 반복 코드
int max1 = Math.max(Math.max(a1, b1), c1);
int max2 = Math.max(Math.max(a2, b2), c2);
int max3 = Math.max(Math.max(a3, b3), c3);

// ✅ 메서드 사용
int max1 = getMax(a1, b1, c1);
int max2 = getMax(a2, b2, c2);
int max3 = getMax(a3, b3, c3);
```

### 2. 쉬운 수정
한 곳만 고치면 모든 곳에 적용됨

### 3. 읽기 쉬운 코드
메서드 이름만 봐도 무슨 일을 하는지 알 수 있음

### 4. 독립적 테스트
각 기능을 따로 테스트할 수 있음

---

## 7. 메서드 사용 전략

### 언제 메서드로 만들까?
- 같은 코드가 **2번 이상** 반복될 때
- **하나의 명확한 기능**을 할 때
- 코드가 **10줄 이상** 길어질 때

### 좋은 메서드 이름 짓기
```java
// ✅ 좋은 예시
calculateAverage()     // 평균 계산
isValidEmail()        // 이메일 유효성 검사
getUserName()         // 사용자 이름 가져오기
printResult()         // 결과 출력

// ❌ 나쁜 예시
doSomething()         // 뭘 하는지 모름
method1()             // 의미 없는 이름
calculate()           // 뭘 계산하는지 불명확
```

### 메서드 설계 규칙
1. **하나의 일만 하기** - 메서드 하나당 기능 하나
2. **짧게 만들기** - 보통 10-20줄 이내
3. **의미 있는 이름** - 동사 + 명사 조합
4. **매개변수 적게** - 보통 3개 이하가 좋음

---

## 실제 적용 예시

### Before (메서드 없이)
```java
// 학생 1 성적 계산
int total1 = korean1 + english1 + math1;
double avg1 = total1 / 3.0;
String grade1 = (avg1 >= 90) ? "A" : (avg1 >= 80) ? "B" : "C";

// 학생 2 성적 계산 (같은 코드 반복!)
int total2 = korean2 + english2 + math2;
double avg2 = total2 / 3.0;
String grade2 = (avg2 >= 90) ? "A" : (avg2 >= 80) ? "B" : "C";
```

### After (메서드 사용)
```java
static String calculateGrade(int korean, int english, int math) {
    int total = korean + english + math;
    double avg = total / 3.0;
    return (avg >= 90) ? "A" : (avg >= 80) ? "B" : "C";
}

// 사용
String grade1 = calculateGrade(korean1, english1, math1);
String grade2 = calculateGrade(korean2, english2, math2);
```

## 9. `return` 문

메서드가 실행을 끝내고 호출한 곳에 **값을 돌려주는 역할**을 함.
`return` 키워드 뒤에는 반환할 **값이나 변수, 표현식**이 온다.

```java
int square(int x) {
    return x * x;  // 값 반환
}
```

* 반환 타입과 **일치하는 값**을 반드시 반환해야 함
* `void` 메서드에서는 값을 반환하지 않음. 다만 `return;` 만 써서 **즉시 종료** 가능

```java
void printPositive(int n) {
    if (n <= 0) {
        System.out.println("양수만 입력하세요.");
        return; // 메서드 강제 종료
    }
    System.out.println("입력한 양수: " + n);
}
```

## 10. 메서드 오버로딩 (Overloading)

**같은 이름의 메서드를 여러 개 정의**할 수 있는 기능
→ 단, **매개변수 리스트(개수, 타입, 순서)** 가 달라야 함.

### 예시

```java
class Printer {
    void print(int x) {
        System.out.println("정수 출력: " + x);
    }

    void print(double x) {
        System.out.println("실수 출력: " + x);
    }

    void print(String s) {
        System.out.println("문자열 출력: " + s);
    }
}

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print(10);       // 정수 출력: 10
        p.print(3.14);     // 실수 출력: 3.14
        p.print("Hello");  // 문자열 출력: Hello
    }
}
```

* 같은 동작(출력, 계산 등)에 대해 **메서드 이름을 통일**할 수 있음
* 코드 가독성 증가

**주의할 점**

* 반환 타입만 다르게 하면 오버로딩 불가능

  ```java
  int add(int a, int b) { return a+b; }
  double add(int a, int b) { return a+b; } // ❌ 컴파일 에러
  ```

* 매개변수 시그니처(자료형/개수)가 달라야 한다.

---

## `return` + 오버로딩 결합 예시

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.add(3, 5));          // 8
        System.out.println(cal.add(2.5, 4.1));     // 6.6
        System.out.println(cal.add("Hello ", "World")); // Hello World
    }
}
```
