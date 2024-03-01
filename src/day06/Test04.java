package day06;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        // 수열과 구간 쿼리 3
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0,3},{1,2},{1,4}};


        System.out.printf("arr: %s%n결과: %s",Arrays.toString(arr) ,Arrays.toString(solution(arr, queries)));

    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        // answer에 arr 배열 복사
        for (int i = 0; i < arr.length; i++) {
            answer[i] += arr[i];
        }

        // 서로 바꾸기
        for(int n = 0; n < queries.length; n++) {

            // 행 부분은 1까지 밖에 없으므로 고정 변수 만듬
            int i = queries[n][0];
            int j = queries[n][1];
            int tmp;

            tmp = answer[i];
            answer[i] = answer[j];
            answer[j] = tmp;
        }

        return answer;
    }
}
