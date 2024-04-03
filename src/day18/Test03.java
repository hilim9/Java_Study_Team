package day18;

public class Test03 {
    public static void main(String[] args) {

        // 간단한 식 계산하기

        System.out.println("result: " + solution("43 + 12"));
        System.out.println("result: " + solution("0 - 7777"));
        System.out.println("result: " + solution("40000 * 40000"));

    }

    public static int solution(String binomial) {

        int answer = 0;

        String[] str = binomial.split(" "); // 공백을 기준으로 str 배열에 담는다.
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[2]);
        String op = str[1]; // 연산자

        if(op.equals("+")) answer = a + b;
        else if (op.equals("-")) answer = a - b;
        else answer = a * b;

        return answer;
    }
}
