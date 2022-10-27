package programmers;//<부족한 금액 계산하기>
//새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 이 놀이기구의 원래 이용료는 price원 인데,
//놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다.
//놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서
//얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요.
//단, 금액이 부족하지 않으면 0을 return 하세요.

public class Q12Price {
    public static void main(String[] args) {
        System.out.println(solution(3, 33, 4));
    }

    public static long solution(int price, int money, int count) {
        long total = 0; //총 이용료 n배 값
//        if (money != 0) { // 현재 돈이 0이 아닐 때
            for (int i = 1; i <= count; i++) {  //i는 1로 정의 된 후 밑으로
                total += (long) price * i;// 놀이기구 pirce를 i만큼 * 해서 count 횟수에 도달 할때까지 total에 더해줌
            }
            if(money>total){
            return 0;
            }
//        }
            return Math.abs(total) - money; // Math.abs 를 이용하여 돈이 모자라도 절대값으로 변화
        }
    }


