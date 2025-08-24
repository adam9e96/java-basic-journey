package ch14_Collections.sec00_generics.StudentCRUD;

public class Main {
    public static void main(String[] args) {
        // 점수를 Integer 로 사용하는 학생 관리
        StudentManager<Integer> manager = new StudentManager<>();

        // CREATE
        manager.addStudent(new Student<>(1, "홍길동", 95));
        manager.addStudent(new Student<>(2, "이몽룡", 98));
        manager.addStudent(new Student<>(3, "이춘향", 100));
        // READ
        System.out.println("전체 학생 목록:");
        manager.getAllStudents();

        // UPDATE
        System.out.println("\n[Update] id=2 학생 정보 수정");
        manager.updateStudent(2, "이오묭(수정)", 33);
        manager.getAllStudents();

        // DELETE
        System.out.println("\n[Delete] id=1 학생 삭제");
        manager.deleteStudent(1);
        manager.getAllStudents();

        // READ (단건조회)
        System.out.println("\n[Read] id=3 학생 조회");
        Student<Integer> student = manager.getStudentById(3);
        System.out.println(student);

    }
}
