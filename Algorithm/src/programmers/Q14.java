package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q14 {
    public static void main(String[] args) {

        int[] arr;
        int divisor;
        System.out.println(Arrays.toString(solution(arr = new int[]{10, 9, 7, 5}, 5)));
    }


    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> divarray = new ArrayList<>();
        for(int i:arr) { // : 콜론을 이용하여 arr안에 있는 객체를 차례대로 하나씩 꺼내 i에 넣어준다
            if (i % divisor == 0) { //i값의 나머지가 0과 일치하면
                divarray.add(i);    //divarray에 해당하는 i값을 추가해라
            }
        }
        if (divarray.size()==0)return new int[]{-1}; // 만약 divarray에 아무값도 오지 않으면 -1을 넣음
        Collections.sort(divarray);


//        int[] result = new int[divarray.size()]; //result 값은 divarray 크기
//        for(int j = 0; j < divarray.size(); j++ ){
//            result[j] = divarray.get(j); //.get을 이용해 인덱스 위치에 있는 객체를 리턴
//        }
//        Arrays.sort(result); //Array.sort를 이용해 오름차순으로 정렬
        return divarray.stream().mapToInt(i->i).toArray();
    }

}
