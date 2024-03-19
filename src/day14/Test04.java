package day14;

public class Test04 {
    public static void main(String[] args) {

        // n보다 커질 때까지 더하기

        int[] numbers1 = {34, 5, 71, 29, 100, 34};
        int[] numbers2 = {58, 44, 27, 10, 100};

        System.out.println("result: " + solution(numbers1, 123));
        System.out.println("result: " + solution(numbers2, 139));

    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;

        for(int i = 0; i < numbers.length; i++) {
            if (n >= answer) answer += numbers[i];
            else break; // answer가 n보다 더 클 때 종료
        }

        return answer;
    }

}
