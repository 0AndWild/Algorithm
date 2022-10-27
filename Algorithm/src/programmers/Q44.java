package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*K번째수*/
public class Q44 {
    public static void main(String[] args) {
        System.out.println((solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

    public static List<Integer> solution(int[] array, int[][] commands) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i< commands.length; i++){
            List<Integer> split = new ArrayList<>();
            for (int j =commands[i][0]; j<=commands[i][1];j++){
                split.add(array[j-1]);
            }
            Collections.sort(split);
            result.add(split.get(commands[i][2]-1));
        }

        return result;
    }
}
