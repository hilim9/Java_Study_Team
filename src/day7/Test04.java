package day7;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        // 콜라츠 수열 만들기
        // 모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고,
        // x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면
        // 언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.


        System.out.println("result: " + Arrays.toString(solution(10)));

    }

    public static int[] solution(int n) {
        String str = n + " "; // 문자열로 변환

        while (true) { // 콜라츠 수열 만들기
            if (n != 1) { // 1이 아닐 때
                n = n % 2 == 0 ? n / 2 : 3 * n + 1;
                str += n + " ";
            } else break; // 1일 때
        }
        String[] strings = str.split(" "); // 공백을 기준으로 잘라 배열에 담음
        int[] answer = new int[strings.length]; // int 배열
        for (int i = 0; i < strings.length; i++) { // int 배열에 담아 줌
            answer[i] = Integer.parseInt(strings[i]);
        }
        return answer;

    }
}
