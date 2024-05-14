package codingtest_beginner.day09;

public class Test03 {
    public static void main(String[] args) {

        // 가위 바위 보

        System.out.println("result: " + solution("2"));
        System.out.println("result: " + solution("205"));

    }

    public static String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < rsp.length(); i++) {
            if ((rsp.charAt(i) + "").equals("2")) answer.append("0"); // 가위 일 때 바위
            else if ((rsp.charAt(i) + "").equals("0")) answer.append("5"); // 바위 일 때 보
            else if ((rsp.charAt(i) + "").equals("5")) answer.append("2"); // 보일 때 가위
        }

        return answer.toString();
    }
}
