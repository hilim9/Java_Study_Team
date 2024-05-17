package codingtest_beginner.day10;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        // 배열 회전시키기

        int[] numbers1 = {1, 2, 3};
        int[] numbers2 = {4, 455, 6, 4, -1, 45, 6};

        System.out.println("result: " + Arrays.toString(solution(numbers1, "right")));
        System.out.println("result: " + Arrays.toString(solution(numbers2, "left")));

    }

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        if (direction.equals("right")) {
            answer[0] = numbers[numbers.length-1];
            for (int i = 1, j = 0; i < numbers.length; i++) {
                answer[i] = numbers[j++];
            }
        } else {
            for (int i = 1, j = 0; i < numbers.length; i++) {
                answer[j++] = numbers[i];
            }
            answer[answer.length -1] = numbers[0];
        }

        return answer;
    }

}
