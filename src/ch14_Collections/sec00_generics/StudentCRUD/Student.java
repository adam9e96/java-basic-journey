package ch14_Collections.sec00_generics.StudentCRUD;

// 제네릭을 활용한 학생 관리 프로그램 제네릭+ 컬렉션(List)기반으로 CRUD
public class Student<T> {
    private int id;
    private String name;
    private T score; // 제네릭 타입: 점수 자료형을 유연하게 설정 가능

    public Student(int id, String name, T score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public void setScore(T score) {
        this.score = score;
    }
}
