package ch02_variables.sec08_type_conversion;

// 큰타입 -> 작은타입으로 변환할 땐 명시적 형 변환(casting)이 필요하고
// 데이터 손실 가능성이 있음
public class ForcedConversionExample01 {
    public static void main(String[] args) {
        double d = 9.99;
        int i = (int) d; // 강제 변환 (소수점 제거)

        int big = 300;
        byte b = (byte) big; // 300은 byte 범위 초과 → 값 손실 발생

        System.out.println("int i : " + i);   // 9
        System.out.println("byte b : " + b);  // 44 (오버플로우 결과)
    }
}
