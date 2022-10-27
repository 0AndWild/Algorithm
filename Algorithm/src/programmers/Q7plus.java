package programmers;

//음양 더하기
public class Q7plus {
    public static void main(String[] args) {
        int[] absolutes;
        boolean[] signs;
        System.out.println(solution(  absolutes = new int[]{5,8,4},signs = new boolean[]{true,false,true}));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i =0; i < absolutes.length ; i++){ //i를 0 으로 초기화
            if (signs[i]){  //signs의 0번째 인덱스가 true일경우 밑으로 false이면 else구문으로
                answer += absolutes[i]; //0번째 인덱스의 값을 answer변수에 더해준다 다시 for문으로 돌아가 i는 1이되고 배열의 길이만큼 반복
            } else{
                answer -= absolutes[i]; //answer의 변수에 빼준다
            }

        }
        return answer;
    }


}
