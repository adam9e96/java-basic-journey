package ch4_controlflow_switch;

public class SwitchExample02 {
    public static void main(String[] args) {

        // switch문은 int, byte, short, char, String, enum 타입을 지원
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("우수 성적");
                break;
            case 'B':
                System.out.println("보통 성적");
                break;
            case 'C':
                System.out.println("합격");
                break;
            default:
                System.out.println("재시험");
                break; // default 문에서는 break 생략 가능
        }

    }
}
