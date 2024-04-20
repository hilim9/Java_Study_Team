package day23;

public class Test01 {
    public static void main(String[] args) {

        // 부분 문자열

        System.out.println("result: " + solution("abc", "aabcc"));
        System.out.println("result: " + solution("tbt", "tbbttb"));

    }

    public static int solution(String str1, String str2) {

        return str2.contains(str1)? 1: 0;
    }
}
