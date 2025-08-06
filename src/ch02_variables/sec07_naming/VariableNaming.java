package ch02_variables.sec07_naming;

public class VariableNaming {
    public static void main(String[] args) {

        // 변수 명명 규칙 연습
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
