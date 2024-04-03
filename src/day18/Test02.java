package day18;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {

        // 문자열 잘라서 정렬하기

        System.out.println("result: " + Arrays.toString(solution("axbxcxdx")));
        System.out.println("result: " + Arrays.toString(solution("dxccxbbbxaaaa")));
        System.out.println("result: " + Arrays.toString(solution("xxxddddxcccxbbxaxxxxxx"))); // 앞에 공백 and 뒤에 공백

    }

    public static String[] solution(String myString) {
        String[] answer = myString.replaceAll("x+", " ").trim().split(" ");
        // x를 공백으로 변환하고, 앞 뒤 공백을 제거한 다음, 공백을 기준으로 배열에 담는다

        Arrays.sort(answer);

        return answer;
    }
}
