package ch02_Variables.sec02_type_integer;

/**
 * 정수 타입
 * byte, short, int, long, char
 */
public class PrimitiveType {
    public static void main(String[] args) {

        // 정수형 (Integer Types) 타입 예제
        System.out.println("===== 정수형 타입 =====");

        // byte: 1바이트 (-128 ~ 127)
        byte byteValue = 127;
//        byte byteValueMin = -129; 에러남
        System.out.println("byte 값: " + byteValue);

        // short: 2바이트 (-32,768 ~ 32,767)
        short shortValue = 32767;
        System.out.println("\nshort 값: " + shortValue);

        // int: 4바이트 (-2,147,483,648 ~ 2,147,483,647).
        // 정수의 기본 타입
        int intValue = 2147483647;
        System.out.println("\nint 값: " + intValue);

        // long: 8바이트 - 큰 정수 값을 저장할 때 사용 (접미사 L 또는 l 사용)
        long longValue = 9223372036854775807L; // L을 붙여야 함
        long longValue2 = 1232222212; // long 타입으로 변수를 선언했지만 정수 리터럴은 기본적으로
        // int 타입으로 간주하기 때문에 long 타입이더라도 int 허용 범위를 초과하는 경우 l,L 안붙이면 에러 발생
        System.out.println("\nlong 값: " + longValue);
        System.out.println("long2 값: " + longValue2);

        // char: 2바이트, 문자 리터럴은 유니코드로 변환되어 저장되는데, 유니코드는 0~65535 숫자로
        // 매핑한 국제 표준규약이다. 유니코드가 정수 숫자이므로 char 타입도 정수 타입에 속함
        // 정수 타입이기때문에 문자뿐만 아니라 유니코드 숫자를 직접 대입도 가능하다.
        char var1 = 'A'; // 'A' 문자와 매핑되는 숫자: 65로 대입됨
        char var2 = 65; // 유니코드 숫자 직접 입력
        System.out.println("char 변수에 문자 대입: " + var1);
        System.out.println("char 변수에 유니코드 직접 대입: " + var2);

        char var3 = '가'; // 문자 저장
        char var4 = 44032; // 유니코드 직접 저장

        System.out.println(var3); // 가 출력
        System.out.println(var4); // 가 출력
        // char 변수 초기화시 '' 는 에러가 난다
        // char var5 = ' '; // char 변수를 단순 초기화만 할거면 공백(유니코드 32번)을
        // 포함시켜 초기화 해야 된다

    }
}
