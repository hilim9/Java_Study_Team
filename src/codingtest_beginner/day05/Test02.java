package codingtest_beginner.day05;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {

        // 아이스 아메리카노

        System.out.println("result: " + Arrays.toString(solution(5500)));
        System.out.println("result: " + Arrays.toString(solution(15000)));
        System.out.println("result: " + Arrays.toString(solution(4500)));

    }

    public static int[] solution(int money) {
        int[] answer = new int[2];

        if(money < 5500) {
            answer[1] = money;
        } else {
            answer[0] = money / 5500;
            answer[1] = money % 5500;
        }
        return answer;
    }
}
