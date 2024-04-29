package codingtest_basic.day13;

import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {

        // n개 간격의 원소들

        int[] num_list = {4, 2, 6, 1, 7, 6};

        System.out.println("result: " + solution(num_list, 2));
        System.out.println("result: " + solution(num_list, 4));

    }

    public static List<Integer> solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < num_list.length; i+=n) {
            list.add(num_list[i]);
        }

        return list;
    }
}
