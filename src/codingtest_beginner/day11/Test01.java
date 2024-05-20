package codingtest_beginner.day11;

public class Test01 {
    public static void main(String[] args) {

        // 주사위의 개수

        int[] box1 = {1, 1, 1};
        int[] box2 = {10, 8, 6};

        System.out.println("result: " + solution(box1, 1));
        System.out.println("result: " + solution(box2, 3));

    }

    public static int solution(int[] box, int n) {
        return (box[0] /n) * (box[1] /n) * (box[2] /n);
    }
}
