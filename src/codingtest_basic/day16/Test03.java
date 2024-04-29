package codingtest_basic.day16;

public class Test03 {
    public static void main(String[] args) {

        // 특정한 문자를 대문자로 바꾸기

        System.out.println("result: " + solution("programmers", "p"));
        System.out.println("result: " + solution("lowercase", "x"));

    }

    public static String solution(String my_string, String alp) {
        String answer = "";

        answer = my_string.replace(alp, alp.toUpperCase());  // alp를 대문자로 변경

        return answer;
    }
}