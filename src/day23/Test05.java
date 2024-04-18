package day23;

public class Test05 {
    public static void main(String[] args) {

        // 날짜 비교하기

        int[] date11 = {2021, 12, 28};
        int[] date12 = {1024, 10, 24};

        int[] date21 = {2021, 12, 29};
        int[] date22 = {1024, 10, 24};

        System.out.println("result: " + solution(date11, date21));
        System.out.println("result: " + solution(date12, date22));

    }

    public static int solution(int[] date1, int[] date2) {
        int answer = 0;

        if(date1[0] < date2[0]) answer = 1;
        if(date1[0] == date2[0] && date1[1] < date2[1]) answer = 1;
        if(date1[0] == date2[0] && date1[1] == date2[1] && date1[2] < date2[2]) answer = 1;

        return answer;
    }
}
