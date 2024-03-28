package day16;

import java.util.Arrays;

public class Test05 {
    public static void main(String[] args) {

        // 배열에서 문자열 대소문자 변환하기

        String[] strArr1 = {"AAA","BBB","CCC","DDD"};
        String[] strArr2 = {"aBc","AbC"};

        System.out.println(Arrays.toString(solution(strArr1)));
        System.out.println(Arrays.toString(solution(strArr2)));

    }

    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for(int i = 0; i < strArr.length; i++) {
            if(i % 2 == 0) answer[i] = strArr[i].toLowerCase(); // 짝수 일 때 소문자로 변경
            else answer[i] = strArr[i].toUpperCase(); // 홀수 일 때 대문자로 변경
        }

        return answer;
    }
}