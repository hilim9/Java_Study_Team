package codingtest_beginner.day03;

public class Test03 {
    public static void main(String[] args) {

        // 최빈값 구하기

        int[] array1 = {1, 2, 3, 3, 3, 4};
        int[] array2 = {1, 1, 2, 2};
        int[] array3 = {1};

        System.out.println(solution(array1));
        System.out.println(solution(array2));
        System.out.println(solution(array3));

    }

    public static int solution(int[] array) {

        int[] count_arr = new int[1000];
        int maxCount = 0;
        int answer = 0;

        for (int i = 0; i < array.length; i++) {
            count_arr[array[i]]++;
        }

        for (int i = 0; i < count_arr.length; i++) {
            if (count_arr[i] > maxCount) {
                maxCount = count_arr[i];
                answer = i;
            } else if (count_arr[i] == maxCount) {
                answer = -1;
            }
        }

        return answer;
    }
}
