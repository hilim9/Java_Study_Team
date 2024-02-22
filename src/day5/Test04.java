package day5;

public class Test04 {
    public static void main(String[] args) {

        // 원소들의 곱과 합

        int[] num1 = {3, 4, 5, 2, 1};
        int[] num2 = {5, 7, 8, 3};

        System.out.println(solution(num1));
        System.out.println(solution(num2));
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        int multiply = 1; // 원소의 곱을 담을 변수 (곱을 구하는 변수 이므로 1)
        int square_of_the_sum = 0; // 합의 제곱을 담을 변수

        for (int num = 0; num < num_list.length; num++) {
            multiply *= num_list[num]; // 원소의 곱
            square_of_the_sum += num_list[num]; // 합의 제곱
        }
        square_of_the_sum *= square_of_the_sum;

        answer = multiply < square_of_the_sum? 1 : 0;

        return answer;
    }
}
