package day4;

public class Test01 {
    public static void main(String[] args) {

        // n의 배수

        System.out.println("result: " + solution(98,2));
        System.out.println("result: " + solution(34,3));

    }
    public static int solution(int num, int n) {
        int answer = 0;

        answer = num % n == 0? 1 : 0;

        return answer;
    }


}
