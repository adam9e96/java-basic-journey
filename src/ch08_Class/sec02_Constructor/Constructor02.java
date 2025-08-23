package ch08_Class.sec02_Constructor;

// 생성자 만들기
// 디폴트 생성자는 컴파일러가 안만들어줌
class Korean {
    // 필드 선언
    String nation = "대한민국";
    String name;
    String ssn;

    // 생성자 선언
    public Korean(String n, String s) {
        this.name = n;
        this.ssn = s;
    }
}

public class Constructor02 {
    public static void main(String[] args) {
        // Korean 객체 생성
        Korean k1 = new Korean("박자바", "01125-1234567");
        // Korean 객체 데이터 읽기
        System.out.println("k1.nation : " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
        System.out.println();

        // 또 다른 Korean 객체 생성
        Korean k2 = new Korean("김자바", "930525-613434");
        // 또 다른 Korean 객체 데이터 읽기
        System.out.println("k2.nation : " + k2.nation);
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);
        System.out.println();
    }
}
