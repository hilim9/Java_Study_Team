package day2;

public class Test05 {
    public static void main(String[] args) {

        /* 문자열 겹쳐쓰기 */
        // 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
        // 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
        // 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

        System.out.println(wordChange("He11oWor1d", "lloWorl",2));
        System.out.println(wordChange("Program29b8UYP", "merS123",7));

    }

    /*public static String wordChange(String my_string, String overwrite_string, int s) {
        String answer = "";
        String wordSplit = "";

        if (0 < my_string.length() && 0 < overwrite_string.length() && 0 <= s && my_string.length() > overwrite_string.length()) {
            // substring으로 입력받은 인덱스 s 부터 교체해야하는 단어 길이에 s를 더하여 자른 후 변수에 담음
            wordSplit = my_string.substring(s,overwrite_string.length() + s);
            //System.out.println(wordSplit);
            // 잘라낸 단어를 교체해야하는 단어로 치환 (프로그래머스에서는 replace 사용하면 테스트 통과 안됨)
            answer = my_string.replace(wordSplit, overwrite_string);
        } else {
            System.out.print("조건에 맞춰서 다시 입력해주세요");
        }

        return answer;
    }*/

    public static String wordChange(String my_string, String overwrite_string, int s) {
        String answer = "";

        if (!(0 < my_string.length() && 0 < overwrite_string.length() && 0 <= s && my_string.length() > overwrite_string.length()))
            System.out.print("조건에 맞춰서 다시 입력해주세요");

        if (my_string.length() <= overwrite_string.length() + s) { // 원본 단어의 길이가 교체해야 하는 단어길이 보다 작거나 같을 때
            answer += my_string.substring(0, s) + overwrite_string;
        } else { // 원본 단어의 길이가 교체해야하는 단어의 길이보다 길 때 (붙여 넣고 뒤에 단어가 남아있을 수 있으므로 처리)
            answer += my_string.substring(0, s) + overwrite_string + my_string.substring(overwrite_string.length() + s);
        }

        return answer;
    }
}
