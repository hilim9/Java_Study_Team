package codingtest_basic.day10;

public class Test04 {
    public static void main(String[] args) {

        // 세로 읽기
        System.out.println("result: " + solution("ihrhbakrfpndopljhygc", 4, 2));
        System.out.println("result: " + solution("programmers", 1, 1));
    }

    public static String solution(String my_string, int m, int c) {

        StringBuffer answer = new StringBuffer();
        String[][] strings = new String[my_string.length() / m][m]; // my_string에 있는 문자열을 담아줄 2차원 배열

        // my_string.length() / m -> 행
        // m -> 열

        int idx = 0; // my_string 인덱스

        for (int i = 0; i < my_string.length() / m; i++) { // 문자열길이에서 m만큼 나눈 만큼 반복
            for (int j = 0; j < m; j++) {
                strings[i][j] = my_string.charAt(idx++) + "";
                // my_string에 있는 문자열을 2차원배열에 m줄씩 잘라서 담아준다.
            }
        }
        //System.out.println(Arrays.deepToString(strings));

        for (int i = 0; i < strings.length; i++) {
            answer.append(strings[i][c-1]); // c번째 있는 글자들만 answer에 넣어준다.
        }

        return answer.toString();
    }
}
