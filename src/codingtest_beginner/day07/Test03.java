package codingtest_beginner.day07;

public class Test03 {
    public static void main(String[] args) {

        // 양꼬치

        System.out.println("result: " + solution(10, 3));
        System.out.println("result: " + solution(64, 6));

    }

    public static int solution(int n, int k) {

        //int food = n * 12000;
        //int drink = ((k - n / 10) * 2000);

        //int answer = (n * 12000) + ((k - n / 10) * 2000);

        return n * 12000 + (k - n / 10) * 2000;
    }

}
