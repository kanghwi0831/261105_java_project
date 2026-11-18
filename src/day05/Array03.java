package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 배열생성
		int arr[] = new int[10];
		int sum = 0;
		int i = 1;

		// 5명의 점수를 입력받기 (0~100)
		while (i <= arr.length) {
			System.out.print(i + "번째 응시자 점수 입력 : ");
			arr[i-1] = scan.nextInt();

			// 입력값 범위 벗어나면 다시입력
			if (arr[i-1] < 0 || arr[i-1] > 100) {
				System.out.println("0~100점 중에 다시 입력해주세요.");
				continue;
			} else
				System.out.println(i + "번째 응시자 점수 : " + arr[i-1] + "점");
			sum += arr[i-1];
			
			i++;
		}
		// 합계와 평균을 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length + "명의 점수 합계 : " + sum + "점");
		System.out.println("평균 : " + ((double)sum / arr.length) + "점");

		scan.close();
		

	}

}
