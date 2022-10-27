package programmers;

//문자열 내 p와y의 개수
public class Q16 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
    }


     public static boolean solution(String s) {
        boolean answer = true;
         int Count = 0;

         char[] ch= s.toCharArray();

         for (int i=0; i <s.length();i++){
             if (ch[i] == 'p'||ch[i] == 'P')
                 Count++;
             else if(ch[i] == 'y'||ch[i] == 'Y')
                Count--;
         }
         if(Count != 0) {
             return false;
         }else {
             return true;
         }

    }
}
