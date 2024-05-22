package codingtest_beginner.day12;

public class Test01 {
    public static void main(String[] args) {

        // 모음 제거

        System.out.println("result: " + solution("bus"));
        System.out.println("result: " + solution("nice to meet you"));

    }

    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (!(my_string.charAt(i) == 'a'
                    || my_string.charAt(i) == 'e'
                    || my_string.charAt(i) == 'i'
                    || my_string.charAt(i) == 'o'
                    || my_string.charAt(i) == 'u')) {

                answer.append(my_string.charAt(i));
            }
        }
        return answer.toString();
    }
}
