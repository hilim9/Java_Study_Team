package codingtest_beginner.day09;

import java.util.HashMap;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {

        // 모스부호 (1)

        System.out.println("result: " + solution(".... . .-.. .-.. ---"));
        System.out.println("result: " + solution(".--. -.-- - .... --- -."));

    }

    public static String solution(String letter) {
        Map<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-..." ,"b");
        morse.put("-.-.","c");
        morse.put("-.." ,"d");
        morse.put("." ,"e");
        morse.put("..-." ,"f");
        morse.put("--." ,"g");
        morse.put("...." ,"h");
        morse.put(".." ,"i");
        morse.put(".---" ,"j");
        morse.put("-.-" ,"k");
        morse.put(".-.." ,"l");
        morse.put("--" ,"m");
        morse.put("-." ,"n");
        morse.put("---" ,"o");
        morse.put(".--." ,"p");
        morse.put("--.-" ,"q");
        morse.put(".-." ,"r");
        morse.put("..." ,"s");
        morse.put("-" ,"t");
        morse.put("..-" ,"u");
        morse.put("...-" ,"v");
        morse.put(".--" ,"w");
        morse.put("-..-" ,"x");
        morse.put("-.--" ,"y");
        morse.put("--.." ,"z");

        StringBuilder answer = new StringBuilder();
        String[] str = letter.split(" ");

        for (int i = 0; i < str.length; i++) {
            answer.append(morse.get(str[i]));
        }

        return answer.toString();
    }
}
