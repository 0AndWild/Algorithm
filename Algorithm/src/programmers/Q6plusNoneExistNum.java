package programmers;

//없는 숫자 더하기
public class Q6plusNoneExistNum {
    public static void main(String[] args) {
        int[] numbers;
        System.out.println(solution(  numbers = new int[]{5,8,4,0,6,7,9}));// 1부터 9까지 값 중 없는 값은 1,2,3//합은 6
    }
    public static int solution(int[] numbers) {
        int answer = 45; // 1~9까지의 모두의 합은 45 // (1+9)*(9-1+1)/2 = 45 //등차수열의 합을 이용
        for(int number : numbers){ //for문을 이용해 numbers에 있는 값을 하나씩 찾아냄
            answer -= number; //그 값을 answer 값에서 빼주고 다시 for문으로 이동
        }

        return answer;
    }
}

