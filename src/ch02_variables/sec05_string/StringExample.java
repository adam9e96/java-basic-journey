package ch02_variables.sec05_string;

/**
 * 작은 따옴표('')로 감싼 한 개의 문자는 char 타입,
 * 큰 따옴표("")로 감싼 여러 개의 문자들은 유니코드로 변환되지 않는다.
 */
public class StringExample {
    public static void main(String[] args) {
//        char var1 = "A"; // 컴파일 에러
//        char var2 = "홍길동"; // 컴파일 에러
        // 큰 따옴표로 감싼 문자들을 문자열이라고 한다.
        // 문자열을 변수에 저장하고 싶으면 String 타입을 사용한다
        String var1 = "A";
        String var2 = "홍길동";
        // String 타입은 기본타입에 속하지 않는 참조 타입이다.
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        str = "번호\t이름\t직업";
        System.out.println(str);

        System.out.print("나는\n");
        System.out.print("자바를\n");
        System.out.print("배웁니다");
        // 문자열 안에는 이스케이프 문자를 사용할 수 있다.
    }
}
