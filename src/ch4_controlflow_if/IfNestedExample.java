package ch4_controlflow_if;

/*
 * if-else 문을 중첩하여 사용한 예제
 *  이 예제는 점수에 따라 학점을 계산하는 프로그램입니다.
 *  점수는 난수로 생성
 */
public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 20) + 81; // 81 ~ 100 사이 난수

        System.out.println("점수: " + score);

        String grade;

        if (score >= 90) {
            if (score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if (score >= 85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }
        System.out.println("학점: " + grade);
    }
}
