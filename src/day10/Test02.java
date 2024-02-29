package day10;

public class Test02 {
    public static void main(String[] args) {

        // 접두사인지 확인하기
        System.out.println("result: " + solution("banana","ban"));
        System.out.println("result: " + solution("banana","nan"));
        System.out.println("result: " + solution("banana","abcd"));
        System.out.println("result: " + solution("banana","bananan"));

    }

    public static int solution(String my_string, String is_prefix) {
        int answer = 0;

        answer = my_string.startsWith(is_prefix)? 1 : 0;

        return answer;
    }
}
