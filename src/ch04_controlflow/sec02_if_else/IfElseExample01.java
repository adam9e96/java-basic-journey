package ch04_controlflow.sec02_if_else;


public class IfElseExample01 {
    public static void main(String[] args) {

        // if 문의 경우 if가 참일때만 동작을 수행하도록 할수있었는데
        // if-else 문의 경우 ture/false 각각 다른 동작을 수행하도록 할 수 있음.
        int score = 75;

        if (score >= 80) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }

        // 홀수, 짝수 판별하기
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + "는 짝수입니다.");
        } else {
            System.out.println(number + "는 홀수입니다.");
        }

        // 성인, 미성년자 구분하기
        int age = 22;
        if (age >= 20) {
            System.out.println("성인입니다.");
            System.out.println("성인 요금이 적용됩니다.");
        } else {
            System.out.println("미성년자입니다.");
            System.out.println("청소년 요금이 적용됩니다.");
        }
    }
}
