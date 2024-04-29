package codingtest_basic.day18;

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

    기본적으로 split() 메서드는 문자열의 끝에 구분자가 있을 경우 빈 문자열을 결과로 반환하지 않는다.
    그러나 limit에 -1을 전달함으로써 구분자가 문자열의 끝에 있어도 빈 문자열을 결과에 포함시킨다.
    따라서 "x"를 구분자로 사용하여 문자열을 나눌 때,
    문자열의 끝에 "x"가 있는 경우에도 빈 문자열을 포함하여 나누게 된다.
    */

    // 참고 : https://gymdev.tistory.com/52 , GPT

}
