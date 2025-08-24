package ch14_Collections.sec01_List.studentManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassRoom {
	private ArrayList<Student> students;

	public ClassRoom() {
		this.students = new ArrayList<Student>();
	}

	// @todo 국영수 100점 이하만 받도록 개선하기 #1
	public void createStudent(Scanner sc) {

		Student st = inputValue(sc);
		if (st != null) {
			students.add(st);
		}
	}

	public void getPrint() {
		if (checkStudent()) {
			return;
		}

		System.out.print("┌───────────────────────────────────────────────────────┐\n");
		System.out.print("│번호\t이름\t국어\t영어\t수학\t총점\t평균\t│\n");

		for (int i = 0; i < students.size(); i++) {
			System.out.print("│");
			System.out.print((i + 1) + "\t");
			System.out.print(students.get(i).name + "\t");
			System.out.print(students.get(i).kor + "\t");
			System.out.print(students.get(i).eng + "\t");
			System.out.print(students.get(i).math + "\t");
			System.out.print(students.get(i).getTotal() + "\t");
			System.out.print(students.get(i).getAvg() + "\t|" + "\n");
		}

		System.out.print("└───────────────────────────────────────────────────────┘\n");
		MessageBox.getPrintComplete();
	}

	private boolean checkStudent() {
		if (students.isEmpty()) {
			MessageBox.getEmptyStudent();
			return true;
		}
		return false;
	}

	private boolean checkUpdate(int updateNum) {
		if (updateNum > students.size()) { // 수정 하려는 번호가 5이상
			MessageBox.warnUpdate();
			return false;
		}
		if (updateNum <= 0) {
			MessageBox.warnUpdateNot();
			return false;
		}
		return true;

	}

	private Student inputValue(Scanner sc) {
		String tempName = "";
		int kor, eng, math = 0;
		boolean isValid = false;

		try {
			System.out.print("이름: ");
			tempName = sc.next();

			if (tempName.equals("null")) {
				MessageBox.getNotFound();
				return null;
			} else {
				System.out.print("국어: ");
				kor = sc.nextInt();
				System.out.print("영어: ");
				eng = sc.nextInt();
				System.out.print("수학: ");
				math = sc.nextInt();
				return new Student(tempName, kor, eng, math);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
			sc.nextLine();
			MessageBox.noticeInputTypeMiss();
		}
		return null;

	}

	public void updateStudent(Scanner sc) {
		if (checkStudent()) {
			return;
		}
		int updateNum = 0;
		int idx = 0;

		System.out.print("수정 번호:");
		try {
			updateNum = sc.nextInt(); // 수정할 번호
		} catch (InputMismatchException e) {
			MessageBox.noticeInputTypeMiss();
		}

		idx = updateNum - 1;

		if (checkUpdate(updateNum)) {
			Student st = inputValue(sc);

			if (st != null) {
				students.set(idx, st);

				MessageBox.updateComplete();
			}
		}

	}

	private boolean checkDelete(int deleteNum, int idx) {
		System.out.println("checkDelete가 받는 파라미터: " + deleteNum + ", idx: " + idx);
		if (deleteNum > students.size()) {
			System.out.println("┌─────────────────────┐");
			System.out.println("│ 삭제하려는 번호가 큽니다   │");
			System.out.println("└─────────────────────┘");
			return false;
		}
		if (deleteNum <= 0) {
			System.out.println("┌─────────────────────────────┐");
			System.out.println("│ 삭제하려는 번호가 0 이거나 음수입니다  │");
			System.out.println("└─────────────────────────────┘");
			return false;
		}
		return true;

	}

	public void deleteStudent(Scanner sc) {
		if (checkStudent())
			return;

		int deleteNum = 0;
		int idx = 0;

		System.out.print("삭제할 번호: ");
		try {
			deleteNum = sc.nextInt(); // 삭제할 번호
			idx = deleteNum - 1;
		} catch (InputMismatchException e) {
			System.out.println(e);
			MessageBox.noticeInputTypeMiss();
			sc.nextLine();
			return;
		}
		System.out.println(idx);

		if (checkDelete(deleteNum, idx)) {
			students.remove(idx);
			MessageBox.deleteComplete();
		}
	}

	private boolean checkSearch(String searchName) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).name.contains(searchName))
				return true;
		}
		return false;

	}

	public void searchStudent(Scanner sc) {
		if (checkStudent())
			return;

		System.out.print("검색할 이름: ");
		String searchName = sc.next();

		if (checkSearch(searchName)) {

			System.out.print("+-------------------------------------------------------+\n");
			System.out.print("|번호\t이름\t국어\t영어\t수학\t총점\t평균\t│\n");
			for (int i = 0; i < students.size(); i++) {

				if (students.get(i).name.contains(searchName)) {
					System.out.print("|" + (i + 1) + "\t");
					System.out.print(students.get(i).name + "\t");
					System.out.print(students.get(i).kor + "\t");
					System.out.print(students.get(i).eng + "\t");
					System.out.print(students.get(i).math + "\t");
					System.out.print(students.get(i).getTotal() + "\t");
					System.out.print(students.get(i).getAvg() + "\t|" + "\n");
				}
			}
			System.out.print("+-------------------------------------------------------+\n");
			MessageBox.searchComplete();
		} else {
			MessageBox.searchEmpty();
		}
	}

	private int[] copyTotals() {
		int temp = 0;
		int[] sortTemp = new int[students.size()];

		// 1. 학생배열의 총점만 뽑아서 순차적으로 저장시킴(이름 null은 제외시켜 삭제된 학생은 X)
		for (int i = 0; i < students.size(); i++) {
			sortTemp[i] = i;

		}

		for (int i = 0; i < students.size() - 1; i++) {
			for (int j = 0; j < students.size() - 1 - i; j++) {
				if (students.get(sortTemp[j]).getTotal() < students.get(sortTemp[j + 1]).getTotal()) {
					temp = sortTemp[j];
					sortTemp[j] = sortTemp[j + 1];
					sortTemp[j + 1] = temp;
				}
			}
		}
		return sortTemp;
	}

	public void getPrintOrderByTotal() {
		if (checkStudent())
			return;

		int[] sortTemp = copyTotals();

		System.out.print("┌───────────────────────────────────────────────────────┐\n");
		System.out.print("│번호\t이름\t국어\t영어\t수학\t총점\t평균\t│\n");
		for (int i = 0; i < students.size(); i++) {
			System.out.print("|" + (sortTemp[i] + 1) + "\t");
			System.out.print(students.get(sortTemp[i]).name + "\t");
			System.out.print(students.get(sortTemp[i]).kor + "\t");
			System.out.print(students.get(sortTemp[i]).eng + "\t");
			System.out.print(students.get(sortTemp[i]).math + "\t");
			System.out.print(students.get(sortTemp[i]).getTotal() + "\t");
			System.out.print(students.get(sortTemp[i]).getAvg() + "\t|" + "\n");
		}
		System.out.print("└───────────────────────────────────────────────────────┘\n");
		MessageBox.searchComplete();
	}

	private File makeFileInstance(String fileName) {
		// 3. 페도라
		String filePathFedora = "src/ch13_end/sec07_ex/studentManagement/data/" + fileName + ".txt";

		return new File(filePathFedora); // File 객체 생성 및 반환
	}

	private File readFileInstance() {
		// data 폴더 경로
		String dirPath = "src/ch13_end/sec07_ex/studentManagement/data";
		return new File(dirPath);
	}

	public void makeFile(Scanner sc) {
		if (checkStudent())
			return;

		System.out.print("저장할 파일 이름을 입력해주세요.");
		String fileName = sc.next();
		System.out.println(fileName + ".txt 로 저장 하겠습니까? [y/N]: ");
		String isOk = sc.next();

		if (!isOk.equalsIgnoreCase("y")) {
			System.out.println("취소했습니다.");
			return;
		}

		// 파일 생성 및 저장
		File file = makeFileInstance(fileName);

		try {
			if (file.exists()) {
				System.out.println("이미 같은 이름의 파일이 있습니다. 덮어쓰겠습니까? [y/N]");
				String overWrite = sc.next();
				if (!overWrite.equalsIgnoreCase("y")) {
					System.out.println("저장을 취소했습니다.");
					return;
				}
			} else { // 파일이 존재하지 않으면
				file.createNewFile(); // 신규 파일 생성
			}

			BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));

			for (int i = 0; i < students.size(); i++) {
				bw.write(students.get(i).name + "," + students.get(i).kor + "," + students.get(i).eng + ","
						+ students.get(i).math + "," + students.get(i).getTotal() + "," + students.get(i).getAvg());
				bw.newLine();
			}
			bw.flush();
			bw.close();
			MessageBox.makeComplete();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public void readFile(Scanner sc) {

		File dir = readFileInstance();

		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("data 폴더가 존재하지 않음");
			return;
		}
		File[] files = dir.listFiles();

		if (files == null || files.length == 0) {
			System.out.println("data 폴더 안에 파일이 없음");
			return;
		}

		System.out.println("+-------------------------+");
		System.out.println("| data 폴더 안의 파일 목록  |");
		for (File file : files) {
			System.out.println("|" + file.getName() + "\t");
		}
		System.out.println("+-------------------------+");

		System.out.print("로드할 텍스트 파일이름을 입력하세요. " + " ex) save\n>>> ");
		String loadName = sc.next();

		File file = makeFileInstance(loadName);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = null;
			String[] textDump = null;
//			studentCount = 0;
			students.clear();

			while ((line = br.readLine()) != null) {
				textDump = line.split(",");
				students.add(new Student(textDump[0], Integer.parseInt(textDump[1]), Integer.parseInt(textDump[2]),
						Integer.parseInt(textDump[3]), Integer.parseInt(textDump[4]), Double.parseDouble(textDump[5])));
			}
			br.close();
			MessageBox.loadComplete();
		} catch (Exception e) {
			System.out.println(e.toString());

		}
	}
}
