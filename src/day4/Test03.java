package day4;

public class Test03 {
    public static void main(String[] args) {

        // 홀짝에 따라 다른 값 반환하기
        System.out.println(solution(7));
        System.out.println(solution(10));

    }

    public static int solution(int n) {
        int answer = 0;

        // 홀짝 판별
        int result = n % 2 == 0? 1 : 0;

        if (result == 1) { // 짝수
            for (int i = 2; i <= n; i+=2) {
                answer += Math.pow(i, 2);
            }
        } else { // 홀수
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        }

        return answer;
    }

}
