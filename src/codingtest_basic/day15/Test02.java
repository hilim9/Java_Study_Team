package codingtest_basic.day15;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {

        // 조건에 맞게 수열 변환하기 2
        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(solution(arr));

    }

    public static int solution(int[] arr) {
        int answer = 0;
        int[] copy_arr = {}; // 복사해서 비교할 배열

        while (!Arrays.equals(copy_arr,arr)) {
            copy_arr = Arrays.copyOf(arr, arr.length); // 배열 복사
            //System.out.println(Arrays.toString(copy_arr));
            answer++;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) arr[i] = arr[i] / 2; // 50보다 크거나 같은 짝수일 때 2로 나눈다.
                else if (arr[i] % 2 == 1 && arr[i] < 50) arr[i] = (arr[i] * 2) + 1; // 50보다 작은 홀수라면 2를 곱하고 1을 더한다.
            }
        }

        return answer -1;
    }
}
