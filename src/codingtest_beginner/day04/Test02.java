package codingtest_beginner.day04;

public class Test02 {
    public static void main(String[] args) {

        // 피자 나눠 먹기 (2)

        System.out.println("result: " + solution(6));
        System.out.println("result: " + solution(10));
        System.out.println("result: " + solution(4));

    }

    public static int solution(int n) {
        int pizza = 6;

        while (pizza % n != 0) {
            pizza += 6;
        }

        return pizza / 6;
    }
}
