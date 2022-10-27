package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*최댓값과 최솟값*/
public class Q65 {
    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 -4"));
    }
    public static String solution(String s) {
        String answer = "";
        List<String> split = new ArrayList<>(List.of(s.split(" ")));
        List<Integer> integers = new ArrayList<>();
        for (String s1: split){
            int number = Integer.parseInt(s1);
            integers.add(number);
        }
        Collections.sort(integers);
        answer+= integers.get(0);
        answer+= " ";
        answer+= integers.get(integers.size()-1);

        return answer;
    }
}
