package codingtest_basic.day08;

public class Test02 {
    public static void main(String[] args) {

        // 주사위 게임 3
        System.out.println("주사위가 모두 일치할 때: " + solution(2,2,2,2));
        System.out.println("주사위 세 개가 일치할 때: " + solution(4,1,4,4));
        System.out.println("주사위 두 개가 쌍으로 일치할 때: " + solution(6,3,3,6));
        System.out.println("주사위 두 개가 일치할 때: " + solution(2,5,2,6));
        System.out.println("주사위가 모두 다를 때: " + solution(6,4,2,5));

    }

    public static int solution(int a, int b, int c, int d) {

        int answer = 0;

        // 주사위 모두 일치
        if(a == b && b == c && c == d) answer += 1111 * a;

        // 주사위 세 개가 일치
        // d만 다를 때,
        else if(a == b && b == c && c != d) answer += (10 * a + d) * (10 * a + d);

        // c만 다를 때.,
        else if(a == b && b == d && d != c) answer += (10 * a + c) * (10 * a + c);

        // b만 다를 때 ,
        else if(a == d && d == c && c != b) answer += (10 * a + b) * (10 * a + b);

        // a만 다를 때.
        else if(d == b && b == c && c != a) answer += (10 * d + a) * (10 * d + a);

        // 주사위 두 개가 일치
        // a와 b가 같을 때
        else if(a == b) {
            if(c == d) { // c와 d가 같을 때
                answer += (a + c) * Math.abs(a - c);
            }
            else{
                answer += c * d;
            }
        }

        // a와 c가 같을 때
        else if(a == c){
            if(b == d){ // b와 d가 같을 때
                answer += (a + b) * Math.abs(a - b);
            }
            else{
                answer += b * d;
            }
        }

        // a와 d가 같을 때
        else if(a == d) {
            if(b == c) { // b와 c가 같을 때
                answer += (a + b) * Math.abs(a - b);
            }
            else{
                answer += b * c;
            }
        }

        // b와 c가 같을 때
        else if(b == c) {
            if(a == d) { // a와 d가 같을 때
                answer += (b + a) * Math.abs(b - a);
            }
            else{
                answer += a * d;
            }
        }

        // b와 d가 같을 때
        else if(b == d) {
            if(a == c) { // a와 c가 같을 때
                answer += (b + a) * Math.abs(b - a);
            }
            else{
                answer += a * c;
            }
        }

        // c와 d가 같을 때
        else if(c == d) {
            if(b == a) { // b와 a가 같을 때
                answer += (c + b) * Math.abs(c - b);
            }
            else{
                answer += b * a;
            }
        }

        // 주사위가 모두 일치하지 않을 때
        else answer += Math.min(Math.min(a,b),Math.min(c,d));

        return answer;
    }

    /*public static int solution(int a, int b, int c, int d) {

        int answer = a;
        List<Integer> list = new ArrayList<>(Arrays.asList(a, b, c, d));
        int[] count = new int[list.size()]; // 각각의 주사위 수가 일치하는 개수를 담아줄 배열

        for (int n : list) { // 반복하면서 일치하는 개수를 count에 담는다
            count[n] = Collections.frequency(list, n);
        }

        Collection 안에 있는 객체가 몇번 등장했는지를 리턴해준다.

        Collections.frequency(객체를 담고 있는 컬렉션 인스턴스, 기대하는 객체)


        for (int i : count) {
            if (count[i] == 4) answer = 1111 * a; // 모두 같을 때
            else if (count[i] == 3) { // 세 개가 같을 때
                int same_dice = list.get(i); // 인덱스에 i 해당하는 list의 주사위 수를 가져온다
                int another_dice = 0;  // 세 개가 같을 때 한 개는 다른 수를 가지므로 그 수를 담아줄 변수
                for (int j : count) {
                    if (count[j] == 1) // count가 1일 때
                        another_dice = list.get(j); // list 배열과 count배열의 주사위 위치가 같으므로 list의 해당 인덱스 위치에 있는 값을 another_dice에 담아준다.
                }
                answer = (10 * same_dice + another_dice) * (10 * same_dice + another_dice);

            } else if (count[i] == 2) { // 두 개가 같을 때
                int count_num = 0;
                for (int j : list) {
                    if (count[i] == 2) count_num++;
                }
                if (count_num == 4) { // 두 개가 쌍으로 같을 때
                    answer = -1;
                } else { // 두 개만 같고 나머지는 다를 때
                    for (int k : count) {
                        if (count[k] != 2) answer *= list.get(k);
                    }
                }

            } else { // 모두 다를 때
                for (int min : list) {
                    answer = Math.min(answer, min); // 가장 작은 수 담기
                }
            }
        }
        return answer;
    }*/

}
