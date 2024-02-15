package day1;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        /**
         * 문제 3 - 문자열 반복해서 출력하기
         *
         * 문자열 str과 정수 n이 주어집니다.
         * str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
         *
         * 제한사항
         * 1 ≤ str의 길이 ≤ 10
         * 1 ≤ n ≤ 5
         *
         * 입력
         * string 5
         *
         * 출력
         * stringstringstringstringstring
         */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요: ");
            String str = sc.next();
            if (!(1 <= str.length() && str.length() <= 10)) {
                System.out.println("10글자 이하로 입력해주세요");
                continue;
            }
            System.out.print("횟수를 입력하세요: ");
            int n = sc.nextInt();
            if (!(1 <= n && n <= 10)) {
                System.out.println("5 이하로 입력해주세요");
                continue;
            }

            String result = "";

            for (int i = 1; i <= n; i++) {
                result += str;
            }
            System.out.println(result);
            break;
        }


        /*Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        String result = "";

        for (int i = 1; i <= n; i++) {
            result += str;
        }
        System.out.println(result);*/

    }
}
