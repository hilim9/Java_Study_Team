package codingtest_beginner.day08;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        // 배열 자르기

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 3, 5};

        System.out.println("result: " + Arrays.toString(solution(numbers1, 1, 3)));
        System.out.println("result: " + Arrays.toString(solution(numbers2, 1, 2)));

    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2+1);
    }
}
