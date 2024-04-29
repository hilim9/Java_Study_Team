package codingtest_basic.day13;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {

        // 순서 바꾸기

        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};

        System.out.println("result: " + (Arrays.toString(solution(num_list1, 1))));
        System.out.println("result: " + (Arrays.toString(solution(num_list2, 3))));

    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;

        for(int i = n; i < num_list.length; i++) { // n부터 마지막 까지
            answer[idx++] += num_list[i]; // n부터 마지막 까지 해당 하는 숫자 담기
        }

        for(int j = 0; j < n; j++) { // 처음부터 n 전까지
            answer[idx++] += num_list[j]; // 처음부터 n 전까지 남은 숫자 담기
        }

        return answer;
    }
}
