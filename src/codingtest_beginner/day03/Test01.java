package codingtest_beginner.day03;

public class Test01 {
    public static void main(String[] args) {

        // 나머지 구하기

        System.out.println("result: " + solution(3, 2));
        System.out.println("result: " + solution(10, 5));

    }

    public static int solution(int num1, int num2) {

        return num1 % num2;
    }
}
