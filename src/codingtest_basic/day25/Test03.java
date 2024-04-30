package codingtest_basic.day25;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 정사각형으로 만들기

        int[][] arr1 = {{572, 22, 37},{287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] arr2 = {{57, 192, 534, 2},{9, 345, 192, 999}};
        int[][] arr3 = {{1, 2},{3, 4}};

        System.out.println("result: " + Arrays.deepToString(solution(arr1)));
        System.out.println("result: " + Arrays.deepToString(solution(arr2)));
        System.out.println("result: " + Arrays.deepToString(solution(arr3)));

    }

    public static int[][] solution(int[][] arr) {
        int maxDimension = Math.max(arr.length, arr[0].length); // 열과 행을 비교하여 큰 값을 담는다
        int[][] answer = new int[maxDimension][maxDimension]; // 큰 값으로 배열 생성

        for (int i = 0; i < maxDimension; i++) {
            for (int j = 0; j < maxDimension; j++) {
                if (i < arr.length && j < arr[i].length) {
                    answer[i][j] = arr[i][j];
                } else {
                    answer[i][j] = 0;
                }
            }
        }
        return answer;
    }
}
