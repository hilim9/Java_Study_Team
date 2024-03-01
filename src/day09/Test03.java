package day09;

public class Test03 {
    public static void main(String[] args) {

        // 문자열의 뒤의 n글자
        System.out.println("result: " + solution("ProgrammerS123", 11));
        System.out.println("result: " + solution("He110W0r1d", 5));
    }
    public static String solution(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(my_string.length() - n);

        return answer;
    }
}
