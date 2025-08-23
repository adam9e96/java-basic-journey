package ch08_Class.sec02_Constructor.constructor_study;

public class Circle02 {
	int radius;
	String name;

	public Circle02() { // 매개 변수 없는 생성자
		radius = 1; // 필드 초기화
		name = "";
	}

	public Circle02(int r, String n) { // 매개 변수를 가진 생성자
		radius = r; // 매개 변수로 필드 초기화
		name = n;
	}

	public double getArea() {
		return 3.14 * radius * radius;
	}
	

}
