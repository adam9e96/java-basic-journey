package ch04_controlflow.sec01_if;

// if 문
// 조건이 참일 때 원하는 코드를 실행시킴
public class IfExample01 {
    public static void main(String[] args) {
        // GradeChecker by only If Condition
        // score 점수가 93일때 90보다 큰지 작은지, 등급은 몇인지 조회
        // 정수형 타입을 통한 조건검증
        int score = 93;

        // 이 조건문이 실행됨
        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        // 실행 X
        if (score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }

        //  비가 오는지 확인
        // bool 타입을 통한 조건검증도 가능
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("현재 비가 오고 있습니다.");
            System.out.println("우산을 챙기세요.");
        }


    }
}
