package codingtest_beginner.day03;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        // 짝수는 싫어요

        System.out.println("result: " + Arrays.toString(solution(10)));
        System.out.println("result: " + Arrays.toString(solution(15)));

    }

    public static int[] solution(int n) {
        int[] answer = new int[(n+1) / 2];

        for (int i = 0, j = 1; j <= n; i++, j+=2) answer[i] = j;

        return answer;
    }
}
