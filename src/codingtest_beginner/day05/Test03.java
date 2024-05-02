package codingtest_beginner.day05;

public class Test03 {
    public static void main(String[] args) {

        // 나이 출력

        System.out.println("result: " + solution(40));
        System.out.println("result: " + solution(23));

    }

    public static int solution(int age) {
        int answer = (2022 - age) + 1;
        return answer;
    }
}
