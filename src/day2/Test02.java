package day2;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        // 문자열 붙여서 출력하기
        // 두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
        // 입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
        // 입력: apple pen
        // 출력: applepen

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 문자열을 입력해주세요: ");
        String a = sc.next();
        System.out.print("두번째 문자열을 입력해주세요: ");
        String b = sc.next();

        // 제한 사항
        if (!(1 <= a.length() && a.length() <= 10 && 1 <= b.length() && b.length() <= 10))
            System.out.println("10글자 안으로 입력해주세요");
        else System.out.printf("%s",(a+b));
    }
}
