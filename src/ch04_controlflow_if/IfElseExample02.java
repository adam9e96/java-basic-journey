package ch04_controlflow_if;

public class IfElseExample02 {
    public static void main(String[] args) {
        // if-else if-else 문을 사용하여 여러 조건을 처리할 수 있다.
        int score = 85;

        if (score >= 90) {
            System.out.println("A학점입니다.");
        } else if (score >= 80) {
            System.out.println("B학점입니다.");
        } else if (score >= 70) {
            System.out.println("C학점입니다.");
        } else if (score >= 60) {
            System.out.println("D학점입니다.");
        } else {
            System.out.println("F학점입니다.");
        }


        // 나이에 따라 요금을 구분하는 예제
        int age = 15;
        if (age >= 20) {
            System.out.println("성인 요금: 10,000원");
        } else if (age >= 14) {
            System.out.println("청소년 요금: 7,000원");
        } else if (age >= 8) {
            System.out.println("어린이 요금: 5,000원");
        } else {
            System.out.println("유아 요금: 0원");
        }

        /*
         * if-else if-else 문 주의
         * 각 조건은 순차적으로 검사되며, 첫 번째로 참인 조건의 블록만 실행된다.
         * 따라서, 조건을 작성할 때는 가장 구체적인 조건부터 시작하고,
         * 가장 일반적인 조건을 마지막에 작성하는 것이 좋다.
         */
    }
}
