package codingtest_basic.day22;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {

        // 배열의 원소 삭제하기

        int[] arr1 = {293, 1000, 395, 678, 94};
        int[] arr2 = {110, 66, 439, 785, 1};
        int[] arr3 = {1, 2, 3, 4, 5};

        int[] delete_list1 = {94, 777, 104, 1000, 1, 12};
        int[] delete_list2 = {377, 823, 119, 43};
        int[] delete_list3 = {1, 3, 2, 4};

        System.out.println("result: " + solution(arr1, delete_list1));
        System.out.println("result: " + solution(arr2, delete_list2));
        System.out.println("result: " + solution(arr3, delete_list3));
    }

    public static List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> list = new ArrayList<>(); // delete_list를 저장할 list

        for (int i : delete_list) { // 삭제할 값만 저장
            list.add(i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) { // 삭제할 값이 포함되지 않았을 때 answer에 값 추가
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
