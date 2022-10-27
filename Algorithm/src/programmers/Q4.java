package programmers;//두 정수 사이의 합

public class Q4 {
    //    private static int i = 0;
    public static void main(String[] args) {
        System.out.println(solution(5,3 ));
        System.out.println(solution2(5,3));

    }

    public static long solution(int a, int b) {
        long answer = 0;
//        int sum = 0;
////        int i = 0;
//        int j = 0;
        if (a < b) { //만약 a가 b보다 작거나 같다면
            for (int i = a; i <= b; i++) {       //a부터 b까지 하나씩 증감한다
                answer +=i; ////////////////// 중요 x9999!!!! += 은 앞에 선언되어진 값에 더해준다. 반대로 =+는 값이 현재 선언된 값으로 변경됨!
//                    sum +=i;        //sum은 a + i + b
//                    return sum;
            }
        } else  //만약 a가 b보다 크거나 같다면
            for (int i = b; i <= a; i++) {       //b부터 a까지 하나씩 증감한다
                answer +=i;
//                sum = b + i + a;        //sum은 b + i + a
//                return sum;
            }
        return answer;
    }

    public static long solution2(int c, int d) {
        return sumAtoB(Math.min(c, d), Math.max(d, c)); // Math.min 은 int 값 중 작은 값을 가져오고 Math.max는 int 값 중 큰 값을 가져온다.
    }
    private static long sumAtoB(long c, long d){ //위의 내장 함수로 인해 c는3으로 바뀌고 d는 5로 바뀜!

        return (c+d)*(d-c+1)/2; //등차수열의 합 공식 (d-c+1)*(c+d)/2; 이렇게 해도 동일함!
    }
}







