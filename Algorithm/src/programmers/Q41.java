package programmers;

import java.util.Arrays;

/*최소직사각형*/
public class Q41 {
    public static void main(String[] args) {

        System.out.println(solution(new int[][] {{60,50},{30,70},{60,30},{80,40}}));
    }
    public static int solution(int[][] sizes) {
        int answer = 0;
        int[] arr1 = new int[sizes.length];
        int[] arr2 = new int[sizes.length];

        for(int i = 0; i < sizes.length; i++){
            if (sizes[i][0]<=sizes[i][1]){
                int change =sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = change;
            }
            arr1[i] = sizes[i][0];
            arr2[i] = sizes[i][1];
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        answer = arr1[arr1.length-1] * arr2[arr2.length-1];

        return answer;
    }
}
