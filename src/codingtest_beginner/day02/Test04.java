package codingtest_beginner.day02;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        // 배열 두배 만들기

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 100, -99, 1, 2, 3};

        System.out.println("result: " + Arrays.toString(solution(numbers1)));
        System.out.println("result: " + Arrays.toString(solution(numbers2)));

    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
