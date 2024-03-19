package day14;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {

        // 수열과 구간 쿼리 1

        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0,1},{1,2},{2,3}};

        System.out.println("result: " + Arrays.toString(solution(arr, queries)));

    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length); // 배열 복사

        for (int n = 0; n < queries.length; n++) {
            int start_idx = queries[n][0];  // 시작 인덱스
            int end_idx = queries[n][1];    // 마지막 인덱스

            for (int i = start_idx; i <= end_idx; i++) {
                answer[i]++;
            }
        }

        return answer;
    }
}
