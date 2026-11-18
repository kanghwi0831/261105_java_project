package day07;

import java.util.Scanner;

public class Method02 {
	// 메서드 => 기능을 정의하는 역할 (함수)
	// 접근제어자 리턴타입 메서드명(매개변수) {
	// 구현;
	// (return) 리턴있으면 쓰기
	// }
	// 리턴타입 : 기능을 구현 후 결과로 반환하는 값의 타입
	// 매개변수 : 기능을 구현하기 위해 외부에서 받아와야 하는 값
	// 메서드명 : 의미있게 소문자로 작성

	// 메서드 생성 영역
	// + - * / % 연산을 수행 / % 는 뒷 수가 0이면 "0으로 출력불가"
	// 두 정수를 주고(매개변수) 각 연산의 결과를 리턴하는 메서드
	public int sum(int a, int b) {
		return a + b;
	}
	public int sub(int a, int b) {
		return a - b;
	}
	public int mul(int a, int b) {
		return a * b;
	}
	public double div(int a, int b) {
		if (b == 0) {
		return b = -999999;
		} else
		return a / b;
	}
	public double rem(int a, int b) {
		if (b == 0) {
			return b = -999999;
		} else
		return a % b;
	}
	public static void main(String[] args) {

		// 메서드 호출 영역
		Method02 method = new Method02();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("연산할 두 수를 입력하세요 : ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();

			int sum = method.sum(num1, num2);
			int sub = method.sub(num1, num2);
			int mul = method.mul(num1, num2);
			double div = method.div(num1, num2);
			double rem = method.rem(num1, num2);

			System.out.println("|1.sum |2.sub |3.mul |4.div |5.rem |");
			System.out.println("다른 숫자를 누르면 종료합니다.");
			System.out.print("연산할 방식을 입력하세요 : ");
			int input = scan.nextInt();

			switch (input) {
			case 1:
				System.out.println(num1 + " + " + num2 + " = " + sum);
				continue;
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + sub);
				continue;
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + mul);
				continue;
			case 4:
				if (div == -999999) {
					System.out.println("!! " + num1 + "을 " + num2 + "로 나눌 수 없습니다. !!");
					continue;
				} else
					System.out.println(num1 + " / " + num2 + " = " + div);
				continue;
			case 5:
				if (rem == -999999) {
					System.out.println("!! " + num1 + "을 " + num2 + "로 나눌 수 없습니다. !!");
					continue;
				} else
					System.out.println(num1 + " % " + num2 + " = " + rem);
				continue;
			default:
				System.out.println("프로그램을 종료합니다");
				scan.close();
				return;
			}
		}
	}
}
