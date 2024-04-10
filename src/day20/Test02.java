package day20;

public class Test02 {
    public static void main(String[] args) {

        int[] arr1 = {49, 13};
        int[] arr2 = {70, 11, 2};

        int[] arr11 = {100, 17, 84, 1};
        int[] arr22 = {55, 12, 65, 36};

        int[] arr111 = {1, 2, 3, 4, 5};
        int[] arr222 = {3, 3, 3, 3, 3};

        System.out.println(solution(arr1, arr2));
        System.out.println(solution(arr11, arr22));
        System.out.println(solution(arr111, arr222));

    }

    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum_arr1 = 0;
        int sum_arr2 = 0;

        answer = arr1.length > arr2.length? 1 : -1; // 길이가 다를 때

        if (arr1.length == arr2.length) { // 길이가 같을 때
            for (int i = 0; i < arr1.length; i++) {
                sum_arr1 += arr1[i];
                sum_arr2 += arr2[i];

            }
            if (sum_arr1 == sum_arr2) answer = 0; // 두 배열의 합이 같을 때
            else answer = sum_arr1 > sum_arr2? 1 : -1; // 두 배열의 합이 다를 때
        }

        return answer;
    }
}
