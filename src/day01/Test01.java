package day01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        // 문자열 출력하기

        // 제한사항
        // 1 ≤ str의 길이 ≤ 1,000,000
        // str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.

        // 입력 HelloWorld!

        // 출력 HelloWorld!

        Scanner sc = new Scanner(System.in);
        System.out.print("문자를 입력해주세요: ");
        String str = sc.next();

        // 제한사항
        if (!(1 <= str.length() && 1000000 >= str.length())) System.out.println("길이에 맞춰 입력해주세요");
        else System.out.print(str);
    }
}
