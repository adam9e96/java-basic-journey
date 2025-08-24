package ch13_JavaBasicPackage.sec01_Object;

class Point01 {
	private int x, y;
	public Point01(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
public class Object01 {
	public static void print(Object obj) {
		System.out.println(obj.getClass().getName()); // 클래스 이름
		System.out.println(obj.hashCode()); // 해시코드 값
		System.out.println(obj.toString()); // 객체를 문자열로 만들어 출력
		System.out.println(obj); // 객체 출력
	}
	public static void main(String[] args) {
		Point01 p = new Point01(2, 3);
		print(p);
	}

}
