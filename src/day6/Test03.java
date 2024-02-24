package day6;

public class Test03 {
    public static void main(String[] args) {

        // 수 조작하기 2

        int[] num1 = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        System.out.println("결과: " + solution(num1));

    }

    public static String solution(int[] numLog) {
        String answer = "";

        for (int i = 0; i < numLog.length -1; i++) {
            if (numLog[i] + 1 == numLog[i + 1]) answer += 'w'; // 현재 인덱스의 숫자를 1만큼 더했을 때 같으면 뒤의 인덱스 숫자와 같으면 w 추가
            else if (numLog[i] - 1 == numLog[i + 1]) answer += 's'; // 현재 인덱스의 숫자를 1만큼 뺐을 때 같으면 뒤의 인덱스 숫자와 같으면 s 추가
            else if (numLog[i] + 10 == numLog[i + 1]) answer += 'd'; // 현재 인덱스의 숫자를 10만큼 더했을 때 같으면 뒤의 인덱스 숫자와 같으면 d 추가
            else answer += 'a'; // 현재 인덱스의 숫자를 10만큼 뺐을 때 같으면 뒤의 인덱스 숫자와 같으면 a 추가
        }

        return answer;
    }
}
