package codingtest_basic.day17;

public class Test02 {
    public static void main(String[] args) {

        // 문자열이 몇 번 등장하는지 세기

        System.out.println("result: " + solution("banana", "ana"));
        System.out.println("result: " + solution("aaaa", "aa"));

    }

    public static int solution(String myString, String pat) {

        int answer = 0;
        String splitWord = "";

        for (int i = 0; i <= myString.length() -pat.length(); i++) { // 아래 코드에 pat 길이만큼 자르기 때문에 pat 길이를 뺀다

            splitWord = myString.substring(i, i+pat.length()); // pat 길이만큼 문자열을 잘라 담아준다

           // System.out.println(str);

            if (splitWord.equals(pat)) answer++; // 잘라낸 단어와 pat가 같을 때 answer에 카운트
        }

        return answer;
    }
}
