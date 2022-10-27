package programmers;

//문자열 다루기 기본
public class Q17 {
    public static void main(String[] args) {
        System.out.println(solution("a234"));
    }


    public static boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        else return false;
    }
}
