package day04;

public class Test02 {
    public static void main(String[] args) {

        // 공배수

        System.out.println("result: " + solution(60,2, 3));
        System.out.println("result: " + solution(55,10, 5));

    }
    public static int solution(int number, int n, int m) {
        int answer = 0;

        answer = (number % n == 0 && number % m == 0)? 1 : 0;

        return answer;
    }
}
