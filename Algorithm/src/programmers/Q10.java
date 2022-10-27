package programmers;

import java.util.Arrays;

//행렬의 덧셈
public class Q10 {
    public static void main(String[] args) {
        int[][]arr1;
        int[][]arr2;
        System.out.println(Arrays.deepToString(solution(arr1 = new int[][]{{4, 6}, {7, 9}}, arr2 = new int[][]{{4, 6}, {7, 9}})));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        for(int i=0; i < arr1.length;i++){ //i 0으로 정의되고 밑으로 // i 1로 정의되고 밑으로
            for(int j=0; j < arr1[0].length;j++){ // j 0으로 정의되고 밑으로// 동일하게 반복
                 arr1[i][j]+=arr2[i][j]; // i j 모두 0이므로 각각의 0번째 인덱스끼리 더하기를 하고 다시 for문 처음으로
            }
        }
        return arr1;
    }
}
