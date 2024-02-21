package day4;

public class Test04 {
    public static void main(String[] args) {

        // 조건 문자열

        System.out.println(solution("<","=", 20, 50));
        System.out.println(solution(">","!", 41, 78));

    }

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean result;


        if (ineq.equals("<")) {
            result = eq.equals("=")? n <= m : n < m;
        } else {
            result = eq.equals("=")? n >= m : n > m;
        }
        return answer;
    }
}
