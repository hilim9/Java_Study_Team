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
            if(mode == 0) {
                if (code.charAt(i) != '1') { // mode가 0이고 문자가 1이 아닐 때
                    if (i % 2 == 0) {
                        answer += code.charAt(i); // code의 인덱스가 짝수 일 때
                    }
                } else {
                    mode = 1;
                }

            } else {
                if (code.charAt(i) != '1') {
                    if (i % 2 == 1) {
                        answer += code.charAt(i); // code의 인덱스가 짝수 일 때
                    }
                } else {
                    mode = 0;
                }
            }

        }

        return answer.length() == 0? "EMPTY": answer;
    }
}
