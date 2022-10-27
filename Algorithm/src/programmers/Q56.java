package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q56 {
    public static void main(String[] args) {
        System.out.println(solution(
                new String[]{"123.023.123.123", "1.1.1.12", "119.123.45.39", "127.0.0.1"},
                new String[]{"119.123.45.39"},
                new String[]{"1.1.1.12"}
        ));
    }
    public static List<Integer> solution(String[] ip_addresses, String[] registered_list, String[] banned_list){
        List<Integer> answer = new ArrayList<>();
        //ip주소들
        List<String> adresses = new ArrayList<>(Arrays.asList(ip_addresses));
        //등록된 ip List형태로 변환
        List<String> registered = new ArrayList<>(Arrays.asList(registered_list));
        //차단된 ip List형태로 변환
        List<String> banned = new ArrayList<>(Arrays.asList(banned_list));
        /*규격확인*/
        for (String address: adresses){
            List<String> split = List.of(address.split("\\."));
            //.을 기준으로 숫자가 4개를 넘어가능 경우
            if (split.size()>4) {
                answer.add(1);
                break;
            } else {
                for (String s : split) {
                    //0과 함께 다른 숫자가 있을 경우
                    if (s.contains("0") && s.length() > 1) {
                        answer.add(1);
                        break;
                    }
                    //0부터 255숫자 까지만 허용
                    if (Integer.parseInt(s) > 255) {
                        answer.add(1);
                        break;
                    }
                    break;
                }
            }
                if (registered.contains(address)) {
                    answer.add(0);
                    //차단된 ip
                } else if (banned.contains(address)) {
                    answer.add(3);
                } else if (!registered.contains(address) && !banned.contains(address)) {
                    answer.add(2);
                }

        }
        return answer;
    }
}
