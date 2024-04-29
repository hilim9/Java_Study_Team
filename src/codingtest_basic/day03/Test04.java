package codingtest_basic.day03;

public class Test04 {
    public static void main(String[] args) {

        // 더 크게 합치기

        System.out.println(solution(9, 91));
        System.out.println(solution(89, 8));

    }
    public static int solution(int a, int b) {

        String a_str = a + "" + b; // a + b 조합
        String b_str = b + "" + a; // b + a 조합

        String answer = Integer.parseInt(a_str) >= Integer.parseInt(b_str) ? a_str : b_str;

        return Integer.parseInt(answer);
    }

    // String answer = Integer.parseInt(a + "" + b) < Integer.parseInt(b + "" + a) ? a_str : b_str;

}
