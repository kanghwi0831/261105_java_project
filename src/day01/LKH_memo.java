package day01;

import java.util.*;

public class LKH_memo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 띄어쓰기하여 입력 : ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();

		System.out.println(n1);
		System.out.println(n2);

		// 연산자 String
		String op = scan.next(); // "+"

		// char 형태
		// char opchar = scan.next().charAt(0); // '+'
		// switch (opchar) {
		// case '+': char를 사용함으로써 작은 따옴표로 가능
		// if ( opchar == '+' ) 스트링이 아니므로 이퀄스를 안 쓰고 같냐는 문제도 가능
		
		// * 스트링을 볼 땐 == 을 못 쓰고 이퀄스를 사용하자 *

		switch (op) {
		case "+":
			System.out.println(n1 + op + n2 + "=" + (n1 + n2));
			break;
		case "-":
			System.out.println(n1 + op + n2 + "=" + (n1 - n2));
			break;
		case "*":
			System.out.println(n1 + op + n2 + "=" + (n1 * n2));
			break;
		case "/":
			if (n2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				System.out.println(n1 + op + n2 + "=" + (n1 / n2));
			}
			break;
		case "%":
			System.out.println(n1 + op + n2 + "=" + (n1 % n2));
			break;
		default:
			System.out.println("잘못된 연산자입니다");
			scan.close();
		}
		int result = 0;
		switch (op) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
			default: System.out.println("잘못된 연산자");
				

		}
		if(op.equals("+") || op.equals("-")) {
		System.out.println(n1 + op + n2 + "="+result);
		}
	}

}
