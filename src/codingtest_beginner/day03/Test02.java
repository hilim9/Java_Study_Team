package codingtest_beginner.day03;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {

        // 중앙값 구하기

        int[] array1 = {1, 2, 7, 10, 11};
        int[] array2 = {9, -1, 0};

        System.out.println("result: " + solution(array1));
        System.out.println("result: " + solution(array2));

    }

    public static int solution(int[] array) {

        Arrays.sort(array);

        int answer = array[array.length / 2];
        return answer;
    }
}
