package codingtest_basic.day25;

public class Test04 {
    public static void main(String[] args) {

        // 이차원 배열 대각선 순회하기

        int[][] board = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};

        System.out.println("result: " + solution(board, 2));

    }

    public static int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i + j <= k) answer += board[i][j];
            }
        }
        return answer;
    }
}
