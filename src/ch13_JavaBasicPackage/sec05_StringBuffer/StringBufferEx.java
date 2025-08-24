package ch13_JavaBasicPackage.sec05_StringBuffer;

public class StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");

		sb.append(" is pencil"); // 문자열 덧붙이기
		System.out.println(sb);
	
		sb.insert(7, " my"); // "my" 문자열 삽임
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // "my"를 "your"로 변경
		System.out.println(sb);
		
		sb.delete(8, 13); // "your " 삭제
		System.out.println(sb);
		
		sb.setLength(4); // 스트림 버퍼 내 문자열 길이 수정
		System.out.println(sb);
	}
}
