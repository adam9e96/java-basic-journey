# ch05 반복문

반복문의 종류로는 for문, for-each문, while 문, do ~ while 문이 있음.

for문과 whihle 문은 서로 변환이 가능하기 때문에 반복문을 작성할 때 어느 쪽을 선택해도 좋지만,

for문은 반복 횟수를 알고 있을 때 주로 사용하고, while문은 조건에 따라 반복할 때 사용.

for 반복문은 반복 횟수가 정해져 있을 때 주로 사용되며, 초기식, 조건식, 증감식이 있다.

반복문을 사용하여 일정한 패턴의 작업을 간결하게 표현할 수 있으며, 코드의 가독성을 향상시키고 유지보수를 용이하게 만든다

### ForExample.java

- 반복문을 사용하는 이유

## While

조건식이 true 일 경우에 반복을 수행하는 반복문.
조건식에는 비교 또는 연산식이 주로 오는데, 조건식이 false 가 되면 반복문을 빠져나온다.

### WhileExample.java

- while문을 사용하는 이유

### DoWhileExample.java
- Do~While문 사용예시

---
## for 문

### 기본 문법
```java
for (초기화; 조건; 증감) {
    // 실행할 코드
}
```

#### 기본 사용
```java
// 1부터 10까지 출력
for (int i = 1; i <= 10; i++) {
    System.out.println(i);
}
```

#### 배열 순회
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
    System.out.println("numbers[" + i + "] = " + numbers[i]);
}
```

#### 역순 순회
```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

#### 다양한 증감
```java
// 2씩 증가
for (int i = 0; i <= 20; i += 2) {
    System.out.println(i);
}

// 여러 변수 사용
for (int i = 0, j = 10; i < j; i++, j--) {
    System.out.println("i: " + i + ", j: " + j);
}
```

#### 무한 루프
```java
for (;;) {
    // 무한 반복
    // break를 사용해 탈출
}
```

---

## 향상된 for 문 (for-each)

### 기본 문법
```java
for(타입 변수명 :배열또는컬렉션){
        // 실행할 코드
        }
```

### 예제

#### 배열 순회
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println(num);
}
```

#### 문자열 배열
```java
String[] names = {"Alice", "Bob", "Charlie"};
for (String name : names) {
    System.out.println("Hello, " + name);
}
```

#### 컬렉션 순회
```java
List<String> fruits = Arrays.asList("apple", "banana", "orange");
for (String fruit : fruits) {
    System.out.println(fruit.toUpperCase());
}
```

#### 2차원 배열
```java
int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
for (int[] row : matrix) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

### for 문 vs for-each문 비교
```java
int[] arr = {1, 2, 3, 4, 5};

// 일반 for문 - 인덱스 접근 가능
for (int i = 0; i < arr.length; i++) {
    System.out.println("Index " + i + ": " + arr[i]);
    arr[i] *= 2; // 배열 수정 가능
}

// Enhanced for문 - 읽기 전용, 더 간결
for (int num : arr) {
    System.out.println(num); // 배열 수정 불가
}
```

---

## while 문

### 기본 문법
```java
while (조건) {
    // 실행할 코드
}
```

### 예제

#### 기본 사용법
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

#### 사용자 입력 처리
```java
Scanner scanner = new Scanner(System.in);
String input = "";
while (!input.equals("quit")) {
    System.out.print("명령을 입력하세요 (quit으로 종료): ");
    input = scanner.nextLine();
    System.out.println("입력된 명령: " + input);
}
```

#### 조건부 계속
```java
int sum = 0;
int num = 1;
while (sum < 100) {
    sum += num;
    num++;
}
System.out.println("합이 100을 넘는 순간의 합: " + sum);
```

---

## do-while 문

### 기본 문법
```java
do {
    // 실행할 코드
} while (조건);
```

### 예제

#### 기본 사용법
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

#### 메뉴 시스템
```java
Scanner scanner = new Scanner(System.in);
int choice;
do {
    System.out.println("1. 옵션 1");
    System.out.println("2. 옵션 2");
    System.out.println("0. 종료");
    System.out.print("선택: ");
    choice = scanner.nextInt();
    
    switch (choice) {
        case 1:
            System.out.println("옵션 1 선택됨");
            break;
        case 2:
            System.out.println("옵션 2 선택됨");
            break;
        case 0:
            System.out.println("프로그램 종료");
            break;
        default:
            System.out.println("잘못된 선택");
    }
} while (choice != 0);
```

### while vs do-while 비교
```java
// while: 조건을 먼저 검사
int i = 10;
while (i < 5) {
    System.out.println("실행되지 않음");
}

// do-while: 최소 한 번은 실행
int j = 10;
do {
    System.out.println("최소 한 번 실행됨: " + j);
} while (j < 5);
```

---

## 반복문 제어 키워드

### break
현재 반복문을 즉시 종료
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break; // i가 5일 때 반복문 종료
    }
    System.out.println(i); // 1, 2, 3, 4 출력
}
```

### continue
현재 반복의 나머지 부분을 건너뛰고 다음 반복으로
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue; // 짝수일 때 다음 반복으로
    }
    System.out.println(i); // 1, 3, 5, 7, 9 출력
}
```
---

## 중첩 반복문

### 2차원 배열 처리
```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// 일반 for문으로 출력
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

### 구구단 출력
```java
for (int i = 2; i <= 9; i++) {
    System.out.println(i + "단:");
    for (int j = 1; j <= 9; j++) {
        System.out.println(i + " × " + j + " = " + (i * j));
    }
    System.out.println();
}
```

### 별표 패턴
```java
// 삼각형 패턴
for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

// 피라미드 패턴
int height = 5;
for (int i = 1; i <= height; i++) {
    // 공백 출력
    for (int j = 1; j <= height - i; j++) {
        System.out.print(" ");
    }
    // 별 출력
    for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print("*");
    }
    System.out.println();
}
```
---

## 💡 요약

| 반복문 종류 | 사용 시점 | 특징 |
|------------|-----------|------|
| **for** | 반복 횟수가 정해진 경우 | 초기화, 조건, 증감을 한 줄에 |
| **Enhanced for** | 배열/컬렉션 순회 | 간결하고 안전, 읽기 전용 |
| **while** | 조건에 따른 반복 | 조건을 먼저 검사 |
| **do-while** | 최소 한 번은 실행 | 실행 후 조건 검사 |