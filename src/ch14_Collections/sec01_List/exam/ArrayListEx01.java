package ch14_Collections.sec01_List.exam;

import java.util.ArrayList;
import java.util.Scanner;

// 한라인을 입력받아 각 문자열을 ArrayList<String>에 저장하고, ArrayList 에 중복된 문자열을 제거하여 중복된 문자열이 없는 상태로
// 만들어라. 그리고 이를 출력하는 프로그램을 작성하라.
public class ArrayListEx01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        while (true) {
            System.out.print("문자열들을 입력하세요>>");
            String input = sc.nextLine();

            if (input.equals("그만")) {
                break;
            }
            String[] splitInput = input.split(" ");
            for (String s : splitInput) {
                if (!arrayList.contains(s))
                    arrayList.add(s);
            }

            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i) + "\t");
            }
            System.out.println();
            arrayList.clear();

        }
        sc.close();
    }
}
