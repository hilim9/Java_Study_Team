package day24;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 조건에 맞게 수열 변환하기 3

        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println("result: " + Arrays.toString(solution(arr, 3)));
        System.out.println("result: " + Arrays.toString(solution(arr, 2)));

    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 1) answer[i] = arr[i] * k; // k가 홀수 일 때
            else answer[i] = arr[i] + k; // k가 짝수 일 때
        }

        return answer;
    }
}
