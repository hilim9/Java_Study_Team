package day02;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {


        /* 문자열 돌리기 */
        // 문자열 str이 주어집니다.
        // 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
        // 입력: abcde
        // 출력:
        // a
        // b
        // c
        // d
        // e

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요: ");
        String a = sc.next();

        // 제한 사항
        if (!(1 <= a.length() && a.length() <= 10)) {
            System.out.println("10글자 안으로 입력해주세요");
        } else {
            for (int i = 0; i < a.length(); i++) {
                System.out.printf("%c%n", a.charAt(i)); // 인덱스에 해당하는 문자를 출력
            }
        }
    }
}
