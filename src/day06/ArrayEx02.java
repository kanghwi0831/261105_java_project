package day06;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 정수배열[10] => 0~100까지 랜덤으로 채움 => 출력
		// 오름차순으로 정렬 => 출력

		Random ran = new Random();
		int arr[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(101);

		}
		System.out.println(Arrays.toString(arr));

//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		// Collections.reversOrder() => Object (이건 모르겠다..)
		
	}

}
