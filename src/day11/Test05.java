package day11;

public class Test05 {
    public static void main(String[] args) {

        // 가까운 1찾기

        int[] arr1 = {0, 0, 0, 1};
        int[] arr2 = {1, 0, 0, 1, 0, 0};
        int[] arr3 = {1, 1, 1, 1, 0};

        System.out.println("result: " + solution(arr1, 1));
        System.out.println("result: " + solution(arr2, 4));
        System.out.println("result: " + solution(arr3, 3));

    }

    public static int solution(int[] arr, int idx) {
        int answer = 0;

        for(int i = idx; i < arr.length; i++) { // idx를 i로 받아서 반복
            if (arr[i] == 1) { // idx부터 시작하므로 가장 가까운 1이 있을 때
                answer = i; // 인덱스 값을 answer에 저장
                break;      // 1이 있을때 반복하지 않고 빠져나옴
            } else answer = -1; // 1이 존재하지 않을 떄 -1을 answer에 넣어줌
        }

        return answer;
    }


}
