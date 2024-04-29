package codingtest_basic.day15;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        // 조건에 맞게 수열 변환하기 1
        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(Arrays.toString(solution(arr)));

    }

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] >= 50) answer[i] = arr[i] / 2; // 50보다 크거나 같은 짝수일 때 2로 나눈다.
            else if (arr[i] % 2 == 1 && arr[i] < 50) answer[i] = arr[i] * 2; // 50보다 작은 홀수라면 2를 곱한다.
            else answer[i] = arr[i];
        }

        return answer;
    }
}
