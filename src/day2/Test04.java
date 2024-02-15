package day2;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        /* 홀짝 구분하기 */
        // 자연수 n이 입력으로 주어졌을 때 만약 n이 짝수이면 "n is even"을, 홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
        // 입력: 100
        // 출력: 100 is even

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요: ");
        int n = sc.nextInt();

        if (!(1 <= n && n <= 1000)) System.out.println("1 ~ 1000사이로 입력해주세요");
        else System.out.print(n % 2 == 0 ? n + " is even" : n + " is odd");

    }
}
