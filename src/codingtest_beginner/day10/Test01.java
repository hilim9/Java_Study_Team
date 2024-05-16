package codingtest_beginner.day10;

public class Test01 {
    public static void main(String[] args) {

        // 점의 위치 구하기

        int[] dot1 = {2, 4};
        int[] dot2 = {-7, 9};
        int[] dot3 = {11, -5};
        int[] dot4 = {-6, -2};

        System.out.println("result: " + solution(dot1));
        System.out.println("result: " + solution(dot2));
        System.out.println("result: " + solution(dot3));
        System.out.println("result: " + solution(dot4));

    }

    public static int solution(int[] dot) {
        int answer = 0;

        for (int i = 0; i < dot.length; i++) {
            if (0 < dot[0] && 0 < dot[1]) answer = 1; // 모두 양수
            else if (0 > dot[0] && 0 < dot[1]) answer = 2; // 음수, 양수
            else if (0 > dot[0] && 0 > dot[1]) answer = 3; // 모두 음수
            else answer = 4; // 양수, 음수
        }
        return answer;
    }
}
