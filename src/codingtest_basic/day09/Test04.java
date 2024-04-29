package codingtest_basic.day09;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        // 접미사 배열
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("programmers")));
    }

    public static String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0, j = 1; i < my_string.length(); i++, j++) {
            answer[i] = my_string.substring(my_string.length() -j); // 접미사를 answer배열에 담아준다.
        }

        Arrays.sort(answer); // 사전순으로 정렬

        return answer;
    }
}
