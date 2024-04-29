package codingtest_basic.day13;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {

        // n번째 원소까지

        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};

        System.out.println("result: " + solution(num_list1, 1));
        System.out.println("result: " + solution(num_list2, 3));

    }

    public static List<Integer> solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }

        return list;
    }
}
