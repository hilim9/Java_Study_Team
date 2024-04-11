package day19;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

        // 배열의 원소만큼 추가하기

        int[] arr1 = {5, 1, 4};
        int[] arr2 = {6, 6};
        int[] arr3 = {1};

        System.out.println("result: " + solution(arr1));
        System.out.println("result: " + solution(arr2));
        System.out.println("result: " + solution(arr3));

    }

    public static List<Integer> solution(int[] arr) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <= arr[i]; j++) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
