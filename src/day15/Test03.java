package day15;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 1로 만들기

        int[] num_list = {12, 4, 15, 1, 14};

        //System.out.println(solution(num_list));

    }

    /*public static int solution(int[] num_list) {
        int answer = 0;
        int[] arr = new int[num_list.length];
        Arrays.fill(arr, 1);
        System.out.println(Arrays.toString(arr));

        while (arr != num_list) {

            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                    answer++;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                    answer++;
                }
            }
        }

        return answer;
    }*/
}
