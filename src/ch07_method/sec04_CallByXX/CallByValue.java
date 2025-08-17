package ch07_method.sec04_CallByXX;

/**
 * 값에 의한 호출 방식
 * 값에 의한 호출 방식은 메서드 호출 시에 값이 복사되어 전달됨.
 * 메서드의 매개변수 타입이 '기본형 데이터' 일 때 값에 의한 호출임
 */
public class CallByValue {
    // increase() 호출 시에 n이라는 매개변수가 메모리에 생성되어 var1변수의 값 100이 복사됨
    // 메모리 실행이 종료되면 매개변수 n은 메모리에서 소멸됨
    // 값에 의한 호출 시 매개변수로 전달되는 값이 복사되어 전달
    // -> 결론은 var1 변수의 값은 변하지않음
    public static int increase(int n) {
        return ++n;
    }

    public static void main(String[] args) {
        int var1 = 100;
        int result = increase(var1); //값에 의한 호출을 이용할려면 반환 받아서 쓰면됨

        System.out.println("var1: " + var1 + ", result: " + result);
    }
}
