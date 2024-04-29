package codingtest_basic.day03;

public class Test03 {
    public static void main(String[] args) {

        // 문자열 곱하기

        System.out.println(solution("string", 3));
        System.out.println(solution("love", 10));

    }
    public static String solution(String my_string, int k) {

        String answer = "";
        answer = my_string.repeat(k);
        return answer;
    }


}
