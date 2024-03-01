package day04;

public class Test04 {
    public static void main(String[] args) {

        // 조건 문자열

        System.out.println(solution("<","=", 20, 50));
        System.out.println(solution(">","!", 41, 78));

    }

    public static int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals("<") && eq.equals("=")) {
            answer = n <= m? 1 : 0;
        } else if (ineq.equals("<") && eq.equals("!")){
            answer = n < m ? 1 : 0;
        } else if (ineq.equals(">") && eq.equals("=")){
            answer = n >= m? 1 : 0;
        } else {
            answer = n > m? 1 : 0;
        }
        return answer;
    }
}
