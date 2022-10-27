package programmers;

import java.util.ArrayList;
import java.util.List;

/*JadenCase 문자열 만들기(Lv.2)[프로그래머스] +13 */
public class Q52 {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me "));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        List<String> split = List.of(s.split(""));
        List<String> changeLowerCase = new ArrayList<>();
        //모든 글자 소문자로 변환
        for (String change : split){
            String lowerCase = change.toLowerCase();
            changeLowerCase.add(lowerCase);
        }
        // i번째 인덱스가 " "이고 i+1번째 인덱스가 " "이 아닐경우 단어의 첫번째 글자이므로 대문자로 변환
        for(int i= 0; i<changeLowerCase.size()-1; i++) {
            if (changeLowerCase.get(i).equals(" ") && !changeLowerCase.get(i+1).equals(" ")) {
                changeLowerCase.set(i+1, changeLowerCase.get(i+1).toUpperCase());
            }
        }
        //첫번째 단어 첫 글자는 공백이 없을 수 있으므로 대문자로 변환
        changeLowerCase.set(0, changeLowerCase.get(0).toUpperCase());

        for (String result : changeLowerCase){
            answer.append(result);
        }

        return answer.toString();
    }
}
