package day9;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {

        // 부분 문자열 이어 붙여 문자열 만들기
        String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
        int[][] parts = {{0,4},{1,2},{3,5},{7,7}};

        System.out.println("result: " + solution(my_strings, parts));
    }

    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {

            int s = parts[i][0]; // 첫번째 인덱스
            int e = parts[i][1]; // 마지막 인덱스

            str.append(my_strings[i].substring(s, e+1)); // 잘라낸 문자열을 str에 붙여넣는다.
        }
        return str.toString();
    }
}
