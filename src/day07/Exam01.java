package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public int sum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	public double avg(int total, int div) {
		if (div <= 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
			return -9999999;
		}
		return total / div;
	}

	// 문자 배열을 입력받아서 숫자배열로 리턴하는 메서드
	public int[] changeArr(String[] a) {
		int b[] = new int[a.length];
		if (a == null || a[0] == null) {
//		System.out.println("배열을 처리할 수 없습니다.");
		return b;
		}
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		}
		return b;
	}

	// 문자 배열, 숫자 배열을 입력받아서 문자배열의 값을 숫자배열로 채우는 메서드
	public void changeArr2(String[] a, int[] b) {
		if (a == null || a[0] == null || b == null ||
				a.length <= 0 || b.length <= 0) {
//			System.out.println("배열을 처리할 수 없습니다.");
			return;
		}
		// 문자 배열(a)보다 숫자 배열의 길이가 작을 때
		if (a.length != b.length) {
//			System.out.println("배열을 처리할 수 없습니다.");
		return;
		}
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(a[i]);
		
		}
	}

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
		// 12345 => 1+2+3+4+5 => 합계 / 평균 출력
		// String 으로 입력받아 한자리 수로 분해 (배열)
		// 반복 (0 또는 음수를 입력하면 종료)

		// ex) 숫자를 입력하세요(0또는 음수는 종료) >
		Exam01 method = new Exam01();
		Scanner scan = new Scanner(System.in);

		int[] inputInt = new int[5];
		String[] input = new String[5];

		while (true) {
			System.out.println("0 or 음수를 입력하면 종료됩니다.");
			System.out.print("숫자를 입력하세요 : ");
//		String number = scan.next();
//		String[] str = number.split("");
//		int[] num = new int[str.length];
			for (int i = 0; i < input.length; i++) {
				input[i] = scan.next();
				inputInt[i] = Integer.parseInt(input[i]);

				if (inputInt[i] <= 0) {
					System.out.println("프로그램을 종료합니다.");
					scan.close();
					return;
				}
			}
			int total = 0;
			for (int i = 0; i < inputInt.length; i++) {
				total += inputInt[i];
			}
			for (int i = 0; i < inputInt.length; i++) {
				if (i == input.length - 1) {
					System.out.println(input[i]);
				} else
					System.out.print(input[i] + " + ");
			}

			double avg = method.avg(total, inputInt.length);

			System.out.println("합계 : " + total);
			System.out.println("평균 : " + avg);
		}
	}
}