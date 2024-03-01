package day03;

public class Test02 {

    public static void main(String[] args) {

        // 문자 리스트를 문자열로 변환하기

        String[] arr = {"a","b","c"};
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        System.out.println(answer);
    }
}
