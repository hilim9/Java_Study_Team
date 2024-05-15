package codingtest_beginner.day08;

public class Test04 {
    public static void main(String[] args) {

        // 순서쌍의 개수

        System.out.println("result: " + solution(20));
        System.out.println("result: " + solution(100));

    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer++;
        }

        return answer;
    }
}