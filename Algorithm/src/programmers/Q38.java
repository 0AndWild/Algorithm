package programmers;

import java.util.*;

public class Q38 {
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 4, 0, 1, 1})));
//    }
//
//
//// 중복 모두 제거 (Stream.distinct 활용)
//    public static int[] solution(int[] n) {
//
//        return Arrays.stream(n).distinct().toArray();

    //
    public int solution(int N, int[][] relation, String[] dirname) {
        int answer = 0;
        int sum;
        List<Integer> x = new ArrayList<>();

        for(int i = 0; i<=N; i++){
            sum = relation[i][1]+relation[i][2];
            x.add(sum);
        }
        Collections.sort(x);

        int y = x.get(x.size()-1);

        for(int i = 0; i<=N; i++){
            sum = relation[i][1]+relation[i][2];
            if(y==sum){
            }
        }




        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 5;
        for(int i = 1; i<= a; i++){
            System.out.println("*");
        }


    }
}




