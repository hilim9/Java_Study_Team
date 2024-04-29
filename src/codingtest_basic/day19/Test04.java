package codingtest_basic.day19;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {

        // 배열 만들기 6

        int[] arr1 = {0, 1, 1, 1, 0};
        int[] arr2 = {0, 1, 0, 1, 0};
        int[] arr3 = {0, 1, 1, 0};

        System.out.println("result: " + solution(arr1));
        System.out.println("result: " + solution(arr2));
        System.out.println("result: " + solution(arr3));

    }

    public static List<Integer> solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if (list.isEmpty()) list.add(arr[i]); // 길이가 같고 빈 배열일 때 추가
            else { // 길이가 다를 때
                if (list.get(list.size() -1) == arr[i]) list.remove(list.size() -1); // 마지막 원소가 같을 때 제거
                else list.add(arr[i]); // 마지막 원소가 다를 때
            }
        }
        if (list.isEmpty()) list.add(-1); // 빈 배열일 떄 -1 반환

        return list;
    }
}
