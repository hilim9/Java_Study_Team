package codingtest_basic.day10;

public class Test05 {
    public static void main(String[] args) {

        // qr code
        System.out.println("result: " + solution(3, 1, "qjnwezgrpirldywt"));
        System.out.println("result: " + solution(1, 0, "programmers"));
    }

    public static String solution(int q, int r, String code) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) { // code의 인덱스를 i로 나누었을 때 나머지가 r인 경우
                answer.append(code.charAt(i));
            }
        }
        return answer.toString();
    }
}
