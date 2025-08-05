package ch02_variables.sec03_type_float;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // float 타입 비교(정밀도)
        float var1 = 0.1234567890123456789f;
        double var2 = 0.1234567890123456789;

        System.out.println("var1: "+var1);
        System.out.println("var2: "+var2);

        // double 타입은 flaot 보다 약 2배 정도의 유효 자릿수를 가짐.
    }
}
