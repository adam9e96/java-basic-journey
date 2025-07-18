package ch06_array;

public class Array_01_WhyUseArrays {
    public static void main(String[] args) {
        /*
         * 학생 5명의 성적을 가지고 총점과 평균을 구함
         * case1) 배열을 사용하지 않는 경우
         * 만 해
         */
        int score001 = 95;
        int score002 = 76;
        int score003 = 67;
        int score004 = 56;
        int score005 = 87;

        int total = score001 + score002 + score003 + score004 + score005; // 학생 5명 성적의 총합
        double avg = (double) total / 5; // 학생 5명 성적의 평균
        System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");

        /*
         * 문제점
         * 1. 기존 방식 (배열을 사용하지 않는 방식)
         * 변수(학생)가 추가될 때마다
         * > 변수를 추가로 선언
         * > total 변수에 더하기
         * > avg 변수도 수정해야된다.
         *
         * 2. 배열을 사용하는 경우
         * 학생 성적을 배열로 저장해서 관리하면 for 문을 사용하여 총점을 계산가능
         * 총점 계산 코드를 수정할 필요가 없어짐
         */

        // case2) 배열을 사용하는 방식
        total = 0;
        int[] scores = {95, 76, 67, 56, 87}; // 학생 성적 추가가 필요한 경우: scores 변수에만 수정하면 됨

        for (int i = 0; i < scores.length; i++) { // scores.length -> 배열의 길이(배열의 갯수) // 현재 크기는 5
            total += scores[i];
        }
        avg = (double) total / scores.length; // 학생 성정 평균
        System.out.println("총점은 " + total + "점이고, 평균은 " + avg + "입니다.");

        /*
         * new 키워드가 안보이는 경우
         * 원래라면 new int[5]; 를 해야 하는데 개발자가 일일히 만들고 초기화 하는게 귀찮으니
         * 바로 배열생성 및 초기화를 하는 경우는 `new` 키워드는 알아서 적용 되도록 했다.
         */

        /*
         * for문의 주 사용 용도는 반복문이며, 배열에서 자주 사용된다.
         */
    }
}
