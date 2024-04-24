package day24;

import java.util.Arrays;

public class Test02 {
    public static void main(String[] args) {

        // 그림 확대

        String[] picture1 = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
        String[] picture2 = {"x.x", ".x.", "x.x"};

        System.out.println(Arrays.toString(solution(picture1, 2)));
        System.out.println(Arrays.toString(solution(picture2, 3)));

    }

    public static String[] solution(String[] picture, int k) {

        StringBuilder str_k = new StringBuilder();
        String[] answer = new String[picture.length];

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length(); j++) {

                str_k.append((picture[i].charAt(j) + "").repeat(k));
            }

            answer[i] = str_k.toString();
            str_k.delete(0, str_k.length());
        }

        return answer;
    }


    /*public static String[] solution(String[] picture, int k) {

        StringBuilder str_k = new StringBuilder();
        String[] answer = new String[picture.length];

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length(); j++) {

                str_k.append((picture[i].charAt(j) + "").repeat(k));
            }

            answer[i] = str_k.toString();
            str_k.delete(0, str_k.length());
        }

        return answer;
    }*/
}
