package codingtest_beginner.day09;

public class Test04 {
    public static void main(String[] args) {

        // 구슬을 나누는 경우의 수

        System.out.println("result: " + solution(3, 2));
        System.out.println("result: " + solution(5, 3));

    }
    // !
    public static long solution(int balls, int share) {
        long answer = 1L;
        int count = 1;

        while(count <= share) {
            answer *= balls--;
            answer /= count++;
        }

        return answer;
    }
}
