package codingtest_basic.day21;

public class Test04 {
    public static void main(String[] args) {

        // 문자열 정수의 합

        System.out.println("result: " + solution("123456789"));
        System.out.println("result: " + solution("1000000"));

    }

    public static int solution(String num_str) {
        int answer = 0;

        for(int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }

        return answer;
    }

}
