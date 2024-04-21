package day24;

public class Test01 {
    public static void main(String[] args) {

        // 커피 심부름

        String[] order1 = {"cafelatte", "americanoice", "hotcafelatte", "anything"};
        String[] order2 = {"americanoice", "americano", "iceamericano"};

        System.out.println("result: " + solution(order1));
        System.out.println("result: " + solution(order2));

    }

    public static int solution(String[] order) {
        int answer = 0;

        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("cafelatte")) answer += 5000;
            else if(order[i].contains("americano") || order[i].contains("anything")) answer += 4500;
        }

        return answer;
    }
}
