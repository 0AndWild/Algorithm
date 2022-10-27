package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*H-Index*/
public class Q69 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,4,4}));
    }

    public static int solution(int[] citations) {
        List<Integer> sort = new ArrayList<>();
        for (int i : citations){
            sort.add(i);
        }
        int hDex = 0;
        sort.sort(Collections.reverseOrder());

        for (int i = 0; i< sort.size(); i++){
            if (sort.get(i)>=i+1){
                hDex = i +1;
            }
            if (sort.get(i)<i+1) break;
        }

//        //오름차순
//        Collections.sort(sort);
//        int h = sort.get(sort.size()/2);
//        int calculation = sort.size()/2+1;
//        if (h>=sort.size()/2){
//            while (h>=sort.size()/2){
//                if (h<=calculation&&h>= sort.indexOf(sort.size()/2)){
//                    return h;
//                }
//                h-=1;
//                calculation+=1;
//            }
//        }else {
//            while (h<=sort.size()/2){
//                if (h>=calculation&&h>= sort.indexOf(sort.size()/2)){
//                    return h;
//                }
//                h+=1;
//                calculation-=1;
//            }
//        }

        return hDex;
    }
}
