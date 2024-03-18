package day14;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {

        // 5명씩

        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        System.out.println(solution(names));

    }

    public static List<String> solution(String[] names) {
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < names.length; i++) {
            if (i % 5 == 0) answer.add(names[i]);
        }

        return answer;
    }
}
