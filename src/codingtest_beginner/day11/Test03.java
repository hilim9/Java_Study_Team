package codingtest_beginner.day11;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 최댓값 만들기 (1)

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {0, 31, 24, 10, 1, 9};

        System.out.println("result: " + solution(numbers1));
        System.out.println("result: " + solution(numbers2));

    }

    // 1. 정렬 후 구현
    public static int solution(int[] numbers) {

        Arrays.sort(numbers);

        return numbers[numbers.length -2] * numbers[numbers.length -1];
    }

    // 2. 정렬 하지 않고 구현
    /*public static int solution(int[] numbers) {
        int no1 = numbers[0];
        int no2 = numbers[1];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > no2 && numbers[i] < no1) {
                no2 = numbers[i];
            } else if (numbers[i] > no1) {
                no2 = no1;
                no1 = numbers[i];
            }
        }
        return no1 * no2;
    }*/
}
