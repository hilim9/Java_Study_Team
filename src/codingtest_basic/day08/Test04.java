package codingtest_basic.day08;

public class Test04 {
    public static void main(String[] args) {

        // 9로 나눈 나머지

        System.out.println("result: " + solution("123"));
        System.out.println("result: " + solution("78720646226947352489"));

    }

    public static int solution(String number) {
        int answer = 0;
        int addNum = 0; // 각 자리 숫자를 더해줄 변수

        for (int i = 0; i < number.length(); i++) {
            addNum += Integer.parseInt(number.charAt(i) + ""); // i번째 인덱스에 해당하는 숫자를 String으로 만들고 int로 변환하여 addNum에 더해줌
        }
        answer = addNum % 9; // 각 자리 숫자의 합을 9로 나눈 나머지를 answer에 넣는다

        return answer;
    }

    /*public static int solution(String number) {
        int answer = 0;
        int addNum = 0; // 각 자리 숫자를 더해줄 변수
        String str = ""; // number의 문자열을 분리해서 넣어줄 변수

        for (int i = 0; i < number.length(); i++) {
            str = String.valueOf(number.charAt(i)); // i번째 인덱스에 해당하는 숫자를 String으로 변환해서 str에 넣는다
            addNum += Integer.parseInt(str); // int로 변환하여 각 자리 숫자를 addNum에 더해준다
        }
        answer = addNum % 9; // 각 자리 숫자의 합을 9로 나눈 나머지를 answer에 넣는다

        return answer;
    }*/


}
