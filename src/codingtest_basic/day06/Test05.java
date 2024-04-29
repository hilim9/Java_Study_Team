package codingtest_basic.day06;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {

        // 수열과 구간 쿼리 2
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};

        System.out.println("결과: " + Arrays.toString(solution(arr, queries)));

    }

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int n = 0; n < queries.length; n++) {

            int s = queries[n][0];
            int e = queries[n][1];
            int k = queries[n][2];
            int tmp = 1000000; // 0으로 초기화 하면 가장 작은 수가 0이므로 변하지 않음
            int count = 0;

            // Math.min() 함수는 주어진 숫자들 중 가장 작은 값을 반환
            for (int i = s; i <= e; i++) { // s부터 e까지 반복
                if (arr[i] > k) { // arr[i]가 k보다 클 때
                    tmp = Math.min(tmp, arr[i]); // tmp와 arr[i]중 작은값 비교하여 tmp에 넣어줌
                    //System.out.println("tmp: " + tmp);
                } else {
                    count++; // arr[i]가 k보다 크지 않을 때 count 변수 증가
                   // System.out.println("count: " + count);
                }
            }

            if (count == (e - s) +1) answer[n] += -1; // count 값과 같다면 일치하는것이 없으므로 -1 저장. 인덱스가 0부터 시작하므로 +1 더한 수와 비교해야 함
            else answer[n] += tmp; // count 값과 다르다면 일치하는 것이 있으므로 tmp값 저장

        }
        return answer;
    }

}
