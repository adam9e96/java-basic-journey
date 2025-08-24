package ch02_Variables.sec02_type_integer;

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
