package programmers;

//핸드폰 번호 가리기
public class Q9 {
    public static void main(String[] args) {
        System.out.println(solution("01033344444"));
        String h1 = "HelloWorld";
    System.out.println(h1.substring(5)); //설정한 시작 위치부터 값을 리턴
        String h2 = "01022223333";
    System.out.println(h2.substring(3,7)); //끝 값은 -1 까지 리턴
    }

    public static String solution(String phone_number) {

        StringBuilder answer = new StringBuilder(phone_number);
        int blind = phone_number.length()-4; // 번호의 길이 //번호 뒤 4자리는 바꾸면 안돼기 때문에
        for(int i=0;i<blind;i++){
            answer.setCharAt(i,'*');// StringBuilder 의 내장함수 setCharAT(int index, char ch)룰 사용하여 주어진 인덱스에 있는
            //문자를 주어진 문자로 바꿔준다.
        }
        return answer.toString();//StringBuilder 는 문자열을 뽑아낼 때 .toString() 을 사용한다!
    }

    }

//<StringBuilder>
//StringBuilder 는 String 객체를 더할 떄 새로운 객체를 생성하는 것이 아니기 때문에
// 상대적으로 속도도 빠르고 메모리도 효율적으로 이용할 수 있다.
// StringBuilder 의 내장함수 setCharAT(int index, char ch)룰 사용하여 주어진 인덱스에 있는
//문자를 주어진 문자로 바꿔준다.
//StringBuilder 는 문자열을 뽑아낼 때 .toString() 을 사용한다!

//<String substring(int index)
//substring 함수는 두가지가 있으며, 그중 첫번째로 인자값을 하나만 받는 함수가 있다.
// 인자값은 int 형으로 substring 하고자 하는 문자열의 앞에서 부터 몇번째 위치인가를 지정하는 값이다.
//입력받은 인자값을 index로 해당 위치를 포함하여 이후의 모든 문자열을 리턴 시키는 함수이다.
//이때 index값은 0부터 시작한다!(length와 다름)
//ex) String hi = "HelloWorld"
//    System.out.println(hi.substring(4))
// 결과: World
//두번째는 시작과 끝을 지정하는 방법이다.
//ex) String hi = "01022223333"
//    System.out.println(hi.substring(3,7)) ////// 설정한 끝 값의 위치의 -1 까지의 값으로 리턴한다.
// 결과: 2222
