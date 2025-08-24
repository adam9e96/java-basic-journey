package ch12_Inheritance.sec03_UpDownCasting;

class Person1 {
}

class Student1 extends Person1 {
}

class Researcher extends Person1 {
}

class Professor extends Researcher {
}

public class InstanceOf01 {
	static void print(Person1 p) {
		if (p instanceof Person1) {
			System.out.print("Person1 ");
		}
		if (p instanceof Student1) {
			System.out.print("Student1 ");
		}
		if (p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if (p instanceof Professor) {
			System.out.print("Professor");
		}
	}

	public static void main(String[] args) {
		System.out.print("new Student1() -> \t");
		print(new Student1());
		System.out.println();
		System.out.print("new Researcher() -> \t");
		print(new Researcher());
		System.out.println();
		System.out.print("new Professor() -> \t");
		print(new Professor());

	}

}
