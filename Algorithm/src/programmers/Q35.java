package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q35 {
    public static void main(String[] args) {
        String[] strings;
        System.out.println(Arrays.toString(solution(strings = new String[]{"sun", "bed", "car"}, 1)));
    }

    public static String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> list = new  ArrayList<>();
        for (String string : strings) {
            list.add(string.charAt(n) + string);
        }

        Collections.sort(list);

        answer = new String[list.size()];

        for(int i=0; i< list.size();i++){
            answer[i] =list.get(i).substring(1,list.get(i).length());
        }


        return answer;
    }
}
