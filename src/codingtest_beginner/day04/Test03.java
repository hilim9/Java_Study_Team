package codingtest_beginner.day04;

public class Test03 {
    public static void main(String[] args) {

        // 피자 나눠 먹기 (3)

        System.out.println("result: " + solution(7, 10));
        System.out.println("result: " + solution(4, 12));
        System.out.println("result: " + solution(4, 4)); // 같을 때
        System.out.println("result: " + solution(10, 3)); // 인원 수가 더 적을 때
        System.out.println("result: " + solution(9, 100)); // 인원 수가 더 적을 때

    }

    public static int solution(int slice, int n) {
        int answer = 0;

        if (n > slice && n % slice == 0) answer = n / slice;
        else if (n <= slice) answer = 1;
        else {
            for (int i = 1; ; i++) {
                if (n < slice * i) {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }
}
