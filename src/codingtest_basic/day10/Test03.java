package codingtest_basic.day10;

public class Test03 {
    public static void main(String[] args) {

        // 제출 내역
        System.out.println(solution("Progra21Sremm3", 6, 12));
        System.out.println(solution("Stanley1yelnatS", 4, 10));

    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder subStr = new StringBuilder(my_string.substring(s, e+1)); // 문자열 자르기
        StringBuilder newStr = new StringBuilder(my_string);

        String str = String.valueOf(subStr.reverse()); // reverse()메서드로 문자열 뒤집기

        newStr.replace(s, e+1, str); // 뒤집은 문자열로 치환

        return newStr.toString();
    }

}
