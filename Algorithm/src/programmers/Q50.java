package programmers;

import java.util.HashMap;
import java.util.List;

/*성격 유형 검사하기 2022 KAKAO TECH INTERNSHIP*/
public class Q50 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"TR", "RT", "TR"},new int[]{7,1,3}));
    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String,Integer> mbti = new HashMap<>();
        mbti.put("R",0);
        mbti.put("T",0);
        mbti.put("C",0);
        mbti.put("F",0);
        mbti.put("J",0);
        mbti.put("M",0);
        mbti.put("A",0);
        mbti.put("N",0);
        int[] scoreBoard = new int[]{3,2,1,0,1,2,3};

        for (int i = 0; i< choices.length; i++){
            //인덱스는 0번 부터 시작하니 설문지에서 선택한 번호 -1
            int point = scoreBoard[choices[i]-1];
            //설문지 유형의 알파벳을 쪼개어 리스트에 저장
            List<String> character = List.of(survey[i].split(""));
            //선택한 번호가 4번 0점 이상인 경우 두번째 성격 유형에 점수를 부여함
            if (choices[i]>=4){
                mbti.put(character.get(1), mbti.get(character.get(1))+point);
            }else {
                mbti.put(character.get(0), mbti.get(character.get(0))+point);
            }
        }

        //점수가 같을 경우 알파벳 우선순위의 성격유형을 선택
        if (mbti.get("R")>=mbti.get("T")){
            answer = "R";
        } else {
            answer = "T";
        }
        if (mbti.get("C")>=mbti.get("F")){
            answer += "C";
        } else {
            answer += "F";
        }
        if (mbti.get("J")>=mbti.get("M")){
            answer += "J";
        } else {
            answer += "M";
        }
        if (mbti.get("A")>=mbti.get("N")){
            answer += "A";
        } else {
            answer += "N";
        }

        return answer;
    }
}
