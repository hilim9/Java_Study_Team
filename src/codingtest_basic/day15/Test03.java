package codingtest_basic.day15;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 1로 만들기

        int[] num_list = {12, 4, 15, 1, 14};
        int[] num_list2 = {1, 1, 1, 1, 1};

        System.out.println(solution(num_list));
        System.out.println(solution(num_list2));

    }

    public static int solution(int[] num_list) {
        int answer = 0;
        int[] arr = new int[num_list.length]; // num_list 비교 할 배열
        Arrays.fill(arr, 1); // arr배열을 1로 채운다

        while (!Arrays.equals(arr, num_list)) { // 배열의 내용을 비교하려면 Arrays.equals() 사용
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] != 1 && num_list[i] % 2 == 1) { // 홀수 이고 1이 아닐 때
                    num_list[i] = (num_list[i] - 1) / 2;
                    answer++;
                } else if (num_list[i] % 2 == 0) { // 짝수 일 때
                    num_list[i] /= 2;
                    answer++;
                }
            }
        }

        return answer;
    }
}
