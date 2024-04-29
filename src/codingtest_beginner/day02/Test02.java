package codingtest_beginner.day02;

public class Test02 {
    public static void main(String[] args) {

        // 숫자 비교하기

        System.out.println("result: " + solution(2, 3));
        System.out.println("result: " + solution(11, 11));
        System.out.println("result: " + solution(7, 99));

    }

    public static int solution(int num1, int num2) {
        int answer = 0;

        return answer = num1 == num2? 1 : -1;
    }
}
