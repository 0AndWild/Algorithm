package programmers;

import java.util.HashSet;

/*포켓몬*/
public class Q42 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,1,2,3}));
    }

    public static int solution(int[] nums) {

        /*Stream.distinct를 이용한 중복제거 문제풀이*/
//        int max = nums.length/2;
//        int[] result = Arrays.stream(nums).distinct().toArray();

//        if (max>result.length){
//            return result.length;
//        } else {
//            return max;
//        }

        /*HashSet을 이용한 중복제거 문제풀이*/ /*HashSet이 훨씬 더 처리속도가 빠름*/
        HashSet<Integer> result = new HashSet<>();
        int max = nums.length/2;

        for (int x: nums){
            result.add(x);
        }

        if (max>result.size()){
            return result.size();
        } else {
            return max;
        }

    }
}
