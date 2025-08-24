package ch13_JavaBasicPackage.sec03_boxing_unboxing;

public class AutoBoxingUnBoxingEx {
	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; // auto boxing
		System.out.println("intObject = " + intObject);
		// int -> Integer
		
		int m = intObject + 10; // auto unboxing
		System.out.println("m =  " + m);
		// Integer -> int
	}
}
