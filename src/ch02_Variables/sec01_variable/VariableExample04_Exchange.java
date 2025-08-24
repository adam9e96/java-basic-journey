package ch02_Variables.sec01_variable;

// 변수 값 교환하기
public class VariableExample04_Exchange {
    public static void main(String[] args) {
        // 변수는 또 다른 변수에 대입되어 메모리 간에 값을 복사할수 있음
        int x = 10;
        int y = 5;
        int c = x; // 변수 y에 x의 값을 대입
        System.out.println("x: " + x + ", y: " + y+", c: "+c);

        // 혹은 다른 변수를 이용해 값 교환도 가능
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x: "+ x+ ", y: "+y);

    }
}
