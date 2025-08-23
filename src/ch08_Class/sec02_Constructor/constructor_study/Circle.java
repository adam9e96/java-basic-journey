package ch08_Class.sec02_Constructor.constructor_study;

public class Circle {
	public int radius; // 원의 반지름 필드
	public String name; // 원의 이름 필드

	// 객체 생성시 생성자 부터 가장 먼저 실행됨
	public Circle() { // 원의 생성자 메서드
		System.out.println("Circle 생성자 호출");
	} // 기본생성자는 안만들어도 자바에서 만들어줌
		// 생성자를 만들었으면 자바에선 기본생성자를 안만들어줌

	public double getArea() { // 원의 면적 계산 메서드
		return 3.14 * radius * radius;
	}
	 
}
