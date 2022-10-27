package programmers;

public class Q37 {
    public static void main(String[] args) {
        System.out.println(solution(Integer.parseInt("123")));
    }


        public static int solution(int n) {
            int answer = 0;
            String number = String.valueOf(n);
            char[] num = number.toCharArray();

            for(int i=0; i < num.length; i ++){
                answer += Integer.parseInt(String.valueOf(num[i]));
            }

            return answer;
        }


}
