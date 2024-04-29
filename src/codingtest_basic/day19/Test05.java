package codingtest_basic.day19;

import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {

        // 무작위로 K개의 수 뽑기

        int[] arr1 = {0, 1, 1, 2, 3};
        int[] arr2 = {0, 1, 1, 1, 1};

        System.out.println("result: " + solution(arr1, 3));
        System.out.println("result: " + solution(arr2, 4));

    }

    public static List<Integer> solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(list.size() < k && !list.contains(arr[i])) list.add(arr[i]);
            // list의 길이가 k보다 작고, arr[i]를 포함하고 있지 않을 때 list에 값 추가
        }
        if (list.size() != k) { // list의 길이가 k와 같지 않을 때
            while (list.size() != k) list.add(-1); // k 만큼 -1 추가
        }
        return list;
    }
}
