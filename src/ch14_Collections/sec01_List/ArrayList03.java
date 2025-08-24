package ch14_Collections.sec01_List;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private int studentID;
    private String name;
    String department;

    public Student(int studentId, String name, String department) {
        this.studentID = studentId;
        this.name = name;
        this.department = department;
    }

    public void profileInfo() {
        System.out.println(
                "학번 : " + studentID +
                        "|| 이름 : " + name +
                        "|| 부서 : " + department);
    }
}

public class ArrayList03 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(2025, "꼬북이", "강마을"));
        list.add(new Student(2024, "토게피", "의료마을"));
        list.add(new Student(2023, "파이리", "불마을"));

        // ArrayList 안의 Student 객체의 학번, 이름, 위치
        // 1. 일반 for문, 2. 향상된 for문, 3. Iterator 사용해서 출력하기
        System.out.println("===== 일반 for =====");
        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
            st.profileInfo();
        }
        System.out.println("===== 향상된 for =====");
        for (Student s : list) {
            s.profileInfo();
        }
        System.out.println("===== Iterator =====");
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student stu = it.next();
            stu.profileInfo();
        }
    }
}
