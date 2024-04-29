package codingtest_basic.day20;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        // 배열의 길이에 따라 다른 연산하기

        int[] arr1 = {49, 12, 100, 276, 33};
        int[] arr2 = {444, 555, 666, 777};

        System.out.println(Arrays.toString(solution(arr1, 27)));
        System.out.println(Arrays.toString(solution(arr2, 100)));

    }

    public static int[] solution(int[] arr, int n) {
        int[] answer = Arrays.copyOfRange(arr, 0, arr.length);

        if (arr.length % 2 == 0) { // 짝수 일 때
            for (int i = 1; i < arr.length; i+=2) answer[i] += n; // 홀수 인덱스에 n을 더한다
        } else { // 홀수 일 때
            for (int i = 0; i < arr.length; i+=2) answer[i] += n; // 짝수 인덱스에 n을 더한다
        }

        return answer;
    }
}
