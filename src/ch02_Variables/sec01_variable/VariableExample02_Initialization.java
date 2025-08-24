package ch02_Variables.sec01_variable;

public class VariableExample02_Initialization {
    public static void main(String[] args) {
        // 변수 value 선언
        int value = 0; // 초기화를 하지않으면 컴파일 오류

        // 연산 결과를 변수 result의 초기값으로 대입
        int result = value + 10; // 컴파일 오류 발생
        // 현재는 0으로 초기화 하여 해결

        // 변수 result 값을 읽고 콘솔에 출력
        System.out.println(result);
    }
}
