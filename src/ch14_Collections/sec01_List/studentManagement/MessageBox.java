package ch14_Collections.sec01_List.studentManagement;

import java.util.Scanner;

public class MessageBox {
	static final String black = "\u001B[30m";
	static final String red = "\u001B[31m";
	static final String green = "\u001B[32m";
	static final String yellow = "\u001B[33m";
	static final String blue = "\u001B[34m";
	static final String purple = "\u001B[35m";
	static final String cyan = "\u001B[36m";
	static final String white = "\u001B[37m";
	static final String exit = "\u001B[0m";

	// 메뉴 출력
	public int getMenu(Scanner sc) {
		int menu = -1;
		try {
			System.out.print(cyan);
			System.out.println("+----[성적 관리 프로그램]----+");
			System.out.println("| 1. 입력\t\t\t|");
			System.out.println("| 2. 출력\t\t\t|");
			System.out.println("| 3. 수정\t\t\t|");
			System.out.println("| 4. 삭제\t\t\t|");
			System.out.println("| 5. 검색\t\t\t|");
			System.out.println("| 6. 출력(총점순)\t\t|");
			System.out.println("| 7. 파일 저장\t\t|");
			System.out.println("| 8. 파일 로드\t\t|");
			System.out.println("| 0. 종료\t\t\t|");
			System.out.println("+-----------------------+");
			System.out.print(yellow);
			System.out.print(">>> 메뉴를 선택하세요: ");
			menu = sc.nextInt();
		} catch (Exception e) {
//			System.out.println(e.toString());
			noticeInputTypeMiss();
			sc.nextLine(); // 잘못된 값 버퍼 비우기
		}
		return menu;
	}

	public void getExit() {
		System.out.print(green);
		System.out.println("+-----------------------+");
		System.out.println("| 프로그램이 종료되었습니다.\t|");
		System.out.println("+-----------------------+");
		System.out.println(exit);
	}

	public static void getEmptyStudent() {
		System.out.print(red);
		System.out.println("+-------------------------------+");
		System.out.println("| 현재 등록된 학생이 없습니다.\t|");
		System.out.println("+-------------------------------+");
		System.out.println(exit);
	}

	public static void getNotFound() {
		System.out.println("+-----------------------------+");
		System.out.println("| 이름으로 null은 사용불가능 합니다.   |");
		System.out.println("+-----------------------------+");
	}

	public static void getPrintComplete() {
		System.out.println(green);
		System.out.println("+----------+");
		System.out.println("| 출력완료\t   |");
		System.out.println("+----------+");
		System.out.println(exit);
	}

	public void getErrorInput() {
		System.out.println("+--------------------------+");
		System.out.println("| 잘못입력했습니다. 다시 입력해주세요 |");
		System.out.println("+--------------------------+");
	}

	public static void noticeInputTypeMiss() {
		System.out.println("+------------------------+");
		System.out.println("| 정수를 입력해야 합니다.\t|");
		System.out.println("+------------------------+");
	}

	public static void updateComplete() {
		System.out.println("+---------------------+");
		System.out.println("| 수정이 완료되었습니다.     |");
		System.out.println("+---------------------+");
	}

	public static void deleteComplete() {
		System.out.println("+---------------------+");
		System.out.println("| 삭제가 완료되었습니다.     |");
		System.out.println("+---------------------+");
	}

	public static void searchComplete() {
		System.out.println("+-----------------------+");
		System.out.println("| 검색이 완료되었습니다. |");
		System.out.println("+-----------------------+");
	}

	public static void searchEmpty() {
		System.out.println("+---------------------+");
		System.out.println("| 검색결과가 없습니다. |");
		System.out.println("+---------------------+");
	}

	public static void makeComplete() {
		System.out.println("+-----------------------+");
		System.out.println("| 저장이 완료되었습니다. |");
		System.out.println("+-----------------------+");
	}
	public static void warnUpdate() {
		System.out.println("+-----------------------+");
		System.out.println("| 수정하려는 번호가 큽니다.\t|");
		System.out.println("+-----------------------+");
	}
	public static void warnUpdateNot() {
		System.out.println("+-------------------------------+");
		System.out.println("| 수정하려는 번호가 0 이거나 음수입니다.\t|");
		System.out.println("+-------------------------------+");
	}

	public static void loadComplete() {
		System.out.println("+---------------------------+");
		System.out.println("| 파일로드가 완료되었습니다.  |");
		System.out.println("+---------------------------+");
	}

	public static void noticeScoreError() {
		System.out.print(red);
		System.out.println("+-----------------------------+");
		System.out.println("| 점수는 0에서 100 사이여야 합니다 |");
		System.out.println("+-----------------------------+");
		System.out.print(exit);
	}
}
