package day5;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 주사위 게임

        System.out.println(solution(2, 6, 1));
        System.out.println(solution(5, 3, 3));
        System.out.println(solution(4, 4, 4));

    }
    public static double solution(int a, int b, int c) {
        double answer = 0;

        /* 조건식 순서 */
        // 모두 다를 때
        // a와 b가 같을 때
        // a와 c가 같을 때
        // b와 c가 같을 때
        // 모두 같을 때

        if (a != b && a != c && b != c) answer = a + b + c;
        else if (a == b && b != c) answer = (a + b + c) * ((Math.pow(a, 2)* 2) + Math.pow(c,2));
        else if (a == c && b != c) answer = (a + b + c) * ((Math.pow(a, 2)* 2) + Math.pow(b,2));
        else if (b == c && a != c) answer = (a + b + c) * ((Math.pow(b, 2)* 2) + Math.pow(a,2));
        else answer = (a * 3) * (Math.pow(a, 2) * 3) * (Math.pow(a,3) * 3);

        return answer;
    }
}
