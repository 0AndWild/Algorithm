package programmers;//문자열을 정수로 바꾸기

public class Q5charStringToInteger {
    public static void main(String[] args) {
        System.out.println(solution( "12321", "24.32"));
    }
    public static int solution(String s,String n) {
        int answer = Integer.parseInt(s);
        // Integer.parseInt('n')는 n이 숫자나 문자로 구성되어 있을경우 숫자 부분만 지정한 진법으로 변환하는 함수!
        // Integer.parseInt(str,nBase)는 입력된 문자의 진법을 나타내고, 생략할 경우 10진수를 의미한다.
        //Float.parseFloat()함수는 숫자형 문자열을 입력받아 부동 소수점으로 변환하여 그 값을 반환해주는 함수.
        // ex) Float answer1 = Float.parseFloat(n);

        return answer;
    }
}
