package programmers;

/*체육복*/ /* +15점 */

import java.util.*;

public class Q43 {
    public static void main(String[] args) {
        System.out.println(solution(8,new int[]{5,6,7},new int[]{1,4,5}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {

        List<Integer> losts = new ArrayList<>();
        List<Integer> reserves = new ArrayList<>();

        for(int x: lost){
            losts.add(x);
        }
        for (int y: reserve){
            reserves.add(y);
        }

        //Lost와 reserve 리스트의 중복 학생 번호를 양쪽다 제거해줌
        for(int i=0; i<reserves.size(); i++){
            if (losts.contains(reserves.get(i))){
                int duplicate = reserves.get(i);
                losts.remove(Integer.valueOf(duplicate));
                reserves.remove(Integer.valueOf(duplicate));
            }
        }

        //오름차순으로 정렬해줌(13,18번 케이스가 정렬을 안해주면 통과가 안됨. 이유는 아직 모르겠음)
        Collections.sort(losts);
        Collections.sort(reserves);


        for (int x : reserves) {
            for (int j = 0; j < losts.size(); j++) {
                int y = losts.get(j);
                //x의[i]와 y의[j] int값을 빼서 같거나 -1 , +1 일 경우 빌려줄 수 있는 상태
                int isPresent = x - y;
                if (isPresent == 0 || isPresent == -1 || isPresent == 1) {
                    //if문 조건을 통과하면 빌려준걸로 판정하고 losts 리스트에서 해당 학생 번호를 제거해준다.
                    losts.remove(Integer.valueOf(y));
                    //2번째 for문에서 x값으로 한 번 더 빌려줄 수 있는 상황이 발생될 수 있기 때문에 break를 통해 for문 탈출
                    break;
                }
            }
        }

        //체육복을 빌리지 못한 학생이 있을 수 있기 때문에 총 학생 수 에서 빌리지 못한 학생 수 를 빼줌
        return n - losts.size();

    }
}
