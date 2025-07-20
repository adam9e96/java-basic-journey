# ch06 배열

## 배열

같은 타입의 여러 변수를 하나의 묶음으로 다루는 것

### 배열이 필요한 이유
```java
int score001 = 95;
int score002 = 76;
int score003 = 67;
int score004 = 56;
int score005 = 87;

int total = score001 + score002 + score003 + score004 + score005;
```
문제점
1. 변수(학생)가 추가될 때마다 변수를 추가로 선언해야 함
2. total 변수에 새로운 변수를 더해야 함
3. 평균 계산 시 분모도 수정해야 함

### 배열을 사용하는 경우의 장점
장점
1. 배열을 사용하면 변수의 개수를 줄일 수 있다.
2. 배열을 사용하면 반복문과 함께 효율적인 연산을 수행할 수 있다.
3. 배열을 사용하면 다차원의 데이터를 표현할 수 있다.
4. 학생 성적 추가가 필요한 경우 scores 배열만 수정하면 된다.


### 자바 배열의 특징

1. 동일한 자료형만 저장 -> int 배열에는 int 값만 저장가능
2. 고정크기임 -> 변수 선언시에 저장할 데이터의 개수를 지정함
3. 배열순서는 0번 부터 시작함
4. 인덱스 접근 가능 -> 인덱스를 활용하여 특정 요소에 접근가능(예: scores[0])


## 배열 초기화 방법

### 1. 기본 초기화 방법

#### Case 1: 직접 값을 넣어 초기화
```java
int[] numbers = {1, 2, 3, 4, 5};
```
- 배열 크기가 자동으로 결정됨
- 간단하고 명확한 초기화 방법

#### Case 2: 배열 크기만 지정하고 나중에 값 할당
```java
int[] numbers2 = new int[5];
numbers2[0] = 1;
numbers2[1] = 2;
// ...
```
- 선언과 초기화를 분리할 수 있음
- 초기화하지 않은 상태에서는 사용 불가

#### Case 3: new 키워드와 중괄호 사용
```java
int[] numbers3 = new int[]{1, 2, 3, 4, 5};
```
- 배열 타입을 명시하면서 초기화 가능

#### Case 4: 반복문을 통한 초기화
```java
int size = 5;
int[] numbers4 = new int[size];
for (int i = 0; i < size; i++) {
    numbers4[i] = i + 1;
}
```
- 배열 크기가 동적으로 결정될 때 유용
- 규칙적인 값 할당에 적합

### 2. 고급 초기화 방법

#### Arrays.fill() 메소드
```java
int[] numbers = new int[5];
Arrays.fill(numbers, 42); // 모든 요소를 42로 초기화
```

#### Arrays.setAll() 메소드
```java
int[] numbers2 = new int[5];
Arrays.setAll(numbers2, i -> i + 1); // 람다 표현식 사용
```

#### Stream API 사용
```java
int[] numbers3 = IntStream.rangeClosed(1, 5).toArray();
```

#### Collections.nCopies() 메소드
```java
List<Integer> list = Collections.nCopies(5, 42);
Integer[] numbers4 = list.toArray(new Integer[0]);
```

## 배열 출력 및 순회

### 1. 기본 for문을 이용한 순회
```java
int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

for (int i = 0; i < numbers.length; i++) {
    System.out.print(numbers[i] + " ");
}
```

### 2. 향상된 for문 (Enhanced for loop)
```java
for (int n : numbers) {
    System.out.print(n + " ");
}
```

### 3. Arrays.toString() 메소드
```java
// 1차원 배열
System.out.println(Arrays.toString(numbers));

// 다차원 배열
int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
System.out.println(Arrays.deepToString(matrix));
```

## 배열 활용 예제

### 예제 1: 배열 요소의 합 구하기

#### 기본 for문 사용
```java
int[] arr = {10, 20, 30, 40, 50};
int sum = 0;
for (int i = 0; i < arr.length; i++) {
    sum += arr[i];
}
```

#### 향상된 for문 사용
```java
sum = 0;
for (int n : arr) {
    sum += n;
}
```

#### 역순 for문 사용
```java
sum = 0;
for (int i = arr.length - 1; i >= 0; i--) {
    sum += arr[i];
}
```
## 중요 개념

- **인덱스가 0부터 시작하는 이유**: 컴퓨터 메모리 계산에 유리하기 때문
- **new 키워드 생략**: 배열 리터럴 `{1, 2, 3}` 사용 시 `new` 키워드는 자동으로 적용됨
- **배열의 길이**: `배열명.length` 속성으로 배열의 크기를 확인 가능

---

## 파일 구성

- `Array_01_WhyUseArrays.java`: 배열 사용의 필요성
- `Array_02_InitializationMethods.java`: 기본 배열 초기화 방법
- `Array_03_InitializationMethods.java`: 고급 배열 초기화 방법
- `Array_04_PrintWithIndex.java`: 배열 출력 및 인덱스 표시
- `Array_05_Ex01.java`: 배열 요소 합계 계산 예제
- `Array_06_Ex02.java`: 학생 성적 관리 시스템 예제