package day06;

import java.util.Random;

public class Array06 {

	public static void main(String[] args) {
		// 10개의 숫자를 가지는 배열 생성
		// 0~100까지 랜덤수를 배열에 저장 => 출력
		// 합계, 평균, 최대, 최소값 출력
		Random ran = new Random();
		int sum = 0;
		int avg = 0;
		int max = 0; // 배열의 값 중 가장 큰 값을 찾기 위한 *초기값!*
		int min = 100; // 배열의 값 중 가장 작은 값을 찾기 위한 *초기값!*
		int arr[] = new int[10];

		for (int i = 0; i <= arr.length - 1; i++) {
			arr[i] = ran.nextInt(101);
			System.out.print(arr[i] + " ");
		}
//			max = Math.max(arr[i], max);
//			min = Math.min(arr[i], min);
		for (int tmp : arr) {
			sum += tmp;
			if (max < tmp) {
				max = tmp;
			}
			if (min > tmp) {
				min = tmp;
			}
		}

		avg = sum / arr.length;
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
