package codingtest_beginner.day06;

public class Test04 {
    public static void main(String[] args) {

        // 문자 반복 출력하기

        System.out.println("result: " + solution("hello", 3));

    }

    public static String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            answer.append((my_string.charAt(i) + "").repeat(n));
        }

        return answer.toString();
    }
}
