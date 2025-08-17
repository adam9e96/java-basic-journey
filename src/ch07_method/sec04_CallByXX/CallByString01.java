package ch07_method.sec04_CallByXX;

/**
 * 문자열에 의한 호출 방식
 * 예외적으로 문자열을 전달하려면 참조형 데이터라도 값에 의한 호출을 함
 * <p>
 * 문자열타입도 참조자료형이긴한데 사용빈도가 높아서 String은 예외임
 *
 */
public class CallByString01 {

    public static String setAddress(String addr) {
        addr = "경기도 수원시 장안구";
        return addr;
    }

    public static void main(String[] args) {
        String address = "서울시 강남구 논현동";

        System.out.println("메소드 호출 전");
        System.out.println("address: " + address);

        address = setAddress(address);
        System.out.println("address: " + address);
        // 이렇게 하면 값에 의한 호출 방식이더라도 반환받아서 쓰기 때문에 복사되어 변경됨

        String address2 = "대구광역시 동구 각산동";
        setAddress(address2);
        System.out.println("address2: " + address2);


    }
}
