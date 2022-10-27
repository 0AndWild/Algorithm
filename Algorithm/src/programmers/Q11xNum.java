package programmers;//함수 solution은 정수 x와 자연수 n을 입력 받아,
// x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.


import java.util.Arrays;

public class Q11xNum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for (int i = 0; i < answer.length; i++){
            answer[i] = num; //for문을 통해 i번째 index에 밑에서 더해준 새로운 num(=x) 값을 할당
            num += x; // for 문 한 번 돌 떄마다 num 값에 x값을 한 번씩 더해줌
        }
        return answer;
    }
}
