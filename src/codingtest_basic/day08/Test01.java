package codingtest_basic.day08;

public class Test01 {
    public static void main(String[] args) {

        // 간단한 논리 연산

        System.out.println("result1: " + solution(false, true, true, true));
        System.out.println("result2: " + solution(true, false, false, false));

    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;

        answer = (x1 || x2) && (x3 || x4); // true or false 값을 answer에 담는다.

        return answer;
    }
}
