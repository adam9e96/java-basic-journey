package ch02_Variables.sec06_final;

public class FinalExample01 {
    public static void main(String[] args) {

        // final 변수는 상수 취급
        // 상수 취급을 받음 => 초기값 이후로 값 변경 불가능함
        final int YEAR = 2025;
        final String MOJANG = "MINECRAFT";

//        YEAR = 2026; // 컴파일 에러

        System.out.println(YEAR);
        System.out.println(MOJANG);
    }
}
