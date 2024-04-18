package day22;

public class Test01 {
    public static void main(String[] args) {

        // 0 떼기

        System.out.println("result: " + solution("0010"));
        System.out.println("result: " + solution("854020"));

    }

    public static String solution(String n_str) {
        int idx = 0;

        while (idx < n_str.length() && n_str.charAt(idx) == '0') idx++; // 0이 아닌 다음 인덱스 찾기

        return n_str.substring(idx); // 0이 아닌 다음 인덱스부터 끝까지의 문자열 자르기
    }

    /*public static String solution(String n_str) {
        String answer = "";
        int idx = 0;

        for (int i = 0; i < n_str.length(); i++) {
            if ((n_str.charAt(i) + "").equals("0")) idx = i;
            else break;
        }

        return answer = idx == 0? n_str.substring(idx, n_str.length()): n_str.substring(idx+1, n_str.length());
    }*/
}
