package day12;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3},{0, 4}};

        System.out.println(solution(arr, intervals));

    }

    public static List<Integer> solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();

        for (int n = 0; n < intervals.length; n++) {

            int start_idx = intervals[n][0];
            int end_idx = intervals[n][1];

            // intervals의 배열 개수 만큼 list에 붙여넣는다.
            for (int i = start_idx; i <= end_idx; i++) {
                list.add(arr[i]);
            }
        }
        return list;
    }
}
