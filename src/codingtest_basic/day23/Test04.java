package codingtest_basic.day23;

public class Test04 {
    public static void main(String[] args) {

        // 주사위 게임 1

        System.out.println("result: " + solution(3,5));
        System.out.println("result: " + solution(6,1));
        System.out.println("result: " + solution(2,4));

    }

    public static int solution(int a, int b) {
        int answer = 0;

        if (a % 2 == 1 && b % 2 == 1) answer = (a * a) + (b * b); // 모두 홀수 일 때
        else if (a % 2 == 1 || b % 2 == 1) answer = 2 * (a + b); // 한개만 홀수 일 때
        else answer = Math.abs(a - b); // 모두 홀수가 아닐 때

        return answer;
    }
}
