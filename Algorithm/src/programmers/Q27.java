package programmers;

//콜라츠 추측
public class Q27 {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }

    public static long solution(long num) {
        int answer = 0;
        for (int i = 0; i < 501; i++) {
            if (i >=500) { //i 계산 횟수 500 초과시 -1로 리턴
                answer = -1;
                break;
            }

            if (num == 1) { //2로 나눈 값이 1이라면 그 과정 횟수를 결과 값으로 배출
                return answer = i;
            }
            if (num % 2 == 0) { //num이 짝수라면 <<<<<<<<<<<<<
                num = num / 2;  //num을 2로 나눔

            } else {  // num이 홀수라면 여기로 <<<<<<<<<<<<
                num = num * 3 + 1; // 그 값에 3을 곱하고 1을 더해줌
            }

        }
        return answer;
    }
}



