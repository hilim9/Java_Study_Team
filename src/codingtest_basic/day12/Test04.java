package codingtest_basic.day12;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {

        // 2의 영역

        int[] arr1 = {1, 2, 1, 4, 5, 2, 9};
        int[] arr2 = {1, 2, 1};
        int[] arr3 = {1, 1, 1};
        int[] arr4 = {1, 2, 1, 2, 1, 10, 2, 1};

        System.out.println("result: " + solution(arr1));
        System.out.println("result: " + solution(arr2));
        System.out.println("result: " + solution(arr3));
        System.out.println("result: " + solution(arr4));

    }

    public static List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>(); // arr을 담아줄 list
        List<Integer> result = new ArrayList<>();

        for (int n : arr) { // list에 arr을 담는다
            list.add(n);
        }

        if (!list.contains(2)) result.add(-1); // 2가 포함되지 않았을 때 -1 반환
        else { // 2가 포함 되었을 때
            for (int i = list.indexOf(2); i <= list.lastIndexOf(2); i++) {
                // 2가 포함된 첫 번째 인덱스 부터 2가 포함된 마지막 인덱스까지 반복
                result.add(arr[i]); // result에 담는다
            }
        }
        return result;
    }
}
