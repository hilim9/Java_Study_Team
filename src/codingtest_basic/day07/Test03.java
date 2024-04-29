package codingtest_basic.day07;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 카운트 업

        System.out.println("result: " + Arrays.toString(solution(3, 10)));

    }

    public static int[] solution(int start_num, int end_num) {

        int length = end_num - start_num +1; // 마지막 수와 첫번째 수를 뺀 수에 1을 더함 (길이)
        int[] answer = new int[length];
        int addNum = start_num; // 증가시킬 변수를 첫번째 수로 초기화

        for (int i = 0; i < length; i++, addNum++) answer[i] += addNum; // 길이까지 돌면서 배열에 증가된 addNum 넣어준다

        return answer;
    }
}
