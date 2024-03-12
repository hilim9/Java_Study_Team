package day11;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        // 문자 개수 세기

        System.out.println(Arrays.toString(solution("Programmers")));

    }

    public static int[] solution(String my_string) {
        int[] answer = new int[52]; // 대소문자 알파벳 합친 갯수 만큼의 길이

        // 인덱스 시작 위치
        // 대문자 -65 (0) 소문자 -71 (26)
        for(int i = 0; i < my_string.length(); i++) {
            if ((my_string.charAt(i) + "").equals((my_string.charAt(i) + "").toUpperCase())) { // 대문자 일 때
                int A = my_string.charAt(i);
                //System.out.println(a);
                answer[A -65]++;
            } else { // 소문자 일 때
                int a = my_string.charAt(i);
                //System.out.println(b);
                answer[a -71]++;
            }
        }
        return answer;
    }
}
