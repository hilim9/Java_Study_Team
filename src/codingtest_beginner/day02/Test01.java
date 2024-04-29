package codingtest_beginner.day02;

public class Test01 {
    public static void main(String[] args) {

        // 두 수의 나눗셈

        System.out.println("result: " + solution(3, 2));
        System.out.println("result: " + solution(7, 3));
        System.out.println("result: " + solution(1, 16));

    }

    public static int solution(int num1, int num2) {

        double answer = (double) num1 / num2 * 1000;

        return (int) answer;
    }
}
