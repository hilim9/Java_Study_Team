package codingtest_beginner.day11;

public class Test04 {
    public static void main(String[] args) {

        // 팩토리얼

        System.out.println("result: " + solution(3628800));
        System.out.println("result: " + solution(7));

    }

    public static int solution(int n) {
        int answer = 1;
        long sub = 1L;

        while (true) {
            sub *= answer;
            if (n > sub) answer++;
            else break;
        }

        return n == sub? answer : --answer;
    }
}
