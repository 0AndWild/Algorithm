package programmers;

import java.util.ArrayList;
import java.util.List;

/*모의고사*/
public class Q45 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,3,2,4,2}));

    }

    public static List<Integer> solution(int[] answers) {


        List<Integer> result = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        int[] one = new int[]{1,2,3,4,5,1,2,3,4,5};
        int[] two = new int[]{2,1,2,3,2,4,2,5,2,1};
        int[] three = new int[]{3,3,1,1,2,2,4,4,5,5};
        int cnt1 =0;
        int cnt2 =0;
        int cnt3 =0;

        if (answers.length>10){
            for(int i = 0; i< 10; i++){
                if(one[i]==answers[i]){
                    cnt1+=1;
                }
                if (two[i]==answers[i]){
                    cnt2+=1;
                }
                if (three[i]==answers[i]){
                    cnt3+=1;
                }
            }
        }

        for(int i = 0; i< answers.length; i++){
            if(one[i]==answers[i]){
                cnt1+=1;
            }
            if (two[i]==answers[i]){
                cnt2+=1;
            }
            if (three[i]==answers[i]){
                cnt3+=1;
            }
        }

        result.add(cnt1);
        result.add(cnt2);
        result.add(cnt3);

        if (result.get(0)>result.get(1)&&result.get(0)>result.get(2)){
            answer.add(1);
        } else if (result.get(1)>result.get(0)&&result.get(1)>result.get(2)) {
            answer.add(2);
        } else if (result.get(2)>result.get(0)&&result.get(2)>result.get(1)) {
            answer.add(3);
        } else if (result.get(0).equals(result.get(1))&&result.get(0).equals(result.get(2))) {
            answer.add(1);
            answer.add(2);
            answer.add(3);
        } else if (result.get(0).equals(result.get(1))&&result.get(0)>result.get(2)) {
            answer.add(1);
            answer.add(2);
        } else if (result.get(1).equals(result.get(2))&&result.get(1)>result.get(0)) {
            answer.add(2);
            answer.add(3);
        }
        return answer;

    }
}
