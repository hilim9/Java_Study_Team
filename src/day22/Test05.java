package day22;

public class Test05 {
    public static void main(String[] args) {

        // 부분 문자열인지 확인하기

        System.out.println("result: " + solution("banana", "ana"));
        System.out.println("result: " + solution("banana", "wxyz"));

    }

    public static int solution(String my_string, String target) {
        int answer = 0;

        return answer = my_string.contains(target)? 1 : 0;
    }
}
