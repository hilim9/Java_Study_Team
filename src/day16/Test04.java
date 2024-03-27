package day16;

public class Test04 {
    public static void main(String[] args) {

        System.out.println("result: " + solution("abstract algebra"));
        System.out.println("result: " + solution("PrOgRaMmErS"));

    }

    public static String solution(String myString) {
        String answer = "";

        for(int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'a') { // a를 A로 바꾸기
                answer += (myString.charAt(i) + "").toUpperCase();
            } else if ('B' <= myString.charAt(i) && myString.charAt(i) <= 'Z') { // B부터 Z를 소문자로 바꾸기
                answer += (myString.charAt(i) + "").toLowerCase();
            } else answer += myString.charAt(i);
        }

        return answer;
    }

    /*public String solution(String myString) {
        String answer = "";
        myString = myString.toLowerCase();
        answer = myString.replace("a","A");
        return answer;
    }*/
}
