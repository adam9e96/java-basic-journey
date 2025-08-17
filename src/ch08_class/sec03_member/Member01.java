package ch08_class.sec03_member;

class Student {
    // 인스턴스 멤버 (객체마다 개별적으로 존재함)
    String name; // 학생 이름
    int score; //학생 점수

    // 정적 멤버 (모든 객체가 공유)
    static int studentCount = 0; // 전체 학생 수

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
        studentCount++; // 객체가 생성될 때마다 1 증가
    }

    // 인스턴스 메서드
    void showInfo() {
        System.out.println("이름: " + name + ", 점수: " + score);
    }

    // 정적 메서드
    static void showStudentCount() {
        System.out.println("총 학생 수: " + studentCount);
    }
}

public class Member01 {
    public static void main(String[] args) {
        Student s1 = new Student("철수", 99);
        Student s2 = new Student("영희", 3);

        // 인스턴스 멤버는 객체를 통해 접근가능
        s1.showInfo();
        s2.showInfo();

        // 정적 멤버는 클래스명으로 접근
        Student.showStudentCount();
    }
}
