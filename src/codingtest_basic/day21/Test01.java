package codingtest_basic.day21;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        // 뒤에서 5등 위로

        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 1};

        System.out.println("result: " + Arrays.toString(solution(num_list)));

    }

    public static int[] solution(int[] num_list) {
        int[] answer = {};

        Arrays.sort(num_list);

        return answer = Arrays.copyOfRange(num_list, 5, num_list.length);
    }

}
