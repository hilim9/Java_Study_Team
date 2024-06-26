package codingtest_beginner.day10;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {

        // 2차원으로 만들기

        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] num_list2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};

        System.out.println("result: " + Arrays.deepToString(solution(num_list1, 2)));
        System.out.println("result: " + Arrays.deepToString(solution(num_list2, 3)));

    }

    public static int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int idx = 0;

        for (int i = 0; i < num_list.length / n; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[idx++];
            }
        }
        return answer;
    }
}
