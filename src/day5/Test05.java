package day5;

public class Test05 {
    public static void main(String[] args) {

        int[] num1 = {3, 4, 5, 2, 1};
        int[] num2 = {5, 7, 8, 3};

        System.out.println(solution(num1));
        System.out.println(solution(num2));

    }

    public static int solution(int[] num_list) {
        int answer = 0;
        String even = ""; // 짝수
        String odd = ""; // 홀수

        for (int n = 0; n < num_list.length; n++) {
            if (num_list[n] % 2 == 0) even += num_list[n]; // 짝수 일 때
            else odd += num_list[n];// 홀수 일 때
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd); // 두 수의 합

        return answer;
    }
}
