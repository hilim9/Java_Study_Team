package day13;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {

        // 왼쪽 오른쪽

        String[] str_list1 = {"u","u","l","r"}; // l이 먼저
        String[] str_list2 = {"l"}; // l만 존재
        String[] str_list3 = {"r"}; // r만 존재
        String[] str_list4 = {"u","u","r","l","u"}; // r이 먼저
        String[] str_list5 = {"u","u","u","u","d"}; // l과 r이 존재 하지 않음

        System.out.println("result: " + solution(str_list1));
        System.out.println("result: " + solution(str_list2));
        System.out.println("result: " + solution(str_list3));
        System.out.println("result: " + solution(str_list4));
        System.out.println("result: " + solution(str_list5));
    }

    public static List<String> solution(String[] str_list) {

        // 처리 해야 할 조건
        /*
         * 1. l과 r 문자열이 있을 때
         *   1) l과 r이 둘 다 존재 할 때
         *      a. l 문자열이 먼저 나오면 -> 왼쪽 문자열 출력
         *        ● l 문자열이 인덱스 0번째 있을 때 -> 빈 배열 출력
         *      b. r 문자열이 먼저 나오면 -> 오른쪽 문자열 출력
         *        ● r 문자열이 마지막 인덱스에 있을 때 -> 빈 배열 출력
         *
         *   2) l만 존재 할 때 (왼쪽 문자열 출력)
         *   3) r만 존재 할 때 (오른쪽 문자열 출력)
         *
         * 2. l과 r 문자열이 없을 때 (빈 배열 출력)
         * */

        // sublist(int fromIndex, int toIndex) - 리스트의 구성 요소 중 fromIndex에서 toIndex까지의 요소를 반환

        List<String> str = new ArrayList<>(List.of(str_list));
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
            if(str.contains("l") && str.contains("r")) { // l과 r이 둘 다 존재 할 때
                if (str.indexOf("l") < str.indexOf("r")) { // l이 r보다 앞에 있을 때 (왼쪽 문자열 출력)
                    result = str.subList(0, str.indexOf("l"));
                } else { // r이 l보다 앞에 있을 때 (오른쪽 문자열 출력)
                    result = str.subList(str.indexOf("r")+1, str.size()); // r의 인덱스 다음 부터 담아야하므로 +1 증가
                }
            } else if (str.contains("l") && !str.contains("r")) { // l만 존재 할 때
                result = str.subList(0, str.indexOf("l"));
            } else if (!str.contains("l") && str.contains("r")) { // r만 존재 할 때
                result = str.subList(str.indexOf("r")+1, str.size()); // r의 인덱스 다음 부터 담아야하므로 +1 증가
            }
        }
        return result;
    }
}
