package ch5_loop;

public class DoWhileExample {
    public static void main(String[] args) {
        // do ~ while 문은 조건식이 맞든 틀리든 일단 한번은 실행하고 조건식 검사를 원하는 경우
        // do ~ while 문을 사용할 수 있다.
        int num = 100;
        do {
            System.out.println("적어도 한번은 출력되는 문장"); // do~while 문은 조건을 만족하지 않더라도 1번은 실행한다.
        } while (num < 10);
    }
}
