package programmers;

import java.util.List;
/*하샤드수*/
public class Q70 {
    public boolean solution(int x) {
        boolean answer = true;
        //split을 하기위해 String type으로 변환
        List<String> split = List.of(String.valueOf(x).split(""));
        int sum = 0;
        for (String s : split) {
            //x의 x자리 수의 합을 위해 int타입으로 변환 후 sum+=
            sum += Integer.parseInt(s);
        }
        //x를 sum으로 나누었을 때 나머지가 0이 아니면 하샤드 수 x
        if (x%sum!=0){
            answer = false;
        }
        return answer;
    }
}
