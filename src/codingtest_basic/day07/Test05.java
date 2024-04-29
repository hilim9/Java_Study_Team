package codingtest_basic.day07;

import java.util.ArrayList;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {

        // 배열 만들기 4

        int[] arr = {1, 4, 2, 5, 3};

        System.out.println("result: " + solution(arr));

    }

    public static List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();

        for(int i = 0; i < arr.length;) { // arr의 길이만큼 반복
            if (stk.size() == 0) {  // stk가 빈 배열 일 때
                stk.add(arr[i]);    // arr[i]를 stk에 추가
                i++;                // i 증가
            } else if ((stk.get(stk.size() -1) < arr[i])) { // stk의 마지막 원소가 arr[i]보다 작을 때
                stk.add(arr[i]);    // arr[i]를 추가
                i++;                // i 증가
            } else stk.remove(stk.size() -1); // 둘다 아닐 때 stk의 마지막 원소를 제거
        }
        return stk;
    }
}
