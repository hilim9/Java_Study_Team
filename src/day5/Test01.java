package day5;

public class Test01 {
    public static void main(String[] args) {

        //코드 처리하기

        System.out.println(solution("abc1abc1abc"));

    }

    public static String solution(String code) {
        String answer = "";
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if(mode == 0) { // mode가 0 일때
                if (code.charAt(i) != '1') { // 문자가 1이 아닐 때
                    if (i % 2 == 0) { // code의 인덱스가 짝수 일 때
                        answer += code.charAt(i);
                    }
                } else {
                    mode = 1;
                }
            } else { // mode가 0이 아닐 때 (1일 때)
                if (code.charAt(i) != '1') { // 문자가 1이 아닐 때
                    if (i % 2 == 1) { // code의 인덱스가 홀수 일 때
                        answer += code.charAt(i);
                    }
                } else {
                    mode = 0;
                }
            }
        }
        return answer.length() == 0? "EMPTY": answer; // 길이가 0일 때 (빈 문자열일 때) EMPTY 반환
    }
}
