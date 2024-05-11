package codingtest_beginner.day06;

public class Test01 {
    public static void main(String[] args) {

        // 문자열 뒤집기

        System.out.println("result: " + solution("jaron"));
        System.out.println("result: " + solution("bread"));

    }

    public static String solution(String my_string) {

        StringBuilder answer = new StringBuilder(my_string);
        return (answer.reverse()).toString();
    }
}
