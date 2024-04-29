package codingtest_basic.day24;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {

        // 특별한 이차원 배열 1

        System.out.println("result: " + Arrays.deepToString(solution(3)));
        System.out.println("result: " + Arrays.deepToString(solution(6)));
        System.out.println("result: " + Arrays.deepToString(solution(1)));

    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (i == j) answer[i][j]++;
            }
        }

        return answer;
    }
}
