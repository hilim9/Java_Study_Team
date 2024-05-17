package codingtest_beginner.day10;

public class Test03 {
    public static void main(String[] args) {

        // 공 던지기

        int[] numbers1 = {1, 2, 3, 4};
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int[] numbers3 = {1, 2, 3};
        int[] numbers4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        System.out.println("result: " + solution(numbers1, 2));
        System.out.println("result: " + solution(numbers2, 5));
        System.out.println("result: " + solution(numbers3, 3));
        System.out.println("result: " + solution(numbers4, 11));

    }

    public static int solution(int[] numbers, int k) {
        int answer = 0;

        for (int i = 1, idx = 0; i <= k; i++) {
            if (numbers.length <= idx) idx %= numbers.length;
            answer = numbers[idx];
            idx+=2;
        }

        return answer;
    }
}
