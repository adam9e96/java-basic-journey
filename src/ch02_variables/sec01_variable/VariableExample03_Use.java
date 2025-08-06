package ch02_variables.sec01_variable;

// 변수를 선언 및 초기화 하고 출력해서 사용해보기
public class VariableExample03_Use {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");

        // 변수 값을 분으로 환산하여 출력
        int totalMinute = (hour * 60) + minute;
        System.out.println("총 " + totalMinute + "분");
    }
}
