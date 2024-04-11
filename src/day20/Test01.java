package day20;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        // 배열의 길이를 2의 거듭제곱으로 만들기

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {58, 172, 746, 89};

        System.out.println("result: " + Arrays.toString(solution(arr1)));
        System.out.println("result: " + Arrays.toString(solution(arr2)));

    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        int num = 0;

        for (int i = 1; Math.pow(2, i) <= arr.length; i++) {
            num = i; // 2의 몇 제곱인지 num에 저장
            if (Math.pow(2, i) == arr.length) break; // 2의 거듭 제곱이면 빠져나온다
        }
        if (Math.pow(2, num) != arr.length) num++; // 2의 거듭 제곱이 아닐경우 길이보다 적게 반복했으므로 num을 증가시킴

        return answer = Arrays.copyOf(arr, (int)Math.pow(2, num));
    }
}
