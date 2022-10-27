package programmers;

public class Q15 {
    public static void main(String[] args) {
        int[] a;
        int[] b;
        System.out.println(solution(a= new int[]{4,4},b= new int[]{5,-12}));
    }


    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++){ //for문 이용하여 i = 0으로 초기화
            answer += a[i]*b[i]; // a,b의 0번쨰 인덱스끼리 곱하고 answer에 더
        }                        // 다시 for문으로 올라가 i가 1로 올라가고 다시 밑으로 내려와 계산 후
        return answer;           // 다시 for문으로 올라가 i는 2가 되고 a의 길이는 2이기 때문에 막히고 종료
    }
}
