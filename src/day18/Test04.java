package day18;

public class Test04 {
    public static void main(String[] args) {

        // 문자열 바꿔서 찾기

        System.out.println("result: " + solution("ABBAA", "AABB"));
        System.out.println("result: " + solution("ABAB", "ABAB"));

    }

    public static int solution(String myString, String pat) {
        String str = "";

        for(int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') str += 'B';
            else if (myString.charAt(i) == 'B') str += 'A';
        }

        return str.contains(pat)? 1 : 0;
    }
}
