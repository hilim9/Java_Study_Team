package codingtest_basic.day17;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {

        // ad 제거하기

        String[] strArr1 = {"and","notad","abcd"};
        String[] strArr2 = {"there","are","no","a","ds"};

        System.out.println("result: " + solution(strArr1));
        System.out.println("result: " + solution(strArr2));

    }

    public static List<String> solution(String[] strArr) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) list.add(strArr[i]); // ad가 포함되지 않았을 때 list에 추가
        }

        return list;
    }

}
