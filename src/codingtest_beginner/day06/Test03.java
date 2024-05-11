package codingtest_beginner.day06;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 짝수 홀수 개수

        int[] num_list1 = {1, 2, 3, 4, 5};
        int[] num_list2 = {1, 3, 5, 7};

        System.out.println("result: " + Arrays.toString(solution(num_list1)));
        System.out.println("result: " + Arrays.toString(solution(num_list2)));

    }

    public static int[] solution(int[] num_list) {

        int odd = 0; // 홀수
        int even = 0; // 짝수

        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) even++;
            else odd++;
        }

        //int[] answer = {even, odd};

        return new int[] {even, odd};
    }
}
