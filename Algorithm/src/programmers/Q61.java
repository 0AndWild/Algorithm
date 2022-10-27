package programmers;

import java.util.*;

/*이중우선순위큐*/
public class Q61 {
    public static void main(String[] args){
        System.out.println(solution(new String[]{"I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1", "I 1", "I 2", "I 3", "I 4", "I 5", "I 6", "I 7", "I 8", "I 9", "I 10", "D 1", "D -1", "D 1", "D -1"}));
    }

    public static int[] solution(String[] operations) {
        int[] answer = {};
        answer = new int[]{0,0};
        ArrayList<String> arrayList = new ArrayList<>(List.of(operations));
        ArrayList<Integer> number = new ArrayList<>();

        for (int i =0; i<arrayList.size(); i++){
            //I를 포함하고 있을 경우 숫자만 ArrayList에 추가
            if (arrayList.get(i).contains("I")){
                String remove = arrayList.get(i).replaceAll("[^0-9,-]","");
                int parseInt = Integer.parseInt(remove);
                number.add(parseInt);
                //최솟값 최댓값을 찾기 위해 정렬
                Collections.sort(number);
                continue;
            }
            //최댓값 삭제
            if (arrayList.get(i).equals("D 1") && !number.isEmpty()){
                number.remove(number.size()-1);
                continue;
            }
            //최솟값 삭제
            if (arrayList.get(i).equals("D -1") && !number.isEmpty()){
                number.remove(number.get(0));
            }
        }

        if (!number.isEmpty()){
            answer[0] = number.get(number.size()-1);
            answer[1] = number.get(0);
        }
        return answer;
    }
}
