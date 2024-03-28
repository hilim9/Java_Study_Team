package day15;

public class Test05 {
    public static void main(String[] args) {

        // 원하는 문자열 찾기

        System.out.println("result: " + solution("AbCdEfG", "aBc"));
        System.out.println("result: " + solution("aaAA", "aaaaa"));

    }

    public static int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase())? 1 : 0;
    }

    /* 대소문자를 구분하지 않으므로 myString과 pat를 소문자로 변환하고
       contains로 myString이 pat의 문자열을 포함하고 있는지 확인하여
       있으면 1 없으면 0 반환
     */
}
