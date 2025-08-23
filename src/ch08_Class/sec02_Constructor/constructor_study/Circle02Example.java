package ch08_Class.sec02_Constructor.constructor_study;

public class Circle02Example {
	public static void main(String[] args) {
		Circle02 pizza = new Circle02(10, "자바피자"); // 객체 생성. 반지름을 10으로,
		// 이름 "자바피자"로 초기화
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle02 donut = new Circle02(); // 객체 생성 반지름을 1, 이름을 "" 로 초기화
		donut.name = "도넛피자"; // 이름 변경
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);

	}
}
