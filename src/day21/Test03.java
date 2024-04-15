package day21;

public class Test03 {
    public static void main(String[] args) {

        // 정수 부분

        System.out.println(solution(1.42));
        System.out.println(solution(69.32));

    }

    public static int solution(double flo) {
        int answer = (int) flo;
        return answer;
    }
}
