package codingtest_basic.day20;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {

        // 뒤에서 5등까지

        int[] num_list = {12, 4, 15, 46, 38, 1, 14};

        System.out.println(Arrays.toString(solution(num_list)));

    }

    public static int[] solution(int[] num_list) {

        Arrays.sort(num_list);

        return Arrays.copyOfRange(num_list, 0, 5);
    }
}
