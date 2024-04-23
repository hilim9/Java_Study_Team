package day24;

public class Test04 {
    public static void main(String[] args) {

        // l로 만들기

        System.out.println("result: " + solution("abcdevwxyz"));
        System.out.println("result: " + solution("jjnnllkkmm"));

    }

    public static String solution(String myString) {
        String answer = "";

        for(int i = 0; i < myString.length(); i++) {
            if('a' <= myString.charAt(i) && myString.charAt(i) <= 'k') answer += 'l';
            else answer += myString.charAt(i);
        }

        return answer;
    }
}
