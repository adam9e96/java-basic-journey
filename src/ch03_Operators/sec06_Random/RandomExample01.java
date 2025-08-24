package ch03_Operators.sec06_Random;

import java.util.Random;

public class RandomExample01 {

	public static void main(String[] args) {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		int num = random.nextInt(5);
		
		System.out.print(num);

	}

}
