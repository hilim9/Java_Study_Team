package codingtest_beginner.day01;

public class Test02 {
    public static void main(String[] args) {

        // 두 수의 차

        System.out.println("result: " + solution(2, 3));
        System.out.println("result: " + solution(100, 2));

    }

    public static int solution(int num1, int num2) {

        return num1 - num2;
    }
}
