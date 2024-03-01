package day07;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        // 수열과 구간 쿼리 4
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};


        System.out.printf("arr: %s%n결과: %s",Arrays.toString(arr) ,Arrays.toString(solution(arr, queries)));

    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];

        // answer에 arr 배열 복사
        for (int i = 0; i < arr.length; i++) {
            answer[i] += arr[i];
        }

        for (int n = 0; n < queries.length; n++) {

            int s = queries[n][0];
            int e = queries[n][1];
            int k = queries[n][2];

            for (int i = s; i <= e; i++) { // s부터 e까지 반복
                if (i % k*2 == 0) answer[i] += 1; // i가 k의 배수 이면 answer[i]에 1을 더함
                //System.out.println(Arrays.toString(answer));
            }
        }
        return answer;
    }
}
