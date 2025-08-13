package ch09_FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class File01 {
	public static void main(String[] args) {
		
		String filePath = "D:\\temp\\save.txt";
//		String filePath2 = "save.txt";
		
		File file = new File(filePath); // File 객체 생성
		
		try {
			if(!file.exists()) { // 파일이 존재하지 않으면
				file.createNewFile(); // 신규 파일 생성
			}
			// BufferedWriter 생성
			BufferedWriter w = new BufferedWriter(
					new FileWriter(file,false));
			

			for(int i = 0; i < 5; i++) {
				String str = "홍길동,80,70,60,50";
				
				w.write(str);
				w.newLine();
			}
			
	
			// 버퍼 및 스트림 뒷정리
			w.flush(); // 버퍼의 남은 데이터를 모두 쓰기
			w.close(); // 스트림 종료 
			
			System.out.println("저장 완료");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
