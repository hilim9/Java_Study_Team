package codingtest_basic.day23;

public class Test02 {
    public static void main(String[] args) {

        // 꼬리 문자열

        String[] str_list1 = {"abc", "def", "ghi"};
        String[] str_list2 = {"abc", "bbc", "cbc"};

        System.out.println("result: " + solution(str_list1, "ef"));
        System.out.println("result: " + solution(str_list2, "c"));

    }

    public static String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();

        for(String str : str_list) {
            if (!str.contains(ex)) {
                answer.append(str);
            }
        }

        return answer.toString();
    }
}
