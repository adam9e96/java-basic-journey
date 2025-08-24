package ch02_Variables.sec08_type_conversion;

public class AutoConversionExample01 {
    public static void main(String[] args) {
        byte b = 10;
        int i = b; // byte → int 자동 변환
        double d = i; // int → double 자동 변환

        System.out.println("int i : " + i);   // 10
        System.out.println("double d : " + d); // 10.0
    }
}