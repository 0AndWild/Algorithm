package programmers;

/*영어 끝말잇기 Summer/Winter Coding(~2018)*/
/*실패*/

import java.util.*;

public class Q66 {
    public static void main(String[] args) {
        System.out.println(solution(3,new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
    }
    public static int[] solution(int n, String[] words) {
        int[] answer = new int[]{0,0};
        int[] turn = new int[n];

        Queue<String> q = new LinkedList<>(List.of(words));
        Stack<String> alreadyAnswer = new Stack<>();

        //stack에 값을 넣어줌
        //stack에 들어간 단어 맨 끝과 q에서 꺼내온 단어 맨 앞자리를 비교 동일하면 통과
        //만약 2명의 사람에서 말한 단어가 2개라면

        while (!q.isEmpty()){

            for (int i=0; i<n; i++){
                turn[i]+=1; //몇번째 턴인지 확인 하기 위함
                String poll = q.poll();
                if (poll.length()<2 || poll.length()>50){ //한 글자인 단어는 불가
                    answer[0] = i+1;
                    answer[1] = turn[i];
                    return answer;
                }
                if (alreadyAnswer.contains(poll)){ //중복값이 존재하면 break;
                    answer[0] = i+1;
                    answer[1] = turn[i];
                    return answer;
                }
                alreadyAnswer.add(poll);
                char lastChar = alreadyAnswer.peek().charAt(alreadyAnswer.peek().length()-1);
                if (q.isEmpty()){
                    return answer;
                }
                char firstChar = q.peek().charAt(0);
                if (lastChar!=firstChar){
                    if (i+2>n){
                        answer[0] = 1;
                        answer[1] = turn[i]+1;
                    }else {
                        answer[0] = i+1;
                        answer[1] = turn[i]+1;
                    }
                    return answer;
                }
            }
        }

        return answer;
    }
}
