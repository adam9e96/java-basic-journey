package ch07_method;

/**
 * 두 숫자의 합을 계산하는 메서드를 이용하여 계산하기
 */
public class Method_06_Ex {

    /**
     * 두 정수의 합을 계산하여 반환
     */
    public int add(int a, int b) {
        return a + b; // return 값은 메서드의 리턴 타입과 일치해야됨
        // return 3.5; // 리턴타입과 다른 데이터 형을 반환할려고 시도하면 오류 발생
        // return 값으로 자동형반환이 되는 경우는 문제 없음
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = 0;

        Method_06_Ex method = new Method_06_Ex();
        result = method.add(num1,num2);

        System.out.println(" 두 수의 합은: "+result);

    }
}
