package programmers;


/*올바른 괄호(스택/큐) +9*/
public class Q53 {
    public static void main(String[] args) {
        System.out.println(solution("()()"));
    }

    static boolean solution(String s) {
        int cnt = 0;
        if (s.length()%2!=0){
            return false;
        }

        if (String.valueOf(s.charAt(0)).equals(")")||String.valueOf(s.charAt(s.length()-1)).equals("(")){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals("(")) {
                cnt +=1;
            } else {
                cnt -=1;
            }
            if (cnt<0){
                return false;
            }
//            if (cnt == 0 && String.valueOf(s.charAt(i + 1)).equals(")")) {
//                return false;
//            }
        }

        if (cnt==0){
            return true;
        } else{
            return false;
        }
    }
}
