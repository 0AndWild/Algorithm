package programmers;

import java.util.ArrayList;
import java.util.List;

public class Q48 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,3,3,4,5,5,4,1,0,0,1,1}));
    }
    public static List solution(int []arr) {

        List x = new ArrayList<>();

        for(int i = 0; i< arr.length-1; i++){
            if (arr[i]!=arr[i+1]){
                x.add(arr[i]);
            }
        }

        x.add(arr[arr.length-1]);

        return x;
    }

}
