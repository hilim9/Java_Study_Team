package day09;

public class Test05 {
    public static void main(String[] args) {

        // 접미사인지 확인하기
        System.out.println("result: " + solution("banana","ana"));
        System.out.println("result: " + solution("banana","nan"));
        System.out.println("result: " + solution("banana","wxyz"));
        System.out.println("result: " + solution("banana","abanana"));

    }

    public static int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] list = new String[my_string.length()];

        // 접미사 배열 생성
        for (int i = 0, j = 1; i < my_string.length(); i++, j++) {
            list[i] = my_string.substring(my_string.length() -j); // 접미사를 answer배열에 담아준다.
        }

        // is_suffix가 포함되어 있는지 확인하기
        for (String str : list) {
            if (str.equals(is_suffix)) answer = 1;
        }

        return answer;
    }
}
