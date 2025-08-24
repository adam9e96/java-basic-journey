package ch14_Collections.sec00_generics.StudentCRUD;

import java.util.ArrayList;
import java.util.List;

public class StudentManager<T> {
    private List<Student<T>> students = new ArrayList<>();

    // CREATE
    public void addStudent(Student<T> student) {
        students.add(student);
    }

    // READ (전체조회)
    public void getAllStudents() {
        if (students.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
            return;
        }
        for (Student<T> s : students) {
            System.out.println(s);
        }
    }

    // READ (id로 조회)
    public Student<T> getStudentById(int id) {
        for (Student<T> s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    // UPDATE
    public boolean updateStudent(int id, String newName, T newScore) {
        Student<T> student = getStudentById(id);
        if (student != null) {
            student.setName(newName);
            student.setScore(newScore);
            return true;
        }
        return false;
    }
    // DELETE
    public boolean deleteStudent(int id) {
        Student<T> student = getStudentById(id);
        if (student != null) {
            students.remove(student);
            return true;
        }
        return false;
    }
}
