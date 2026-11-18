package day11;

import java.util.Scanner;

public class Method08 {

	// fact : 숫자를 입력받아 1~숫자까지 곱한 값을 리턴하는 메서드
	public int fact(int num) {
		int result;
		if (num == 0 || num == 1) {
			return 1;
		} else if (num < 0) {
			return 0;
		} else
			result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}

	// 재귀메서드로 변경
	public static int factorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else if (num < 0) {
			return 0;
		}

		// 재귀메서드 : 메서드 안에 자신의 메서드를 호출하는 메서드
		return num * factorial(num - 1); // 5 * 4 * 3 * 2 * 1
	}

	public static void main(String[] args) {
		// 재귀메서드 : 메서드 안에 자신의 메서드를 호출하는 메서드
		// ! : 팩토리얼
		// 1부터 자신의 수까지 곱한 값을 리턴
		// 0! => 1
		// 1! => 1
		// 2! => 1*2
		// 3! => 1*2*3
		// 4! => 1*2*3*4
		// 5! => 1*2*3*4*5
		Method08 m = new Method08();
//		Scanner scan = new Scanner(System.in);
//		System.out.print("factorial : ");
//		int num = scan.nextInt();
//		System.out.println(num + "!" + " = " + m.fact(num));
//		while (num != 0) {
//			System.out.print("factorial : ");
//			num = scan.nextInt();
//			System.out.println(num + "!" + " = " + m.fact(num));
		System.out.println(m.fact(5));
		System.out.println(m.factorial(5));

		}
//		scan.close();
	}

