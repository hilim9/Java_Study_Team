package day6;

public class Test02 {
    public static void main(String[] args) {

        // 수 조작하기 1

        System.out.println("결과: " + solution(0,"wsdawsdassw"));

    }

    public static int solution(int n, String control) {
        int answer = n;

        for (int i = 0; i < control.length(); i++) {
            if (control.charAt(i) == 'w') answer += 1; // w일 때 1 증가
            else if (control.charAt(i) == 's') answer -= 1; // s일 때 1 감소
            else if (control.charAt(i) == 'd') answer += 10; // d일 때 10 증가
            else answer -= 10; // a일 때 10 감소
        }

        return answer;
    }
}
