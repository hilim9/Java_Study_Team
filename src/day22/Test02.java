package day22;

import java.math.BigInteger;

public class Test02 {
    public static void main(String[] args) {

        // 두 수의 합

        System.out.println("result: " + solution("582", "734"));
        System.out.println("result: " + solution("18446744073709551615", "287346502836570928366"));
        System.out.println("result: " + solution("0", "0"));

    }

    public static String solution(String a, String b) {
        String answer = "";

        // 두번째 예시가 Long의 범위를 벗어나므로 BigInteger 사용
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);
        BigInteger sum = a1.add(b1);

        return answer = String.valueOf(sum);
    }
}
