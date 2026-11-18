package day04;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// Array : 배열
		// 같은 타입, 같은 의미를 가지는 변수의 집합

		// 기본 8개 자료형(기본형 변수) 빼고는 전부 class 자료형(참조형 변수) (String도 클래스자료형)
		// - new 키워드로 생성
		// - 배열 선언 방법
		// 타입 배열명[]; // 아직 배열객체를 생성하지 않은 상태
		// 타입[] 배열명; // 기본값은 null

		// 타입[] 배열명 = new 타입[길이]; 몇칸짜리를 만들고 싶은지.
		// 생성된 배열 안의 변수값은 자동으로 초기화가 이루어짐
		// 숫자타입 = 0 / 문자타입 = null 로 이루어짐

		// int[] arr = new int[5]; : 숫자 자료형 5칸을 만들겠다
		// int[] arr = new int[]{1,2,3,4,5};
		// int[] arr = {1,2,3,4,5} // 이렇게도 가능하지만 보통 test 할때 많이 쓰인다

		// 배열의 길이는 0 이상이여야 한다. ( - 같은 특수기호는 안된다)
		// 배열의 index 0부터 시작
		// 배열[5] => 0 1 2 3 4 => 마지막 번지는 [개수-1]이다 ('0'부터 1번지니까)
		// 배열의 총길이 => length (배열이 몇칸짜린지 알려줌) => 마지막 번지는 [length - 1] 이겠죠

		int[] arr; // null (선언만 해서 객체는 없다)
		arr = new int[5]; // 선언한 변수에 객체 연결

		int[] arr1 = new int[5]; // 만든 5개 배열값은 0으로 시작
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		int[] arr3 = { 10, 20, 30, 40, 50 };

		// 배열명[번지] 번지수를 적어야 번지 안에 있는 값을 보여준다
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);
		// System.out.println(arr2[5]); // 6번째 번지는 없다
		System.out.println("----------------");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}

		System.out.println();
		System.out.println("arr2.length : " + arr2.length);

		// --------------------
		// 변수명 = 값 arr[0] = 100
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		// 배열에 값을 넣었지만 for문이 덮어써서 for문 조건대로 값이 정해졌다
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 100;
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("----------------------");
		
		//------------------------------
		// arr4 [10] 칸을 가지는 int 배열 생성
		// 1~10까지 반복적으로 저장 => 출력
		int[] arr4 = new int[10];
		for (int i = 0; i <arr4.length; i++) {
			arr4[i] = i+1;
			System.out.print(arr4[i] + " ");
		}
		System.out.println();
		
		// Array.toString(배열)
		System.out.println(Arrays.toString(arr4));
		
		
	}

}
