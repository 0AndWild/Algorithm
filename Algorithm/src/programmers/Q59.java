package programmers;

import java.util.List;

/*이진변환 반복하기*/
public class Q59 {
    public static void main(String[] args) {
        System.out.println(solution("110010101001"));
    }
    public static int[] solution(String s) {
        int[] answer = new int[2];
        //이진수가 1이 될때까지 반복
        while(!s.equals("1")){
            List<String> split = List.of(s.split(""));
            //0을 제거한 길이 == s에 있는 1의 개수
            int noZeroLength = 0;
            for(String number : split){
                //0일 경우 == 0을 제거한 횟수 +1
                if(number.equals("0")){
                    answer[1] ++;
                } else if(number.equals("1")){
                    noZeroLength +=1;
                }
            }
            //0을 제거한 길이를 이진수로 변환
            s = Integer.toBinaryString(noZeroLength);
            //위의 변환과정 끝나면 +1
            answer[0] ++;
        }
        return answer;
    }
}
