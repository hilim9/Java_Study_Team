package codingtest_basic.day16;

public class Test01 {
    public static void main(String[] args) {

        // 대문자로 바꾸기

        System.out.println("result: " + solution("aBcDeFg"));
        System.out.println("result: " + solution("AAA"));

    }

    public static String solution(String myString) {
        String answer = "";

        answer = myString.toUpperCase();

        return answer;
    }
}
