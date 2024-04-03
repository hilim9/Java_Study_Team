package day18;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        // x 사이의 개수

        System.out.println("result: " + Arrays.toString(solution("oxooxoxxox")));
        System.out.println("result: " + Arrays.toString(solution("xabcxdefxghi")));

    }

    public static int[] solution(String myString) {
        String[] str = myString.split("x", -1); // x가 마지막일 경우 빈 배열로 반환 하기 위해 -1로 설정
        int[] answer = new int[str.length];

        for (int i = 0; i < str.length; i++) {

            answer[i] = !str[i].equals(" ")? str[i].length() : 0;
            // 공백이 아닐 때 문자열 길이를 반환, 공백일 때 0 반환
        }

        return answer;
    }

    /*
    ※ 문자열을 자르는 메소드 split(separator, limit)

    split(" ")으로 문자열을 자를때, 문자열이 끝나고 마지막에 붙는 공백은 얻어지지 않는다.

    마지막 공백도 취득해야할 때는 limit에 파라미터로 -1을 주면 된다.

    파라미터로 -1을 추가하는 것은 문자열이 공백으로 끝날때 공백을 취득여부를 결정한다.
    */

    // 참고 사이트: // https://gymdev.tistory.com/52

}
