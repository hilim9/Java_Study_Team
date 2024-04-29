package codingtest_basic.day21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

        // 전국 대회 선발 고사

        int[] rank1 = {3, 7, 2, 5, 4, 6, 1};
        int[] rank2 = {1, 2, 3};
        int[] rank3 = {6, 1, 5, 2, 3, 4};

        boolean[] attendance1 = {false, true, true, true, true, false, false};
        boolean[] attendance2 = {true, true, true};
        boolean[] attendance3 = {true, false, true, false, false, true};

        System.out.println("result: " + solution(rank1, attendance1));
        System.out.println("result: " + solution(rank2, attendance2));
        System.out.println("result: " + solution(rank3, attendance3));

    }

    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < attendance.length; i++) {
            if (attendance[i]) { // true 인 등수만 담기
                list.add(rank[i]);
            }
        }
        Collections.sort(list); // 정렬

        for (int i = 0; i < rank.length; i++) {
            // list의 인덱스에 해당하는 값과 rank의 해당하는 값이 같을 때의 rank의 인덱스를 연산
            if (list.get(0) == rank[i]) answer += 10000 * i;
            else if (list.get(1) == rank[i]) answer += 100 * i;
            else if (list.get(2) == rank[i]) answer += i;
        }

        return answer;
    }
}
