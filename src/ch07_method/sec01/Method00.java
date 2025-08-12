package ch07_method.sec01;

public class Method00 {
	public static void myPrint() {
		System.out.println("제목입니다1");
	}
	public static void myPrint2(int a) {
		System.out.println("제목입니다 . "+ a);
	}
	public static void myPrint3(int a, int b) {
		System.out.println("제목입니다 . "+ a);
		System.out.println("제목입니다 . "+ b);

	}
	public static int myPrint4(int a, int b) {
		System.out.println("인자1: "+ a);
		System.out.println("인자2: "+ b);
		
		return a+b;

	}
	
	public static void main(String[] args) {
		System.out.println("메인 1");
//		myPrint2(5);
//		myPrint3(2, 3);
		int a = myPrint4(2, 3);
		System.out.println("리턴 값: " + a);
		System.out.println("메인 2");
	}

}
