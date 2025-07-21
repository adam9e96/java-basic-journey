package ch04_controlflow_switch;

public class SwitchExample04_Expression {
    public static void main(String[] args) {
        // switch 표현식 사용 예제
        int dayOfWeek = 3; // 1: 월요일, 2: 화요일, ..., 7: 일요일

        String day = switch (dayOfWeek) {
            case 1 -> "월요일";
            case 2 -> "화요일";
            case 3 -> "수요일";
            case 4 -> "목요일";
            case 5 -> "금요일";
            case 6 -> "토요일";
            case 7 -> "일요일";
            default -> "잘못된 입력입니다.";
        };

        System.out.println("오늘은 " + day + "입니다.");

        // 여러 값에 대해 동일한 결과를 반환하는 switch 표현식
        int month = 7;
        String season = switch (month) {
            case 12, 1, 2 -> "겨울";
            case 3, 4, 5 -> "봄";
            case 6, 7, 8 -> "여름";
            case 9, 10, 11 -> "가을";
            default -> "잘못된 월";
        };
        System.out.println(month + "월은 " + season + "입니다.");
    }
}
