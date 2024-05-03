package codingtest_beginner.day04;

public class Test01 {
    public static void main(String[] args) {

        // 피자 나눠 먹기 (1)

        System.out.println("result: " + solution(7));
        System.out.println("result: " + solution(1));
        System.out.println("result: " + solution(15));

    }

    public static int solution(int n) {
        int answer = n % 7 == 0? n / 7 : n / 7 + 1;

        return answer;
    }
}
