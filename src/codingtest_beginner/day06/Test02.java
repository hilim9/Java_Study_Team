package codingtest_beginner.day06;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        // 직각삼각형 출력하기

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
