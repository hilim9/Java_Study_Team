package day11;

import java.util.Arrays;
import java.util.Collections;

public class Test03 {
    public static void main(String[] args) {

        Integer[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        System.out.println(solution("apporoograpemmemprs", indices));

    }

    public static String solution(String my_string, Integer[] indices) {
        StringBuilder answer = new StringBuilder(my_string);

        Arrays.sort(indices, Collections.reverseOrder());
        System.out.println(Arrays.toString(indices));

        for (int i = 0; i < indices.length; i++) {

                answer.deleteCharAt(indices[i]);
                System.out.println(answer);
        }

        /*for (int i = 0, idx = 0; i < my_string.length(); i++) {
            if(i != indices[idx]) {
                answer.append(my_string.charAt(i));
                System.out.println(answer);
            } else {
                idx++;
            }

        }*/
        return answer.toString();
    }
}
