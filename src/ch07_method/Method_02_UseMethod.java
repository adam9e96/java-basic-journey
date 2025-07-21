package ch07_method;

import java.util.Scanner;

/**
 * 성적 관리 시스템
 * 메소드를 이용한 경우
 * <p>
 * 동일한 기능을 한 번만 작성하면됨
 * 학점 기준 변경시 calculateGrade 메서드만 수정하면됨
 * 각 기능이 명확하게 분리되어 가독성 향상됨
 * 새 학생 추가시 processStudent("학생4"); 한줄만 추가하면됨
 */
public class Method_02_UseMethod {
    static Scanner scanner = new Scanner(System.in);

    // 점수 입력 메서드
    static int[] inputScores(String studentName) {
        System.out.println("=== " + studentName + " ===");
        System.out.print("국어 점수: ");
        int korean = scanner.nextInt();
        System.out.print("영어 점수: ");
        int english = scanner.nextInt();
        System.out.print("수학 점수: ");
        int math = scanner.nextInt();

        return new int[]{korean, english, math};
    }

    // 총점 계산 메서드
    static int calculateTotal(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    // 평균 계산 메서드
    static double calculateAverage(int total, int count) {
        return (double) total / count;
    }

    // 학점 계산 메서드
    static String calculateGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    // 결과 출력 메서드
    static void printResult(int total, double average, String grade) {
        System.out.println("총점: " + total);
        System.out.println("평균: " + String.format("%.1f", average));
        System.out.println("학점: " + grade);
        System.out.println();
    }

    // 한 학생의 성적을 처리하는 메서드
    static void processStudent(String studentName) {
        int[] scores = inputScores(studentName);
        int total = calculateTotal(scores);
        double average = calculateAverage(total, scores.length);
        String grade = calculateGrade(average);
        printResult(total, average, grade);
    }

    public static void main(String[] args) {
        processStudent("학생 1");
        processStudent("학생 2");
        processStudent("학생 3");

        scanner.close();
    }
}