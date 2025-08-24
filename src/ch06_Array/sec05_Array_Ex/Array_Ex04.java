package ch06_Array.sec05_Array_Ex;

public class Array_Ex04 {
	public static void main(String[] args) {
		
		// 배열 초기화
		int[] arrays = {5, 1, 2, 4, 3};
		
		// 배열 출력
//		for(int n: arrays) {
//			System.out.println("["+n+"]");
//		}
		System.out.println();
		
		for(int i = 0; i<arrays.length; i++) {
			System.out.println("["+i+"]"+" = "+arrays[i]);
		}

		// arrays[i] = 5
		// arrays[i] = 1
		// .. arraysp4]
		
		// 배열 값 변경
//		int temp = arrays[1];
//		arrays[1] = arrays[4];
//		arrays[4] = temp;

		arrays[1] = 7;
		arrays[4] = 8;
		System.out.println("배열 값 변경");
//		for(int n: arrays) {
//			System.out.println(n);
//		}


		for(int i=0; i<arrays.length; i++) {
			System.out.println("["+i+"]"+" = "+arrays[i]);
		}
		
	}
}
