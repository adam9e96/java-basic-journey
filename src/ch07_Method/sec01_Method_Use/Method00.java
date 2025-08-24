package ch07_Method.sec01_Method_Use;

/**
 * 메서드를 쓰면 같은 코드를 여러번 작성하지않아도 되고(중복 제거=> 재사용성)
 * 메서드 myPrint(2,3) 이렇게 main에서는 한눈에 안들어오는데 2와 3
 * 정수를 출력하는 메서드라고 한눈에 들어옴 -> 코드 가독성 향상(이름으로 의미전달)
 * 유지보수도 용이함
 * -> 나중에 출력 형식을 바꾸고 싶으면 메서드 내부 코드만 수정하면 됨
 * -> 만약 메서드없이 main에 작성했다면 전부 수정해야 됨
 * 입력과 출력 관리 용이(매개변수 + 리턴값)
 * myPrint4(int a, int b) 처럼 입력(매개변수)을 받아서 출력(return값)을 줄 수 있음
 * ex) int result = add(5, 3); -> result를 다른 계산에 바로 활용 가능
 */
public class Method00 {
    public static void myPrint() {
        System.out.println("제목입니다1");
    }

    public static void myPrint2(int a) {
        System.out.println("제목입니다 . " + a);
    }

    public static void myPrint3(int a, int b) {
        System.out.println("제목입니다 . " + a);
        System.out.println("제목입니다 . " + b);
    }

    public static int myPrint4(int a, int b) {
        System.out.println("인자1: " + a);
        System.out.println("인자2: " + b);
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("메인 1");
        myPrint2(5);
        myPrint3(2, 3);
		int a = myPrint4(2, 3);
		System.out.println("리턴 값: " + a);
		System.out.println("메인 2");
    }

}
