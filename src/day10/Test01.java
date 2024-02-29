package day10;

public class Test01 {
    public static void main(String[] args) {

        // 문자열의 앞의 n글자
        System.out.println("result: " + solution("ProgrammerS123", 11));
        System.out.println("result: " + solution("He110W0r1d", 5));
    }

    public static String solution(String my_string, int n) {
        String answer = "";

        answer = my_string.substring(0,n); // 첫번째 인덱스 부터 n번째 인덱스까지 자르고 answer에 담아준다.

        return answer;
    }
}
