package codingtest_basic.day14;

public class Test01 {
    public static void main(String[] args) {

        // 홀수 vs 짝수
        int[] num_list1 = {4, 2, 6, 1, 7, 6};
        int[] num_list2 = {-1, 2, 5, 6, 3};

        System.out.println("result: " + solution(num_list1));
        System.out.println("result: " + solution(num_list2));

    }

    public static int solution(int[] num_list) {
        int odd = 0; // 홀수
        int even = 0; // 짝수

        for(int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) even += num_list[i];
            else odd += num_list[i];
        }

        return even > odd? even: odd;
    }
}
