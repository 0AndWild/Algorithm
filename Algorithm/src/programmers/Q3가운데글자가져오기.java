package programmers;

//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
//
//재한사항
//s는 길이가 1 이상, 100이하인 스트링입니다.
public class Q3가운데글자가져오기 {
    public static void main(String[] args) {
        String s = "abcdef";
        int idx = s.length()/2;
        int value = s.length()%2;
        if (value ==1){          //홀수일경우
                System.out.println(s.charAt(idx));
        }else{                          //짝수일경우
                System.out.print(s.charAt(idx-1));
                System.out.println(s.charAt(idx));

            }
    }
}
