package ch08_Class.sec01_ClassUse;

class HighSchool {
    String name;
    String ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        return (kor + eng + math);
    }

    double getAverage() {
        double avg;
        avg = getTotal() / 3.0;
        return avg;
    }
}

public class ClassExample03 {
    public static void main(String[] args) {
        HighSchool student = new HighSchool();
        student.name = "홍길동";
        student.ban = "1";
        student.no = 1;
        student.kor = 100;
        student.eng = 60;
        student.math = 76;

        System.out.println("이름: " + student.name);
        System.out.println("총점: " + student.getTotal());
        System.out.println("평균: " + student.getAverage());
    }
}
