package codingtest_basic.day12;

public class Test02 {
    public static void main(String[] args) {

        // 첫 번째로 나오는 음수

        int[] num_list1 = {12, 4, 15, 46, 38, -2, 15};
        int[] num_list2 = {13, 22, 53, 24, 15, 6};

        System.out.println("result: " + solution(num_list1));
        System.out.println("result: " + solution(num_list2));

    }

    public static int solution(int[] num_list) {
        int answer = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] < 0) { // 음수 일 때
                answer = i; // 인덱스 i의 값을 answer에 담아준다.
                break;      // 반복 중지
            } else answer = -1; // 음수가 없을 때 -1을 answer에 담아준다.
        }
        return answer;
    }
}
