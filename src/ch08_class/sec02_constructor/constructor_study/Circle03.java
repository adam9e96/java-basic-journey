package ch08_class.sec02_constructor.constructor_study;

public class Circle03 {
	private int radius;

	public Circle03(int radius) {
		this.radius = radius;
	}

	public void set(int radius) {
		this.radius = radius;
	}

	public static void main(String[] args) {
		Circle03 ob1 = new Circle03(1);
		Circle03 ob2 = new Circle03(2);
		Circle03 s;

		ob1 = ob2; // 객체 치환
		System.out.println("ob1.radius=" + ob1.radius);
		System.out.println("ob2.radius=" + ob2.radius);

	}
}
