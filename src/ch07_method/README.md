# ch07 - Java 메서드(Method)

## 메서드란?
특정한 작업을 수행하는 코드의 집합으로, **재사용 가능한 기능 단위**입니다.

```java
접근제어자 반환타입 메서드명(매개변수) {
    // 실행할 코드
    return 반환값;
}
```

## 메서드 구조 예시
```java
static int getMax(int a, int b, int c) {
    int max = a;
    if (b > max) max = b;
    if (c > max) max = c;
    return max;
}
```

- `static` : 접근제어자
- `int` : 반환타입
- `getMax` : 메서드명
- `(int a, int b, int c)` : 매개변수
- `{ ... }` : 메서드 본체

---

## 메서드가 필요한 이유

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

## 메서드 사용 전략

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