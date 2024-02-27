package day7;

import java.util.Arrays;


public class Test04 {
    public static void main(String[] args) {

        // 콜라츠 수열 만들기

        System.out.println("result: " + Arrays.toString(solution(10)));

    }

    public static int[] solution(int n) {
        int[] answer = new int[7]; // 배열의 크기
        answer[0] = n; // 배열 0번째 인덱스에 n값 넣어줌
        int idx = 1; // 배열 인덱스를 증가시킬 변수
        int num = n; // n을 담아 줄 변수

        while (true) {
            if (num != 1) {
                num = num % 2 == 0 ? num / 2 : 3 * num + 1;
                answer[idx++] = num;
            } else {
                break;
            }
        }
        return answer;
    }
}
