package codingtest_basic.day17;

public class Test01 {
    public static void main(String[] args) {

        // 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기

        System.out.println("result: " + solution("AbCdEFG", "dE"));
        System.out.println("result: " + solution("AAAAaaaa", "a"));

    }

    public static String solution(String myString, String pat) {
        StringBuilder answer = new StringBuilder();

        if (myString.contains(pat)) {
            for (int i = 0; i < myString.lastIndexOf(pat) + pat.length(); i++) {
                // lastIndex전까지 반복 하기 때문에 pat 길이를 더해준다
                answer.append(myString.charAt(i));
            }
        }

        return String.valueOf(answer);
    }
}
