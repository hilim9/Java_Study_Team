package codingtest_beginner.day08;

public class Test02 {
    public static void main(String[] args) {

        // 외계행성의 나이

        System.out.println("result: " + solution(23));
        System.out.println("result: " + solution(51));
        System.out.println("result: " + solution(100));

    }

    public static String solution(int age) {

        String alphabet = "abcdefghij";
        String num = Integer.toString(age);
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {

            answer.append(alphabet.charAt(Integer.parseInt((num.charAt(i) + "")))); // 문자열이므로 int로 변환
        }

        return answer.toString();
    }
}
