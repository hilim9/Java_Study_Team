package day13;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {

        // n번째 원소부터

        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};

        System.out.println("result: " + solution(num_list1, 3));
        System.out.println("result: " + solution(num_list2, 2));
    }

    public static List<Integer> solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = n-1; i < num_list.length; i++) {
            list.add(num_list[i]);
        }

        return list;
    }
}
