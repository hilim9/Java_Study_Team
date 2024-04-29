package codingtest_basic.day08;

public class Test05 {
    public static void main(String[] args) {

        // 문자열 여러 번 뒤집기

        int[][] queries = {{2,3},{0,7},{5,9},{6,10}};

        System.out.println("result: " + solution("rermgorpsam", queries));

    }

    public static StringBuilder solution(String my_string, int[][] queries) {
        StringBuilder result = new StringBuilder(my_string);

        for (int n = 0; n < queries.length; n++) {

            int start_idx = queries[n][0];
            int end_idx = queries[n][1];

            StringBuilder sb = new StringBuilder(result.substring(start_idx, end_idx+1));
            // 해당 인덱스에 있는 문자를 잘라 sb에 담아준다.
            String str = String.valueOf(sb.reverse()); // 문자를 뒤집어서 str 변수에 담는다.
            result.replace(start_idx, end_idx +1, str); // str 변수에 있는 문자로 치환한다.

        }
        return result;
    }
}
