package ch07_Method.sec03_OverLoading;

/**
 * 메서드 오버로딩
 * 매개변수의 타입 or 갯수가 다르면 같은 이름을 가진 메서드를 재정의 할 수 있음.
 */
public class Method01_OverLoading {
    public static void main(String[] args) {

        // 메서드 오버로딩: 데이터 타입과 개수가 다르면 가능
        printGreet();
        printGreet("안녕~"); // 안녕~
        printGreet("현수", "잘지내셨나요?");
        printGreet(3);
        System.out.println(printGreet(3, 4, 5));
    }

    public static void printGreet() { // 매개변수가 없는 메소드
        System.out.println("printGreet() 메서드가 실행됨");
    }

    public static void printGreet(String greeting) { // String 타입 1개인 printGreet 메서드
        System.out.println("printGreet(String greeting) 메서드가 실행됨");
        System.out.println(greeting);
    }

    public static void printGreet(String name, String greeting) { // String 타입 2개인 printGreet 메서드
        // 매개변수가 문자열인 메서드가 있으나 개수가 달라서 재정의 가능
        System.out.println("printGreet(String name, String greeting) 메서드가 실행됨");
        System.out.println(name + "님!" + greeting);
    }

    public static void printGreet(int cnt) { // int 타입이 1개인 메서드
        // 매개변수가 하나인 메서드가 있지만 데이터 타입이 달라 재정의 가능
        System.out.println("printGreet(int cnt) 메서드가 실행됨");
        System.out.println("안녕하세요." + cnt + "번째 보는 거네요");
    }

    public static int printGreet(int a, int b, int c) { // 리턴 타입이 달라도 상관없음
        // int 타입이 3개인 메서드
        return a + b + c;

    }
}
