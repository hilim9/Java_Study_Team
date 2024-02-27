package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

        // 배열 만들기 2

        System.out.println(Arrays.toString(solution(5, 555)));
        System.out.println(Arrays.toString(solution(10, 20)));

    }

    public static int[] solution(int l, int r) {
        String str = "";
        List<Integer> list = new ArrayList<>();

        for(int i = l; i <= r; i++) { // l 부터 시작해서 r까지 반복
            str = i + "";
            if (!str.contains("1") && !str.contains("2") && !str.contains("3") && !str.contains("4") && !str.contains("6")
                    && !str.contains("7") && !str.contains("8") && !str.contains("9")) { // 5와 0만으로 구성된 수
                list.add(i);
            }
        }
        if (list.size() == 0) { // 일치하는 것이 없을 때 -1 반환
            list.add(0, -1);
        }

        int[] answer = new int[list.size()]; // int 배열 생성

        for(int i = 0; i < list.size(); i++) { // int 배열에 넣어줌
            answer[i] = list.get(i);
        }

        return answer;
    }
}
