package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*신규 아이디 추천(Lv.1)[프로그래머스 2021 KAKAO BLIND RECRUITMENT]*/

public class Q49 {
    public static void main(String[] args) {
        System.out.println(solution("z-+.^."));
    }

    public static String solution(String new_id) {
        String answer = "";
        //Step1 소문자 변환
        String stepOne = new_id.toLowerCase();
        //Step2 허용되는 특수문자 외 모두 제거

        String change = stepOne.replaceAll("[^a-z0-9._-]","");
        String[] arr = change.split("");
        List<String> stepTwo = new ArrayList<>(Arrays.asList(arr));


//        stepTwo.removeIf(x -> !x.equals("1") && !x.equals("2") && !x.equals("3") && !x.equals("4") && !x.equals("5") && !x.equals("6") &&
//                !x.equals("7") && !x.equals("8") && !x.equals("9") && !x.equals("0") && !x.equals("a") && !x.equals("b") &&
//                !x.equals("c") && !x.equals("d") && !x.equals("e") && !x.equals("f") && !x.equals("g") && !x.equals("h") &&
//                !x.equals("i") && !x.equals("j") && !x.equals("k") && !x.equals("l") && !x.equals("m") && !x.equals("n") &&
//                !x.equals("o") && !x.equals("p") && !x.equals("q") && !x.equals("r") && !x.equals("s") && !x.equals("t") &&
//                !x.equals("u") && !x.equals("v") && !x.equals("w") && !x.equals("x") && !x.equals("y") && !x.equals("z") &&
//                !x.equals("-") && !x.equals("_") && !x.equals("."));
        //Step3 연속 . 제거
        List<String> stepThree = stepTwo;
        List<String> stepFour = new ArrayList<>();
        for (int i = 0; i<stepThree.size()-1; i++){
            if (!stepThree.get(i).equals(".")){
                stepFour.add(stepThree.get(i));
            } else if (!stepThree.get(i+1).equals(".")){
                stepFour.add(stepThree.get(i));
            }
        }
        if (!stepThree.get(stepThree.size()-1).equals(".")){
            stepFour.add(stepThree.get(stepThree.size()-1));
        }

        //step4,5 처음 or 끝이 . 이면 제거, 빈문자열 일경우 "a" 대입
        if (stepFour.isEmpty()){
            stepFour.add("a");
        }else if (stepFour.get(0).equals(".")){
            stepFour.remove(0);
        } else if (stepFour.get(stepFour.size()-1).equals(".")) {
            stepFour.remove(stepFour.size()-1);
        }

        //step6 newId 길이가 16자리 이상일경우 처음 15개 빼고 모두 제거 만약 제거 후 마지막이 "."일 경우 제거
        List<String> stepSix = new ArrayList<>();
        if(stepFour.size()>=16){
            for (int i = 0; i<15; i++){
                stepSix.add(stepFour.get(i));
            }
        }else {
            stepSix = stepFour;
        }
        if (stepSix.get(stepSix.size()-1).equals(".")){
            stepSix.remove(stepSix.size()-1);
        }
        //step7 newId 길이가 2 이하라면 마지막 문자를 newId가 3이 될 때까지 반복해서 붙임.
        List<String> stepSeven = new ArrayList<>();
        if (stepSix.size()<=2){
            for (int i = 0; i<3; i++){
                stepSix.add(stepSix.get(stepSix.size()-1));
                if (stepSix.size()==3){
                    break;
                }
            }
            stepSeven = stepSix;
        } else {
            stepSeven = stepSix;
        }
        //리스트를 다시 String 형태로 변환
        for (String s : stepSeven){
            answer += s;
        }
        return answer;
    }
}
