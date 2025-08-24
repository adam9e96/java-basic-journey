package ch07_Method.sec02_ex;

/**
 * 1. 문자열 하나를 매개변수로 받아 해당 문자열의 길이를 반환하는 메서드
 * getLength를 작성하시오.
 */
public class Method03_ex {
    public static int getLength(String s) {
        return s.length();
    }

    public static void main(String[] args) {

        String str = "파이브가이즈";
        System.out.println(getLength(str));
    }
}
