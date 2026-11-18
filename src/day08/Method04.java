package day08;

import java.util.Arrays;
import java.util.Random;

public class Method04 {
	
	// 멤버변수
	Random ran = new Random();
	
	// 메서드 활용
	// 1. 랜덤수(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
	// 매개변수 : 없음
	// 메서드명 : randomInt
	// 리턴타입 : 정수배열 => int[]
	public int[] randomInt() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
//		arr[i] = (int)(Math.random()*101);
		arr[i] = ran.nextInt(101);
		}
		return arr;
	}

	// 2. 정수 배열을 받아 평균값을 리턴하는 메서드
	// - 단 정수 배열이 없거나, 갯수가 0이면 처리불가 (메인에서 => "평균을 처리할 수 없습니다.")
	// 매개변수 : 정수배열 => int[] arr
	// 메서드명 : avg
	// 리턴타입 : 평균값(double)
	public double avg(int arr[]) {
		if(arr == null || arr.length <=0) {
			return -999999;
		}
		int total = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		avg = total / (double)arr.length;
		return avg;
	}

	// 3. 정수 배열을 받아서 출력하는 메서드
	// ex) 24 52 15 56 72 (한칸씩 띄워서 옆으로 출력)
	// 매개변수 : int arr[]
	// 메서드명 : print
	// 리턴타입 : 출력(void)
	public void print(int arr[]) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();   // 줄바꿈
	}

	// 배열 생성 => 배열 출력 => 평균 출력

	public static void main(String[] args) {

		Method04 method = new Method04();
		int arr[] = method.randomInt();
		method.print(arr);
		double avg = method.avg(arr);
		if (avg == -999999) {
			System.out.println("평균을 구할 수 없습니다.");
		} else
			System.out.println("평균 : " + avg);
	}
}
