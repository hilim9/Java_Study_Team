package codingtest_basic.day11;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {

        // 글자 지우기

        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        System.out.println("result: " + solution("apporoograpemmemprs", indices));

    }

    public static String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder();

        Arrays.sort(indices); // 오름차순 정렬

        for (int i = 0, idx = 0; i < my_string.length(); i++) {
            if (i != indices[idx]) { // i와 정렬한 indices값이 같지 않을 때 (제거할 대상이 아닌 문자 일때)
                answer.append(my_string.charAt(i)); // i번째 인덱스 값을 answer에 넣는다.
               // System.out.println(answer);
            } else { // 일치할 때 (제거할 대상인 문자일 때)
                if (idx == indices.length -1) { // indices 마지막 인덱스 일때 (my_string 길이가 더 길때)
                    //System.out.println(idx);
                    continue;
                }
                idx++;
            }

        }
        return answer.toString();
    }

    /*public static String solution(String my_string, Integer[] indices) {
        StringBuilder answer = new StringBuilder(my_string);

        Arrays.sort(indices, Collections.reverseOrder()); // 내림차순 정렬
        System.out.println(Arrays.toString(indices));

        for (int i = 0; i < indices.length; i++) {

            answer.deleteCharAt(indices[i]);
            System.out.println(answer);
        }
        return answer.toString();
    }*/
}
