package programmers;

/*콜라문제*/
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while(n!=0){
            int keep = n%a;
            int newCokes = n/a*b;
            answer+=newCokes;
            n= keep+newCokes;
            if(n<2 || n<a)break;
        }
        return answer;
    }
}
