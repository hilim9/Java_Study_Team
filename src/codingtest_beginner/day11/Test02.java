package codingtest_beginner.day11;

public class Test02 {
    public static void main(String[] args) {

        // 합성수 찾기

        System.out.println("result: " + solution(10));
        System.out.println("result: " + solution(15));

    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 4; i <= n; i++) {
            int j;
            for (j = 2; j < i; j++) {
                if (i % j == 0) break;
            }
            if (i != j) answer++;
        }

        return answer;
    }
}
