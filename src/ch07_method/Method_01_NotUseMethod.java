package ch07_method;

import java.util.Scanner;

/**
 * 성적 관리 시스템
 * 메서드를 사용하지 않은 경우
 * <p>
 * 문제점
 * 동일한 코드가 3번 반복됨
 * 학점로직에 수정이 필요한 경우 3곳을 수정해야됨
 * <p>
 * 코드가 길어서 가독성이 떨어짐
 * 실수로 한 곳만 수정하면 일관성이 깨짐
 */
// 메서드를 사용하지 않은 경우

public class Method_01_NotUseMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학생 1의 성적 처리
        System.out.println("=== 학생 1 ===");
        System.out.print("국어 점수: ");
        int korean1 = scanner.nextInt();
        System.out.print("영어 점수: ");
        int english1 = scanner.nextInt();
        System.out.print("수학 점수: ");
        int math1 = scanner.nextInt();

        int total1 = korean1 + english1 + math1;
        double average1 = total1 / 3.0;
        String grade1;
        if (average1 >= 90) {
            grade1 = "A";
        } else if (average1 >= 80) {
            grade1 = "B";
        } else if (average1 >= 70) {
            grade1 = "C";
        } else if (average1 >= 60) {
            grade1 = "D";
        } else {
            grade1 = "F";
        }

        System.out.println("총점: " + total1);
        System.out.println("평균: " + String.format("%.1f", average1));
        System.out.println("학점: " + grade1);
        System.out.println();

        // 학생 2의 성적 처리 (동일한 코드 반복)
        System.out.println("=== 학생 2 ===");
        System.out.print("국어 점수: ");
        int korean2 = scanner.nextInt();
        System.out.print("영어 점수: ");
        int english2 = scanner.nextInt();
        System.out.print("수학 점수: ");
        int math2 = scanner.nextInt();

        int total2 = korean2 + english2 + math2;
        double average2 = total2 / 3.0;
        String grade2;
        if (average2 >= 90) {
            grade2 = "A";
        } else if (average2 >= 80) {
            grade2 = "B";
        } else if (average2 >= 70) {
            grade2 = "C";
        } else if (average2 >= 60) {
            grade2 = "D";
        } else {
            grade2 = "F";
        }

        System.out.println("총점: " + total2);
        System.out.println("평균: " + String.format("%.1f", average2));
        System.out.println("학점: " + grade2);
        System.out.println();

        // 학생 3의 성적 처리 (또 다시 동일한 코드 반복)
        System.out.println("=== 학생 3 ===");
        System.out.print("국어 점수: ");
        int korean3 = scanner.nextInt();
        System.out.print("영어 점수: ");
        int english3 = scanner.nextInt();
        System.out.print("수학 점수: ");
        int math3 = scanner.nextInt();

        int total3 = korean3 + english3 + math3;
        double average3 = total3 / 3.0;
        String grade3;
        if (average3 >= 90) {
            grade3 = "A";
        } else if (average3 >= 80) {
            grade3 = "B";
        } else if (average3 >= 70) {
            grade3 = "C";
        } else if (average3 >= 60) {
            grade3 = "D";
        } else {
            grade3 = "F";
        }

        System.out.println("총점: " + total3);
        System.out.println("평균: " + String.format("%.1f", average3));
        System.out.println("학점: " + grade3);

        scanner.close();
    }
}