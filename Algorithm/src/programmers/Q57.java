package programmers;

public class Q57 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
    }
    public static int solution(int[][] maps) {
        int answer = 0;
        int row = maps[0].length;
        int zeroCnt = 0;
        for (int[] map: maps){
            for (int i=0;i<map.length; i++){
                if(map[i]==1){
                    zeroCnt++;
                }
            }
        }
        answer = zeroCnt - row;
        return answer;
    }
}

