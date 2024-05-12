package codingtest_beginner.day07;

public class Test04 {
    public static void main(String[] args) {

        // 짝수의 합

        System.out.println("result: " + solution(10));
        System.out.println("result: " + solution(4));

    }
    public static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i+=2) answer += i;

        return answer;
    }
}
