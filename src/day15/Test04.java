package day15;

public class Test04 {
    public static void main(String[] args) {

        // 길이에 따른 연산

        int[] num_list1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] num_list2 = {2, 3, 4, 5};

        System.out.println(solution(num_list1));
        System.out.println(solution(num_list2));

    }

    public static int solution(int[] num_list) {
        int answer = 0;

        if(num_list.length >= 11) { // 리스트의 길이가 11 이상일 때
            for (int sum : num_list) answer += sum; // 모든 원소의 합
        } else {
            answer = 1; // 곱해야 하므로 1로 초기화
            for (int sum : num_list) answer *= sum; // 모든 원소의 곱
        }

        return answer;
    }
}
