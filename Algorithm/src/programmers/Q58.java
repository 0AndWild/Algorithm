//package algorithm;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
///*하노이의탑*/
//public class Q58 {
//    public static void main(String[] args) {
//        System.out.println(solution(4));
//    }
//
//    public static List<Integer[]> solution(int n) {
//        ArrayList<Integer[]> answer = new ArrayList<>();
//        //움지여야하는 횟수
//        int resultLength = n + (n - 1);
//        /*규칙*/
//        //Integer[][] rule = {{1, 2}, {1, 3}, {2, 1}, {2, 3}};
//        while (answer.size() < resultLength) {
//            answer.add(new Integer[]{1, 2});
//            if (answer.size() == resultLength - 1) {break;}
//            answer.add(new Integer[]{1, 3});
//            if (answer.size() == resultLength - 1) {break;}
//            answer.add(new Integer[]{2, 1});
//            if (answer.size() == resultLength - 1) {break;}
//            answer.add(new Integer[]{2, 3});
//            if (answer.size() == resultLength - 1) {break;}
//        }
//        //원판의 수 가 짝수일경우 마지막이 2번째 막대에서 3번째 막대로 이동 홀수일경우 1에서 3으로 이동
//        if (n % 2 == 0) {
//            answer.add(new Integer[]{2, 3});
//        } else {
//            answer.add(new Integer[]{1, 3});
//        }
//        return answer;
//    }
//}
