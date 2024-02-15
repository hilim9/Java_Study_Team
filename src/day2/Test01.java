package day2;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        // 덧셈식 출력하기
        // 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
        // 입력: 4 5
        // 출력: 4 + 5 = 9

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력해주세요: ");
        int a = sc.nextInt();
        System.out.print("두번째 정수를 입력해주세요: ");
        int b = sc.nextInt();

        if (!(1 <= a && a <= 100 && 1 <= b && b <= 100))
            System.out.print("1에서 100사이로 입력해주세요");
        else System.out.printf("%d + %d = %d",a,b,(a+b));

    }
}
