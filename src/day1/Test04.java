package day1;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        // 대소문자 바꿔서 출력하기

        // 제한사항
        // 1 ≤ str의 길이 ≤ 20
        // str은 알파벳으로 이루어진 문자열입니다.

        // 입력 aBcDeFg

        // 출력 AbCdEfG

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("대소문자 변환기: ");
            String a = sc.nextLine();
            String str = ""; // 변환된 문자를 넣어줄 변수
            if (!(1 <= a.length() && a.length() <= 20)) {
                System.out.println("문자 길이를 20이하로 입력해주세요");
                continue;
            }

            for (int i = 0; i < a.length(); i++) { // a 길이까지 반복
                if (65 <= a.charAt(i) && a.charAt(i) <= 90) { // 소문자 일 때
                    str += (char) (a.charAt(i) + 32); // 소문자일 때 32를 더하면 대문자가 되므로 더해서 문자로 변환
                } else if (97 <= a.charAt(i) && a.charAt(i) <= 122) { // 대문자 일 때
                    str += (char) (a.charAt(i) - 32); // 대문자일 때 32를 빼면 소문자가 되므로 더해서 문자로 변환
                } else {
                    System.out.print("잘못입력하셨습니다. 알파벳을 입력해주세요.");
                    break;
                }
            }
            System.out.println(str);
            break;
        }
    }
}
