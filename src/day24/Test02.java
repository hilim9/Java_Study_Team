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
        String[] answer = new String[picture.length * k];
        int idx = 0;

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length(); j++) {

                str_k.append((picture[i].charAt(j) + "").repeat(k)); // 원소를 k번 만큼 반복하여 길이를 늘린다
            }
            for (int n = 0; n < k; n++) { // k번 만큼 배열에 넣는다
                answer[idx++] = str_k.toString();
            }
            str_k.delete(0, str_k.length());
        }

        return answer;
    }
}
