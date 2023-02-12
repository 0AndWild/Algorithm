package data_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 배열의 필요성
 * <br>
 * - 같은 종류의 데이터를 효율적으로 관리하기 위해 사용
 * - 같은 종류의 데이터를 순차적으로 저장
 * <br>
 * 장점
 * - 빠른 접근 가능 (인덱스 번호로 접근)
 * <br>
 * 단점
 * - 데이터 추가/삭제가 어려움(배열 선언 시 미리 최대 길이를 선언해야함)
 */

public class Array {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(array()));
		System.out.println(Arrays.toString(array1()));
	}

	/**
	 * 배열을 미리 선언하고 데이터 삽입
	 */
	public static Integer[] array() {
		Integer[] array = new Integer[10];
		array[0] = 1;
		return array;
	}

	/**
	 *	배열 선언시 데이터 삽입
	 *	return new Integer[] {1, 2, 3, 4, 5}
	 */
	public static Integer[] array1() {
		Integer[] array = {1,2,3,4,5};
		return array;
	}

	/**
	 * 자바에서는 배열을 손쉽게 다루기 위해 ArrayList 가 구현되어져 있음
	 * <br><br>
	 * 그럼 List 와 ArrayList 의 차이는 무엇인가?
	 * <br><br>
	 * List 는 인터페이스이고  ArrayList 는 클래스 이다.
	 * <br>
	 * - 클래스는 크게 일반 클래스와 클래스 내에 '추상 메서드'가 하나 이상 있거나, abstract 로 정의된
	 * 추상클래스로 나뉜다.
	 * <br>
	 * - 인터페이스는 모든 메서드가 추상 메서드인 경우를 말하며, 인터페이스 를 상송받는 클래스는 인터페이스에서
	 * 정의된 추상메서드를 모두 구현해야 한다 (따라서 다양한 클래스를 상속받는 특정 인터페이스는 결국 동일한 메서드를 제공한다.)
	 * <br>
	 *
	 */
	public void arrayList() {
		/*- ArrayList 가 아니라 List 로 선언된 변수는 다음과 같이 필요에 따라 다른 리스트 클래스를 쓸 수 있는
		구현상의 유연함을 제공함.*/
		List<Integer> lsit = new ArrayList<>();
		List<Integer> list2 = new LinkedList<>();
		//ArrayList 로 선언된 변수는 ArrayList 만 구현 가능
		ArrayList<Integer> list3 = new ArrayList<>();
		// ArrayList<Integer> list4 = new LinkedList<>();
	}
}
