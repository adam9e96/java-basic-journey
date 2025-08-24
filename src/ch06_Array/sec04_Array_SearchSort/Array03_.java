package ch06_Array.sec04_Array_SearchSort;

import java.util.Random;

// 로또 중복없이 뽑기
public class Array03_ {
	public static void main(String[] args) {
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		int[] arr = new int[5];

//		// 0, 1, 2, 3, 4
//
//			for(int i = 0; i < 5; i++) {
//				arr[i] = random.nextInt(5)+ 1; // 45임 원복
//				System.out.println("ㅁ: " + i + "번: "+arr[i]);
//				// 중복 검사
//				if (i!= 0) {
//					// 
//					// 만약 i가 1+일때라면
//					for(int j = 0; j < i; j++) {						
//						// 0 과 1 검사
//						if ( arr[i] == arr[j] ) {
//							arr[i] = random.nextInt(45) + 1;
//						}
//						
//					}
//				} else {
//					continue;
//				}
//			}
		int s = 0;
		int count = 0; // [2 ] [4 ] [ 5] [ ]
		
		while(true) {
			
		
			
			// 탈출
			if (count == 5) {
				break;
			}
			
			// 중복검사(여긴 4번 실행)
			if (count > 0) {
				 s = count;
				 

				while(s != 0) { // n = 3
					System.out.println("중복검사로직실행"+
				count+"\t"+arr[s-1]);
					if( arr[count] == arr[s-1]) {
						arr[count] = random.nextInt(5) + 1;
						s = count;
						System.out.print("중복뜸" + s + "ㅁ");
					} else {
						s--;
					}
				}
				// 중복 통과 후 뽑기
				arr[count] = random.nextInt(5) + 1;
				count++;
			}
				
		}
		
		
		// 출력
		for(int n: arr) {
			System.out.print(n+"\t\t");
		}
		
		
		
	}
}
