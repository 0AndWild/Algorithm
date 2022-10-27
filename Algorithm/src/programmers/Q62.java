package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

/*야근지수 +13*/
public class Q62 {
    public static void main(String[] args) {
        System.out.println(solution(4,new int[]{4, 3, 3}));
    }
    public static long solution(int n, int[] works) {
        int totalWorks = 0;
        long totalFatigue = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        //1.남은일의 총 합 = totalWorks
        //2.우선순위큐에 남은 일을 넣어줌
        for (int work : works) {
            totalWorks += work;
            pq.add(work);
        }
        //totalWorks가 n(Demi가 처리할 수 있는 일의 양) 보다 작거나 같을 경우 야근 x
        if(totalWorks<=n){
            return totalFatigue;
        }
        //n이 1보다 크거나 작은 경우 우선순위큐의 최대힙 -1 을 n만큼 반복
        while(n>=1){
            if (pq.peek()>0){
                int mh =pq.poll()-1;
                pq.add(mh);
                n--;
            } else break;

        }
        //totalFatigue = 남은 잔업량의 제곱
        for (int fatigue: pq){
            if (fatigue!=0){
                totalFatigue += Math.pow(fatigue,2);
            }
        }

        return totalFatigue;
    }
}
