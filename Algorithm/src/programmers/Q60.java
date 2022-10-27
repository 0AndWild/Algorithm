package programmers;

import java.util.Arrays;
import java.util.Collections;
/*최솟값 만들기*/
public class Q60 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 4, 2},new int[]{5, 4, 4}));
    }

    public static int solution(int []A, int []B) {
        int answer = 0;
        //누적 최소 값이므로 가장 큰수와 가장 작은 수를 곱해주기 위해 하나는 오름차순 하나는 내림차순으로 정렬

        /*오름차순*/
        Arrays.sort(A);
        /*내림차순 정렬*/
        // Collectons는 기본적으로 Object를 상속한 클래스에 대해서 사용 가능하므로
        //String,Integer,Double 등과 같은 Object 타입에 배열은 sort에 Collections.reverseOrder()사용이 가능하고
        //기본타입인 int, double, char, float 등은 사용이 불가능함.
        //따라서 int[]B 배열을 Integer[]b 배열로 변환후 내림차순 정렬
        Integer[] b = new Integer[B.length];
        for (int i = 0; i<B.length; i++) b[i] = B[i];
        Arrays.sort(b, Collections.reverseOrder());
        /*answer = 누적 값*/
        for(int i=0; i<A.length; i++){
            answer = A[i] * b[i] + answer;
        }
        return answer;
    }

}
