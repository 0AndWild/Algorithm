package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*[1차] 비밀지도(Lv.1)[프로그래머스 2018 KAKAO BLIND RECRUITMENT]*/
public class Q51 {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}));
    }
    public static List<String> solution(int n, int[] arr1, int[] arr2) {
        //비밀지도1
        List<String> map1 =new ArrayList<>();
        //비밀지도2
        List<String> map2 =new ArrayList<>();
        //비밀지도 1+2 합친거
        List<String> secretMap = new ArrayList<>();
        //1번지도 이진수로 변환하여 1일경우 # 0일경우 " "으로
        for (int x : arr1){
            String result = "";
            int change = x;
            while (change>0){
                if (change%2==1){
                    result+="#";
                    change = change /2;
                } else if (change%2==0) {
                    result+=" ";
                    change = change /2;
                }
                if (change==1){
                    result +="#";
                    break;
                }
            }
            //인진수로 변환했을때 그 길이가 n보다 작을 경우 n만큼의 길이가 될때까지 " " 추가
            if (result.length()<n){
                while (result.length()<n){
                    result += " ";
                }
            } else if (result.length()>n){
                for (int i = 0; i<n; i++){
                    result = result.substring(0,n+1);
                }
            }
            StringBuffer sb = new StringBuffer(result);
            result = sb.reverse().toString();
            map1.add(result);
        }
        //2번지도 이진수로 변환하여 1일경우 # 0일경우 " "으로
        for (int x : arr2){
            String result = "";
            int change = x;
            while (change>0){
                if (change%2==1){
                    result+="#";
                    change = change /2;
                } else if (change%2==0) {
                    result+=" ";
                    change = change /2;
                }
                if (change==1){
                    result +="#";
                    break;
                }
            }
            if (result.length()<n){
                while (result.length()<n){
                    result += " ";
                }
            } else if (result.length()>n){
                for (int i = 0; i<n; i++){
                    result = result.substring(0,n+1);
                }
            }
            StringBuffer sb = new StringBuffer(result);
            result = sb.reverse().toString();
            map2.add(result);
        }

        for (int i = 0; i<map1.size(); i++){
            //인덱스별 문자열을 하나씩 쪼개서 리스트에 넣어줌
            List<String> split1 = List.of(map1.get(i).split(""));
            List<String> split2 = List.of(map2.get(i).split(""));
            String sum = "";
            for (int j = 0; j<split1.size(); j++){
                //0번째 인덱스부터 1번지도 2번지도 비교하여 둘 중 하나라도 #있으면 # 둘다 없으면 " "
                if (Objects.equals(split1.get(j), "#") || Objects.equals(split2.get(j), "#")){
                    sum += "#";
                } else if (Objects.equals(split1.get(j), " ") && Objects.equals(split2.get(j), " ")){
                    sum += " ";
                }
            }
            secretMap.add(sum);
        }

        return secretMap;
    }
}
