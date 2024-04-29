package codingtest_basic.day16;

public class Test02 {
    public static void main(String[] args) {

        // 소문자로 바꾸기

        System.out.println("result: " + solution("aBcDeFg"));
        System.out.println("result: " + solution("aaa"));

    }

    public static String solution(String myString) {
        String answer = "";

        answer = myString.toLowerCase();

        return answer;
    }
}
