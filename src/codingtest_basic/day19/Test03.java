package codingtest_basic.day19;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {

        // 빈 배열에 추가, 삭제하기

        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};

        System.out.println("result: " + solution(arr, flag));

    }

    public static List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < flag.length; i++) {
            if (flag[i]) { // true 일 때
                for (int j = 1; j <= arr[i] *2; j++) list.add(arr[i]); // arr[i] * 2만큼 반복해서 추가
            } else {
                for (int k = 1; k <= arr[i]; k++) list.remove(list.size() -1); // 뒤에서부터 arr[i]개의 원소 제거
            }
        }
        return list;
    }

}
