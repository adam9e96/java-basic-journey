package ch02_variables;

public class VariablesAndDataTypes {
    public static void main(String[] args) {

        // ========== 1. 기본 데이터 타입 (Primitive Data Types) ==========

        // 정수형 (Integer Types)
        byte myByte = 127; // -128 ~ 127 (1바이트)
        short myShort = 32000; // -32,768 ~ 32,767 (2바이트)
        int myInt = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (4바이트)
        long myLong = 9223372036854775807L; // 더 큰 정수 (8바이트), 끝에 L 붙임

        // 실수형 (Floating Point Types)
        float myFloat = 3.14f; // 소수점 7자리까지, 끝에 f를 붙임 (4바이트)
        double myDouble = 3.14159265359; // 소수점 15자리까지 (8바이트)

        // 문자형 (Character Types)
        char myChar = 'A'; // 단일 문자, 작은 따옴표 사용 (2바이트)
        char myChar2 = '가'; // 한글도 가능

        // 논리형 (Boolean Type)
        boolean isTrue = true; // true 또는 false만 가능
        boolean isFalse = false;

        // ========== 2. 참조 데이터 타입 (Reference Data Types) ==========

        // 문자열 (String) - 가장 많이 사용하는 참조 타입
        String myString = "안녕하세요, 자바!";
        String myString2 = "Hello Java";

        // ========== 3. 변수 출력해보기 ==========

        System.out.println("=== 정수형 변수들 ===");
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);

        System.out.println("\n=== 실수형 변수들 ===");
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);

        System.out.println("\n=== 문자형 변수들 ===");
        System.out.println("char: " + myChar);
        System.out.println("char2: " + myChar2);

        System.out.println("\n=== 논리형 변수들 ===");
        System.out.println("isTrue: " + isTrue);
        System.out.println("isFalse: " + isFalse);

        System.out.println("\n=== 문자열 변수들 ===");
        System.out.println("myString: " + myString);
        System.out.println("myString2: " + myString2);

        // ========== 4. 변수의 값 변경해보기 ==========

        System.out.println("\n=== 변수 값 변경 ===");
        int number = 10;
        System.out.println("처음 number: " + number);

        number = 20; // 값 변경
        System.out.println("변경된 number: " + number);

        number = number + 5; // 기존 값에 5를 더함
        System.out.println("5를 더한 number: " + number);

        // ========== 5. 상수 (final 키워드) ==========

        final int FIXED_NUMBER = 100; // 상수는 대문자로 명명, 값 변경 불가
        System.out.println("\n=== 상수 ===");
        System.out.println("FIXED_NUMBER: " + FIXED_NUMBER);

//        FIXED_NUMBER = 200; // 오류. 상수는 값을 변경할 수 없음

        // ========== 6. 변수 명명 규칙 연습 ==========

        // 올바른 변수명들
        int studentAge = 20; // camelCase 사용 (권장)
        String userName = "홍길동"; // camelCase 사용 (권장)
        boolean isStudent = true; // is로 시작하는 boolean 변수 (권장)

        // 피해야 할 변수명들 (문법적으로는 가능하지만 권장하지는 않음)
//        int 1student = 20; // 숫자로 시작 불가
//        String user-name = "test"; // 하이픈 사용 불가
//        boolean class = true; // 예약어 사용 불가

        System.out.println("\n=== 좋은 변수명 예시 ===");
        System.out.println("학생 나이: " + studentAge);
        System.out.println("사용자 이름: " + userName);
        System.out.println("학생 여부: " + isStudent);
    }
}
