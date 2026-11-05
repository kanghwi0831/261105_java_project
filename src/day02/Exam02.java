package day02;

import java.util.Random;
import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 정수 2개를 받고 연산자 1개를 입력하겠다 (정수 2개 랜덤해도 상관없음)
		// 두 정수의 연산 결과를 출력한다
		// 예시) 2, 3 을 받고 연산자는 +를 입력해 연산시키기
		// 입력 가능한 연산자는 + - * / % 이외의 문자를 입력하면 "잘못된 문자를 입력했습니다"
		// 연산자 입력은 String, char 가능

		String a = "+";
		// 랜덤 만들기
		Random ran = new Random();
		// 랜덤 인트 지정하기
		int b = (ran.nextInt(10)) + 1;
		int c = (ran.nextInt(10)) + 1;
		int p = b + c;
		int m = b - c;
		int t = b * c;
		double w = (double) b / c;
		double g = (double) b % c;

		System.out.print("랜덤 숫자 : ");
		System.out.print(b + ", ");
		System.out.println(c);

		// 연산자 직접 입력할 스캐너 만들기
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 연산자를 입력하세요.");

		String n = sc.next();
		
		sc.close();

		switch (n) {
		case "+":
			System.out.println(b + " + " + c + " = " + p);
			break;
		case "-":
			System.out.println(b + " - " + c + " = " + m);
			break;
		case "*":
			System.out.println(b + " x " + c + " = " + t);
			break;
		case "/":
			System.out.println(b + " / " + c + " = " + w);
			break;
		case "%":
			System.out.println(b + " / " + c + " = " + w + " 나머지는 " + g);
			break;
		default:
			System.out.println("연산자 입력이 잘못되었습니다");
			System.out.print("+, -, *, /, % 중 하나를 입력해주세요.");
		}
	}
}
