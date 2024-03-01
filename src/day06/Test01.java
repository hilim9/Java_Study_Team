package day06;

import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {

        // 마지막 두 원소

        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};

        System.out.println("num_list1: " + Arrays.toString(solution(num_list1)));
        System.out.println("num_list2: " + Arrays.toString(solution(num_list2)));

    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int idx = num_list.length - 1; // 마지막 인덱스
        int lastNum = num_list[idx]; // 마지막 원소
        int lastNum_Pre = num_list[idx - 1]; // 마지막 원소의 앞 원소

        int result = lastNum > lastNum_Pre ? lastNum - lastNum_Pre : lastNum * 2;
        // 마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 추가
        // 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가

        // 배열에 넣어줌
        for (int i = 0; i < num_list.length; i++) {
            answer[i] += num_list[i];
        }
        answer[num_list.length] = result; // 마지막에 추가

        return answer;
    }

    /*public static int[] solution(int[] num_list) {

        // Arrays.copyOf()
        // 배열을 복사하는 메서드
        // 사용법: Arrays.copyOf(원본배열, 원본 배열에서 복사해올 길이)
        // https://velog.io/@kai6666/Java-System.arraycopy-%EC%99%80Arrays.copyOf%EC%9D%98-%EC%B0%A8%EC%9D%B4-%EB%B0%B0%EC%97%B4-%EB%B3%B5%EC%82%AC


        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int idx = num_list.length -1; // 마지막 인덱스
        int lastNum = num_list[idx]; // 마지막 원소
        int lastNum_Pre = num_list[idx-1]; // 마지막 원소의 앞 원소

        int result = lastNum > lastNum_Pre? lastNum - lastNum_Pre : lastNum*2;

        answer[num_list.length] = result;

        return answer;

    }*/
}
