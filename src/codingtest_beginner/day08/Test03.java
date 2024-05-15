package codingtest_beginner.day08;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 진료 순서 정하기
        int[] emergency1 = {3, 76, 24};
        int[] emergency2 = {1, 2, 3, 4, 5, 6, 7};
        int[] emergency3 = {30, 10, 23, 6, 100};

        System.out.println("result: " + Arrays.toString(solution(emergency1)));
        System.out.println("result: " + Arrays.toString(solution(emergency2)));
        System.out.println("result: " + Arrays.toString(solution(emergency3)));

    }
    // !
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        Arrays.fill(answer, 1);

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
