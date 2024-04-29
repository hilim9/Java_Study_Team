package codingtest_basic.day20;

public class Test03 {
    public static void main(String[] args) {

        // 문자열 묶기

        String[] strArr = {"a","bc","d","efg","hi"};

        System.out.println("result: " + solution(strArr));
    }

    public static int solution(String[] strArr) {
        int answer = 0;

        int[] arr = new int[30]; // 원소의 최대 길이만큼 배열 생성
        for(int i = 0; i < strArr.length; i++) {
            arr[strArr[i].length()-1]++; // 길이 -1 에 해당되는 인덱스에 누적해서 값 저장
            //System.out.println(Arrays.toString(arr));
        }

        for(int num : arr) {
            if(answer < num) answer = num; // answer보다 num이 클 때 answer에 저장
        }

        return answer;
    }
}
