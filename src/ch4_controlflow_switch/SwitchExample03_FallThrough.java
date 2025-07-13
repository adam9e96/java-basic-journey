package ch4_controlflow_switch;

public class SwitchExample03_FallThrough {
    public static void main(String[] args) {
        // Fall-through
        // switch문에서 case 문이 break 없이 이어지는 현상
        int month = 7; // 1월부터 12월까지
        String season = "";

        switch (month) {
            case 12: // 12월
            case 1:  // 1월
            case 2:  // 2월
                season = "겨울";
                break; // 겨울이므로 break
            case 3:  // 3월
            case 4:  // 4월
            case 5:  // 5월
                season = "봄";
                break; // 봄이므로 break
            case 6:  // 6월
            case 7:  // 7월
            case 8:  // 8월
                season = "여름";
                break; // 여름이므로 break
            case 9:  // 9월
            case 10: // 10월
            case 11: // 11월
                season = "가을";
                break; // 가을이므로 break
            default:
                season = "잘못된 월"; // 잘못된 입력 처리
        }
        // 결과 출력
        System.out.println(month + "월은 " + season + "입니다.");
    }
}
