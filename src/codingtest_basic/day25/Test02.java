package codingtest_basic.day25;

public class Test02 {
    public static void main(String[] args) {

        // 특별한 이차원 배열 2

        int[][] arr1 = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        int[][] arr2 = {{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 8}};

        System.out.println("result: " + solution(arr1));
        System.out.println("result: " + solution(arr2));

    }

    public static int solution(int[][] arr) {
        int answer = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    answer = 0;
                    break;
                }
            }
        }

        return answer;
    }
}
