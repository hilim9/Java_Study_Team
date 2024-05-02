package codingtest_beginner.day05;

public class Test01 {
    public static void main(String[] args) {

        // 옷가게 할인 받기

        System.out.println("result: " + solution(150000));
        System.out.println("result: " + solution(580000));

    }

    public static int solution(int price) {
        int answer = 0;

        if (100000 <= price && price < 300000) answer = (int) (price - (price * 0.05));
        else if (300000 <= price && price < 500000) answer = (int) (price - (price * 0.1));
        else if (500000 <= price) answer = (int) (price - (price * 0.2));
        else answer = price;

        return answer;
    }
}
