package day08;

import java.util.Arrays;
import java.util.Scanner;

import day07.Exam01;

public class Method05 {

	// 메서드는 메서드 이름이 같아도 된다 (메서드 오버로딩)
	// 오버로딩 조건 : 매개변수가 달라야 한다. (같은 이름이여도 매개변수가 달라서 여러 메서드가 존재한다)
	
	Scanner scan = new Scanner(System.in);

	// 원하는 배열 수, 배열값 입력해보기
	public int[] scan() {
		System.out.print("원하는 배열 갯수 : ");
		int input = scan.nextInt();
		int[] arr = new int[input];
		System.out.println("배열 갯수 : " + input + "개");
		for (int i = 0; i < arr.length; i++) {
//			System.out.print((i+1) + "번 배열의 수 : ");
//			int num = scan.nextInt();
//			arr[i] = num;
			// 랜덤으로도 해보자 (0~100 사이 숫자로)
			arr[i] = (int) (Math.random() * 101);
		}
		scan.close();
		return arr;
	}

	// 메서드 생성
	// 2. 배열을 받아서 오름차순 정렬하는 메서드 (제작해야함)
	public int[] asc(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					int save = arr[j];
					arr[j] = arr[i];
					arr[i] = save;
				}
			}
		}
		return arr;
	}

	// 3. 배열을 받아서 합계, 평균, 최대, 최소를 출력하는 메서드
	// 평균 메서드
	public double avg(int arr[]) {
		if (arr == null) {
			return -999999;
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = sum / (double) arr.length;
		return avg;
	}

	// - 최대, 최소 메서드 따로
	// 최대값 메서드
	public int max(int arr[]) {
		if (arr == null) { // 에러 대비하는건 많을수록 좋다
			return -999999;
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	// 최소값 메서드
	public int min(int arr[]) {
		if (arr == null) {
			return -999999;
		}
		int min = 100;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {

		// 1. 배열을 받아서 출력하는 메서드 (다른 메서드 호출 가능)
		Method04 m4 = new Method04();

		// - 합계와 평균은 다른 메서드를 호출 Exam01
		Exam01 e1 = new Exam01();

		// 지금 만든 메서드 호출
		Method05 m5 = new Method05();

//		int arr[] = { 60, 20, 80, 100, 30, 70, 90, 40, 50, 10 };
		int arr[] = m5.scan();
		System.out.print("기존 배열 출력 : ");
		m4.print(arr);

		// 오름차순 정렬 출력
		System.out.print("오름차순 배열 출력 : ");
		m5.asc(arr);
		m4.print(m5.asc(arr));

		// 합계 평균 최대 최소 출력
		int sum = e1.sum(arr);
		double avg = m5.avg(arr);
		int max = m5.max(arr);
		int min = m5.min(arr);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		if (max == -999999) {
			System.out.println("배열 오류!!");
		}
		System.out.println("최대값 : " + max);
		if (min == -999999) {
			System.out.println("배열 오류!!");
		}
		System.out.println("최소값 : " + min);
	}
}
