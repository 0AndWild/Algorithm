package programmers;

public class Q63 {
    public static void main(String[] args) {
        System.out.println(solution(2,8));
    }
    public static int[] solution(int n, int s) {
        if(n > s)
            return new int[]{-1};
        int[] answer = new int[n];
        int t = s / n;
        int sum = s - (t * n);
        for(int i = 0; i < n; i++){
            if(i >= n - sum)
                answer[i] = t + 1;
            else
                answer[i] = t;
        }
        return answer;
    }
}
