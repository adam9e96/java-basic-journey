package ch08_Class.sec04_Final;

// 상수
// 상수는 객체마다 저장할 필요가 없고 여러개의 값을 가져도 안되기
// 때문에 static 이면서 final 인 특징을 가짐

class Earth {
    // 상수 선언 및 초기화
    static final double EARTH_RADIUS = 6400;

    // 상수 선언
    static final double EARTH_SURFACE_AREA;

    // 정적 블록에서 상수 초기화
    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }
}

public class Final02 {
    public static void main(String[] args) {
        // 상수 읽기
        System.out.println("지구의 반지름: " + Earth.EARTH_RADIUS + "km");
        System.out.println("지구의 표면적: " + Earth.EARTH_SURFACE_AREA);
    }
}
