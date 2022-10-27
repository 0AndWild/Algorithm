package programmers;

import java.util.Calendar;
import java.util.Locale;

public class Q13 {
    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }

    public static String solution(int a, int b) {

        Calendar cal = new Calendar.Builder().setCalendarType("iso8601").setDate(2016, a- 1, b).build();
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, new Locale("ko-KR")).toUpperCase();

    }
}

//    String[] dOTW = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT",
//            "SUN","MON","TUE","WED","THU","FRI","SAT",
//            "SUN","MON","TUE","WED","THU","FRI","SAT",
//            "SUN","MON","TUE","WED","THU","FRI","SAT",
//            "SUN","MON","TUE"};
//    int[] Month = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
//    int[] day = new int[]   {1,2,3,4,5,6,7,8,9,10,
//            11,12,13,14,15,16,17,18,19,20,
//            21,22,23,24,25,26,27,28,29,30,31};
//
//        for(int m = 0; m < Month.length; m++){
//        if (Month[m] == a){
//        for (int d =0; d < day.length; d++){
//        if (day[d]==b){
//        answer = dOTW[d];
//        }
//        }
//        }
//        }
