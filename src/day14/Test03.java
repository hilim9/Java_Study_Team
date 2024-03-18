package day14;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {

        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};

        boolean[] finished = {true, false, true, false};

        System.out.println("result: " + solution(todo_list, finished));
    }

    public static List<String> solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < finished.length; i++) {
            if (!finished[i]) answer.add(todo_list[i]); // false 일 때 answer에 담아준다.
        }

        return answer;
    }
}
