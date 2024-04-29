package codingtest_basic.day04;

public class Test05 {
    public static void main(String[] args) {

        // flag에 따라 다른 값 반환하기
        System.out.println(solution(-4, 7, true));
        System.out.println(solution(-4,7, false));
    }

    public static int solution(int a, int b, boolean flag) {
        int answer = 0;

        answer = flag? a + b : a - b;

        return answer;
    }
}
