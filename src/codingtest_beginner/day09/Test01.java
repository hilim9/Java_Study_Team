package codingtest_beginner.day09;

public class Test01 {
    public static void main(String[] args) {

        // 개미 군단

        System.out.println("result: " + solution(23));
        System.out.println("result: " + solution(24));
        System.out.println("result: " + solution(999));

    }

    public static int solution(int hp) {
        int answer = 0;

        while (true) {
            if (hp >= 5) {
                answer += hp /5;
                hp %= 5;

            } if (hp >= 3) {
                answer += hp / 3;
                hp %= 3;

            } if (hp <= 2) {
                answer += hp;
                break;
            }
        }

        return answer;
    }
}
