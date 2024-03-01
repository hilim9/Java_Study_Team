package day09;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {

        // 배열 만들기 5

        String[] intStrs = {"0123456789","9876543210","9999999999999"};

        System.out.println("result: " + solution(intStrs, 50000, 5, 5));

    }

    public static List<Integer> solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();

        for(String num : intStrs) {
            String str = num.substring(s, s+l); // s번 인덱스에서 s+l번 인덱스 전까지 해당하는 문자열을 잘라서 str에 담아준다
            if (k < Integer.parseInt(str)) list.add(Integer.parseInt(str));
            // 잘라낸 문자열이 k보다 큰경우에만 list에 담아준다.
        }

        return list;
    }
}
