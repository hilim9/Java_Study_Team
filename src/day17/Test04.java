package day17;

import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {

        // 공백으로 구분하기 1

        System.out.println("result: " + Arrays.toString(solution("i love you")));
        System.out.println("result: " + Arrays.toString(solution("programmers")));

    }

    public static String[] solution(String my_string) {
        String[] answer = my_string.split(" ");

        return answer;
    }
}
