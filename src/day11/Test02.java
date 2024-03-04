package day11;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

        System.out.println(solution(10, 3));
        System.out.println(solution(15, 5));

    }

    public static List<Integer> solution(int n, int k) {
        List<Integer> answer = new ArrayList<>();

        for(int i = k; i <= n; i++) {
            if (i % k == 0) answer.add(i);
        }

        return answer;
    }
}
