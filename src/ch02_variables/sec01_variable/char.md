# Java `char`

## 개요

* Java의 `char`는 **단일 16비트 유니코드 문자**를 저장하는 기본 타입(primitive type)
* 내부적으로 **0 \~ 65535**(U+0000 \~ U+FFFF) 범위의 숫자를 저장
* ASCII(0\~127)는 유니코드의 일부로 포함됨

---

## 🔢 범위

| 구분           | 범위(10진수)     | 범위(16진수)         | 설명                       |
| ------------ | ------------ | ---------------- | ------------------------ |
| 전체 `char` 범위 | 0 \~ 65535   | U+0000 \~ U+FFFF | UTF-16 코드 유닛 1개          |
| ASCII        | 0 \~ 127     | U+0000 \~ U+007F | 영어, 숫자, 기본 기호            |
| 확장 영역        | 128 \~ 65535 | U+0080 \~ U+FFFF | 전 세계 문자, 한글, 일본어, 특수기호 등 |

---

## 선언 방법

```java
// 문자 직접 저장
char c1 = 'A';       // 문자 리터럴
char c2 = '한';      // 한글 가능
char c3 = '\u0041';  // 유니코드 이스케이프 (U+0041 → 'A')

// 숫자 코드값으로 저장
char c4 = 65;        // 'A' (유니코드 값 65)
char c5 = 0xAC00;    // '가' (유니코드 값 44032)
```

---

## 사용 예시

```java
public class CharExample {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 65;         // 'A'
        char ch3 = '\uAC00';   // '가'

        System.out.println(ch1); // A
        System.out.println(ch2); // A
        System.out.println(ch3); // 가

        // char → int (자동 형변환)
        int code = ch1;
        System.out.println(code); // 65

        // int → char (명시적 형변환)
        char ch4 = (char)97;
        System.out.println(ch4); // a
    }
}
```

---

## 주의사항

1. **`char`는 문자열이 아님**

    * 문자열 `"A"`는 `String`, 문자 `'A'`는 `char`
2. **UTF-16 기반이므로 65535를 초과하는 문자(이모지 등)는 `char` 하나로 표현 불가**

    * 이런 문자는 `char` 2개(서로게이트 페어)로 표현
3. **문자 연산 시 자동으로 정수형으로 변환됨**

   ```java
   char c = 'A';
   System.out.println(c + 1); // 66 (정수 연산)
   ```