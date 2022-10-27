package programmers;

import java.util.LinkedList;

/*[1차]캐시 2018 KAKAO BLIND RECRUITMENT*/
public class Q64 {
    public static void main(String[] args) {
        System.out.println(solution(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
    }

    public static int solution(int cacheSize, String[] cities) {
        int time = 0;
        int hit = 1;
        int miss = 5;
        LinkedList<String> q = new LinkedList<>();
        //캐시 크기가 0일경우 모두 miss, cities의 길이 * 5
        if (cacheSize == 0) {
            time = cities.length * 5;
            return time;
        }

        //캐시 크기가 0초과 일경우에만 캐시에 할당하여 작업 시작
            for (int i = 0; i < cities.length; i++) {
                //소문자 대문자 구분이 없으므로 대문자로 통일
                String upperCase = cities[i].toUpperCase();
                //캐시에 동일한 작업이 할당되어 있지 않은 경우 miss(time+=5), 작업을 추가함
                if (!q.contains(upperCase)){
                    q.addFirst(upperCase);
                    time+=miss;
                    //캐시에 동일한 작업이 존재하는 경우 hit(time+=1), 맨 앞으로 가져옴
                }else{
                    q.remove(upperCase);
                    q.addFirst(upperCase);
                    time+=hit;
                }
                //캐시 크기 보다 q의 크기가 클경우 제일 오래된 작업 삭제
                if (q.size()>cacheSize){
                    q.removeLast();
                }
            }
            return time;
    }
}
