package programmers;

public class Q19 {
    public static void main(String[] args) {
        int n;
        System.out.println(solution(6));
    }


    public static String solution(int n) {
        String answer = "";
        int divN = (n / 2); //n하나에 두글자씩 출력하기위해 나누기 2를 함
        if (n % 2 == 0) { // 짝수일경우
            for (int i = 0; i < divN; i++) { //divN의 길이만큼 i를 반복
                answer += new String("수박"); // divN의 수만큼 "수박"을 answer에 추가
            }
        }
        else { //홀수일경우
            for (int i = 0; i < divN; i++) {
                answer += new String("수박");
            }
            return answer + "수"; //n값이 홀수일경우 for문을 탈출 후 "수" 하나를 추가
        }
        return answer;
    }
}



//////////// StringBulider를 사용한 문제풀이
//StringBuilder answer = new StringBuilder();
//    int divN = (n / 2);
//    String waterMelone = new String("수박").repeat(Math.max(0, divN));
//    if (n % 2 == 0) {
//                answer.append(waterMelone);
//                }
//                else {
//                answer.append(waterMelone);
//                return answer + "수";
//                }
//                return answer.toString();
