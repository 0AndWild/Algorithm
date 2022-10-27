package programmers;

/*점프와 순간이동(Summer/Winter Coding(~2018))+13*/
public class Q54 {
    public static void main(String[] args) {
        System.out.println(solution(6));
    }
    public static int solution(int n) {
        int battery = 0;
        int distance = n;
        while (distance>0){
            if( distance%2 == 0){
                distance = distance/2;
            }else {
                distance = (distance-1)/2;
                battery ++;
            }
            if (distance==0){
                break;
            }
        }
        return battery;
    }
}
