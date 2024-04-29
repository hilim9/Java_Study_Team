package codingtest_basic.day18;

public class Test05 {
    public static void main(String[] args) {

        // rny_string

        System.out.println("result: " + solution("masterpiece"));
        System.out.println("result: " + solution("programmers"));
        System.out.println("result: " + solution("jerry"));
        System.out.println("result: " + solution("burn"));

    }

    public static String solution(String rny_string) {
        String answer = rny_string.replaceAll("m", "rn");
        return answer;
    }
}
