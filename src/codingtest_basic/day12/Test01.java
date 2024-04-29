package codingtest_basic.day12;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {

        // 리스트 자르기

        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("result: " + solution(3, slicer, num_list));
        System.out.println("result: " + solution(4, slicer, num_list));

    }

    public static List<Integer> solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();

        int a = slicer[0];  // a 인덱스
        int b = slicer[1];  // b 인덱스
        int c = slicer[2];  // c 간격

        switch (n) {
            case 1:
                for (int i = 0; i <= b; i++) { // 0번 인덱스부터 b번 인덱스까지
                    list.add(num_list[i]);
                }
                break;
            case 2:
                for (int i = a; i < num_list.length; i++) { // a번 인덱스부터 마지막 인덱스까지
                    list.add(num_list[i]);
                }
                break;
            case 3:
                for (int i = a; i <= b; i++) { // a번 인덱스부터 b번 인덱스까지
                    list.add(num_list[i]);
                }
                break;
            case 4:
                for (int i = a; i <= b; i+=c) { // a번 인덱스부터 b번 인덱스까지 c간격으로
                    list.add(num_list[i]);
                }
                break;
        }
        return list;
    }
}
