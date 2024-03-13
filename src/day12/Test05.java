package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test05 {
    public static void main(String[] args) {

        // 배열 조각하기

        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};

        System.out.println("result: " + Arrays.toString(solution(arr, query)) );
    }

    public static int[] solution(int[] arr, int[] query) {

        for(int i =0; i<query.length; i++) {
            if(i % 2 == 0) { // 짝수 일 때
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            }else { // 홀수 일 때
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }

    /*public static List<Integer> solution(int[] arr, int[] query) {
        List<Integer> list = new LinkedList<>();

        for (int n : arr) {
            list.add(n);
        }

        // System.out.println(list);

        for (int i = 0; i < query.length; i++) {
            if(i % 2 == 0) { // 짝수 일 때
                for (int even = query[i]+1; even < list.size(); even++) {
                    //System.out.println(query[i]);
                    //System.out.println("짝"+even);
                    list.remove(even);
                    //System.out.println(list);
                }
            } else { // 홀수 일 때
                for (int odd = 0; odd < query[i]; odd++) {
                    //System.out.println(query[i]);
                    //System.out.println("홀"+ odd);
                    list.remove(odd);
                    //System.out.println(list);
                }
            }
        }
        return list;
    }*/
}
