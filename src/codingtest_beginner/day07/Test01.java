package codingtest_beginner.day07;

public class Test01 {
    public static void main(String[] args) {

        // 특정 문자 제거하기

        System.out.println("result: " + solution("abcdef", "f"));
        System.out.println("result: " + solution("BCBdbe", "B"));

    }
    public static String solution(String my_string, String letter) {

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (!(my_string.charAt(i) + "").equals(letter)) {
                answer.append(my_string.charAt(i));
            }
        }

        return answer.toString();
    }
}
