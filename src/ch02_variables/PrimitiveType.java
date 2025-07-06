package ch02_variables;

/**
 * 기본형 타입만
 */
public class PrimitiveType {
    public static void main(String[] args) {

        // 1. 정수형 (Integer Types) 변수 예제
        System.out.println("===== 정수형 타입 =====");

        // byte: 1바이트 (-128 ~ 127)
        byte byteValue = 127;
        System.out.println("byte 값: " + byteValue);
        System.out.println("byte 최대값: " + Byte.MAX_VALUE);
        System.out.println("byte 최소값: " + Byte.MIN_VALUE);

        // short: 2바이트 (-32,768 ~ 32,767)
        short shortValue = 32767;
        System.out.println("\nshort 값: " + shortValue);
        System.out.println("short 최대값: " + Short.MAX_VALUE);
        System.out.println("short 최소값: " + Short.MIN_VALUE);

        // int: 4바이트 (-2,147,483,648 ~ 2,147,483,647).
        // 정수의 기본 타입
        int intValue = 2147483647;
        System.out.println("\nint 값: " + intValue);
        System.out.println("int 최대값: " + Integer.MAX_VALUE);
        System.out.println("int 최소값: " + Integer.MIN_VALUE);

        // long: 8바이트 - 큰 정수 값을 저장할 때 사용 (접미사 L 또는 l 사용)
        long longValue = 9223372036854775807L; // L을 붙여야 함
        System.out.println("\nlong 값: " + longValue);
        System.out.println("long 최대값: " + Long.MAX_VALUE);
        System.out.println("long 최소값: " + Long.MIN_VALUE);

        // 진법 표현
        int binaryNum = 0b1010;  // 2진수(binary): 0b 접두사
        int octalNum = 012;      // 8진수(octal): 0 접두사
        int hexNum = 0xA;        // 16진수(hexadecimal): 0x 접두사

        System.out.println("\n2진수 0b1010: " + binaryNum); // 10
        System.out.println("8진수 012: " + octalNum);      // 10
        System.out.println("16진수 0xA: " + hexNum);       // 10

        // 2. 실수형(Floating-point Types) 변수 예제
        System.out.println("\n===== 실수형 타입 =====");

        // float: 4바이트, 단정밀도(single precision) - 접미사 f 또는 F 사용
        float floatValue = 3.14159265359f; // f를 붙여야 함
        System.out.println("float 값: " + floatValue); // 정밀도 한계로 3.1415927까지만 출력

        // double: 8바이트, 배정밀도(double precision) - 실수의 기본 타입
        double doubleValue = 3.14159265359;
        System.out.println("double 값: " + doubleValue); // 더 정확한 값 출력

        // 3. 문자형(Character Type) 변수 예제
        System.out.println("\n===== 문자형 타입 =====");

        // char: 2바이트 유니코드 문자
        char charValue1 = 'A';      // 문자 직접 저장
        char charValue2 = 65;       // ASCII 코드로 저장
        char charValue3 = '\u0041'; // 유니코드로 저장

        System.out.println("char 'A': " + charValue1);
        System.out.println("char 65: " + charValue2);
        System.out.println("char '\\u0041': " + charValue3);
        System.out.println("세 값은 모두 동일: " + (charValue1 == charValue2 && charValue2 == charValue3));

        // 한글 문자
        char koreanChar = '가';
        System.out.println("한글 문자 '가'의 유니코드 값: " + (int) koreanChar);

        // 4. 논리형(Boolean Type) 변수 예제
        System.out.println("\n===== 논리형 타입 =====");

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println("isTrue: " + isTrue);
        System.out.println("isFalse: " + isFalse);
        System.out.println("!isTrue: " + !isTrue);
        System.out.println("!isFalse: " + !isFalse);

        // 5. 문자열(String) - 참조 타입이지만 기본형처럼 사용
        // 참조형(String 클래스)을 사용하는건 맞지만, 사용할때 리터럴로 바로 쓸 수 있어서
        // 기본형처럼 느껴짐(기본형은 아님)
        // 참조형인데 변수에 값저장해서 정수형 변수처럼 바로 사용하는것을 말함
        System.out.println("\n===== 문자열(참조 타입) =====");

        String greeting = "안녕하세요!"; // 기본형스러움
        System.out.println("문자열: " + greeting);
        System.out.println("문자열 길이: " + greeting.length()); // 이건 참조형 이여야 가능
        /*
        참조 형 변수 사용 예시
        class Person {
            String name;
        }

        Person p = new Person();
        p.name = "홍길동";
        System.out.println(p.name);

        String은 참조타입이면서 기본타입처럼도 쓸수있다는 점을 말함
        String을 참조타입으로도 쓸수있음 new 키워드를 사용하거나 배열처럼 쓰거나 String의 메서드를 호출하거나
        null이 가능한 것도 참조형이라서 가능한 것
        String s = null;
         */
    }
}
