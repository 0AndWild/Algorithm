package programmers;//평균 구하기

public class Q8 {
    public static void main(String[] args) {
        int[] arr;
        System.out.println(solution( arr= new int[]{1}));

    }

    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int i= 0; i < arr.length; i++){
            sum += arr[i];
        }
        answer = sum / arr.length;

        return answer;
    }
}
