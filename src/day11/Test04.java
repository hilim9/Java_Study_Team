package day11;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(10, 3)));

    }

    public static int[] solution(int start_num, int end_num) {
        int length = start_num - end_num +1; // 첫번째 수와 마지막 수를 뺀 수에 1을 더함 (길이)
        int[] answer = new int[length];
        int subNum = start_num; // 감소시킬 변수를 첫번째 수로 초기화

        for (int i = 0; i < length; i++, subNum--) answer[i] += subNum; // 길이까지 돌면서 배열에 감소된 subNum 넣어준다.

        return answer;
    }
}
