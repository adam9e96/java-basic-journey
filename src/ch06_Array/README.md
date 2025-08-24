# ch06. 자바 배열

## 1. 배열이란?

> 배열은 동일한 자료형의 여러 데이터를 하나의 변수로 묶어 관리하는 자료구조.

### 배열이 필요한 이유

```java
// 배열 없이
int score001 = 95;
int score002 = 76;
int score003 = 67;
int score004 = 56;
int score005 = 87;

int total = score001 + score002 + score003 + score004 + score005;
```

**문제점**

1. 데이터가 늘어날 때마다 변수를 새로 선언해야 함
2. 합계·평균 계산 시 모든 변수명을 수정해야 함
3. 관리와 확장이 어려움

**배열 사용 시**

```java
int[] scores = {95, 76, 67, 56, 87};
```

* 데이터 개수에 따라 반복문으로 간단히 합계·평균 계산 가능
* 코드 간결화 및 유지보수 용이
* 다차원 데이터 표현 가능

---

## 2. 배열의 특징

1. **동일한 자료형만 저장 가능**
   → `int[]`에는 int 값만 저장 가능
2. **크기 고정**
   → 선언 시 길이 결정, 변경 불가
3. **0부터 시작하는 인덱스**
4. **인덱스로 요소 접근 가능**
   → 예: `scores[0]`

---

## 3. 배열 초기화 방법

### 3.1 기본 초기화

```java
// 방법 1: 선언과 동시에 값 대입
int[] a = {1, 2, 3, 4, 5};

// 방법 2: 크기 지정 후 값 대입
int[] b = new int[5];
b[0] = 1; b[1] = 2;

// 방법 3: new + 중괄호
int[] c = new int[]{1, 2, 3, 4, 5};

// 방법 4: 반복문 초기화
int[] d = new int[5];
for (int i = 0; i < d.length; i++) d[i] = i + 1;
```

### 3.2 고급 초기화

```java
// Arrays.fill()
int[] a = new int[5];
Arrays.fill(a, 42);

// Arrays.setAll()
int[] b = new int[5];
Arrays.setAll(b, i -> i + 1);

// Stream API
int[] c = IntStream.rangeClosed(1, 5).toArray();
```

---

## 4. 배열 출력 및 순회

### 4.1 for문

```java
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

### 4.2 향상된 for문

```java
for (int n : arr) {
    System.out.print(n + " ");
}
```

### 4.3 Arrays.toString()

```java
System.out.println(Arrays.toString(arr)); // 1차원
System.out.println(Arrays.deepToString(matrix)); // 다차원
```

## 5. 중요 개념

* **인덱스 0 시작 이유** → 메모리 계산 효율성 때문
* **배열 길이 확인** → `배열명.length`
* **new 생략 가능** → 리터럴 `{}` 사용 시