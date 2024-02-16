package day3;

public class Test05 {
    public static void main(String[] args) {

        // 두 수의 연산값 비교하기

        System.out.println(solution(2, 91));
        System.out.println(solution(91, 2));

    }
    public static int solution(int a, int b) {

        int a_b = Integer.parseInt(a + "" + b); // a + b 조합
        int a_b_2 = 2 * a * b; // 2 * a * b 조합

        int answer = a_b >= a_b_2 ? a_b : a_b_2;  // Math.max()

        return answer;
    }
}
