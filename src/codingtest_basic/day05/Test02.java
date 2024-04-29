package codingtest_basic.day05;

public class Test02 {
    public static void main(String[] args) {

        // 등차수열의 특정한 항만 더하기

        boolean[] bool1 = {true, false, false, true, true};
        boolean[] bool2 = {false, false, false, true, false, false, false};

        System.out.println(solution(3, 4, bool1));
        System.out.println(solution(7, 1, bool2));

    }

    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int num = a;

        for (int i = 0; i < included.length ; i++) {
            if (included[i] == true) answer += num; // true 일 때만 더 함
            num += d; // d 만큼 증가

        }

        return answer;
    }
}
