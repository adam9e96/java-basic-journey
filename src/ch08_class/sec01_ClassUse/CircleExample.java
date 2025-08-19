package ch08_class.sec01_ClassUse;

public class CircleExample {
	public static void main(String[] args) {
		Circle pizza; // Circle 객체에 대한 레퍼런스 변수 pizza 선언

		pizza = new Circle(); // Circle 객체 생성

		pizza.radius = 10; // radius 필드에 10 저장
		pizza.name = "자바피자"; // name 필드에 "자바피자"저장
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);

		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area);
	}
}
