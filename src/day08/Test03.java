package day08;

public class Test03 {
    public static void main(String[] args) {

        // 글자 이어 붙여 문자열 만들기

        int[] index_list1 = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        int[] index_list2 = {1, 2, 0, 0, 3};


        System.out.println("result: " + solution("cvsgiorszzzmrpaqpe",index_list1));
        System.out.println("result: " + solution("zpiaz",index_list2));

    }

    public static String solution(String my_string, int[] index_list) {
        String answer = "";

        for(int i = 0; i < index_list.length; i++) { // index_list 길이만큼 반복
            answer += my_string.charAt(index_list[i]); // my_string 문자열의 index_list[i]번째 해당하는 인덱스의 문자를 answer에 붙여넣는다
        }


        return answer;
    }
}
