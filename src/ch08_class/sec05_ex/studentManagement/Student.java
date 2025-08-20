package ch08_class.sec05_ex.studentManagement;

/**
 * 학생 클래스
 */
public class Student {
	String name;
	int kor;
	int math;
	int eng;
	private int total;
	private double avg;

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(String name, int kor, int eng, int math, int total, double avg) {
		this(name, kor, eng, math);
		this.total = total;
		this.avg = avg;
	}

	public void calSum() {
		total = this.kor + this.math + this.eng;
	}

	public void calAvg() {
		if (this.total != 0) {
			avg = this.total / 3.0;
		} else {
			avg = 0.0;
		}
	}

	public void printStudent() {
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("수학: " + math);
		System.out.println("영어: " + eng);
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);

	}

	public int getTotal() {
		return this.total;
	}

	public String getAvg() {
//		return this.avg;
		return String.format("%.2f", avg);
	}

}
