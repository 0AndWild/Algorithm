package programmers;

public class Q2짝수와홀수 {
    public static void main(String[] args) {
        //정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
        //
        //제한 조건
        //num은 int 범위의 정수입니다.
        //0은 짝수입니다.
        int num = 3;
        if (num % 2 == 0) {
            String answer = "Even";
            System.out.println(answer);
        } else  {
            String answer = "Odd";
            System.out.println(answer);
        }
    }
}
