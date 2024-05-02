package codingtest_beginner.day05;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        // 배열 뒤집기

        int[] num_list1 = {1, 2, 3 ,4, 5};
        int[] num_list2 = {1, 1, 1, 1, 1, 2};
        int[] num_list3 = {1, 0, 1, 1, 1, 3, 5};

        System.out.println("result: " + Arrays.toString(solution(num_list1)));
        System.out.println("result: " + Arrays.toString(solution(num_list2)));
        System.out.println("result: " + Arrays.toString(solution(num_list3)));

    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = num_list.length -1, idx = 0; i >= 0; i--) {
            answer[idx++] = num_list[i];
        }

        return answer;
    }
}
