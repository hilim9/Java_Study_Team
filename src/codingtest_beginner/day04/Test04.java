package codingtest_beginner.day04;

public class Test04 {
    public static void main(String[] args) {

        // 배열의 평균값

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numbers2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};

        System.out.println("result: " + solution(numbers1));
        System.out.println("result: " + solution(numbers2));

    }

    public static double solution(int[] numbers) {
        double answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }

        return answer /= numbers.length;
    }
}
