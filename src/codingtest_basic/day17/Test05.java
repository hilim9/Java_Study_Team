package codingtest_basic.day17;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {

        // 공백으로 구분하기 2

        System.out.println("result: " + Arrays.toString(solution(" i    love  you")));
        System.out.println("result: " + Arrays.toString(solution("    programmers  ")));

    }

    public static String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+"); // \s: 공백 +: 1번 이상

        return answer;
    }

}
