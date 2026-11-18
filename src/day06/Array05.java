package day06;

import java.util.Arrays;
import java.util.Random;

public class Array05 {

	public static void main(String[] args) {
		// 숫자 5개를 입력할 수 있는 배열을 생성
		// 랜덤으로 0~100까지의 숫자를 입력
		// 합계를 출력
		Random ran = new Random();
		int arr[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i <= arr.length-1; i++) {
		arr[i] = ran.nextInt(101);
//		System.out.print(arr[i] + " ");
		sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("합계 : " + sum);
		System.out.println("-----------------------");
		
		// 향상된 for문
		// for(출력할 리스트의 자료형 임의 변수값 : 리스트) {  }
		// 원본의 리스트를 하나씩 순차적으로 임의 변수값에 저장 => 처리문 실행
		// 그래서 원본 자체를 변경할 수는 없다
		
		for(int tmp : arr) {
			if (tmp < 60) {
				System.out.print("불합격 ");
			} else if (tmp >= 60) {
				System.out.print("합격 ");
			}
		}

	}

}
