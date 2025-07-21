package ch04_controlflow_switch;

public class SwitchExample01 {
    public static void main(String[] args) {
        // 스위치문을 사용하여 요일 출력
        int dayOfWeek = 3; // 1: 월요일, 2: 화요일, ..., 7: 일요일
        String day = "";

        switch (dayOfWeek) {
            case 1:
                day = "월요일";
                break;
            case 2:
                day = "화요일";
                break;
            case 3:
                day = "수요일";
                break;
            case 4:
                day = "목요일";
                break;
            case 5:
                day = "금요일";
                break;
            case 6:
                day = "토요일";
                break;
            case 7:
                day = "일요일";
                break;
            default:
                day = "잘못된 입력입니다.";
        }

        System.out.println("오늘은 " + day + "입니다.");
    }
}
