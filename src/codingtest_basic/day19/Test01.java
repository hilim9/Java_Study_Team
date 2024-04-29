package codingtest_basic.day19;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        // 세 개의 구분자

        System.out.println(Arrays.toString(solution("baconlettucetomato")));
        System.out.println(Arrays.toString(solution("abcd")));
        System.out.println(Arrays.toString(solution("cabab")));

    }

    public static String[] solution(String myStr) {

        return !myStr.matches("[abc]+") ? myStr.replaceAll("[abc]+", " ").trim().split(" ") : new String[]{"EMPTY"};
        // !myStr.matches("[abc]+")
        // myStr가 abc만으로 이루어지지 않았을 때
    }
}
