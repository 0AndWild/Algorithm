package programmers;

public class Q40 {
    public static void main(String[] args) {
        int[]d;
        int budget;
        System.out.println(solution(new int[]{1,2,3,4,5}, 10));
      
        
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;
        for(int i=0; i<d.length; i++){
            budget-=d[i];
            total+=1;
            if (budget<0){
                total-=1;
            }else if (budget==0){
                return total;
            }
        }
        answer = total;
        return answer;
    }
}
