package codingtest_beginner.day02;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 분수의 덧셈

        System.out.println("result: " + Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println("result: " + Arrays.toString(solution(9, 2, 1, 3)));

    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int numerator = numer1 * denom2 + numer2 * denom1; // 분자
        int denominator = denom1 * denom2; // 분모
        int maxNum = 1; // 최대공약수

        // 최대공약수 찾기
        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if (denominator % i == 0 && numerator % i == 0) { // 분자와 분모가 모두 0으로 떨어질 때
                maxNum = i;
            }
        }

        int[] answer = {numerator / maxNum, denominator / maxNum};

        return answer;
    }
}
