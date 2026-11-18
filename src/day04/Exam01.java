package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		while (true) {
			// menu 먼저 선택 ex) 1.
			// ---menu---
			// 1. + | 2. - | 3. * | 4. / | 5. % | 6. exit
			System.out.println("-----------------MENU------------------");
			System.out.println("|1. + |2. - |3. * |4. / |5. % |6. exit|");
			System.out.print("입력 : ");
//			String str = scan.nextLine();
			int str = scan.nextInt();
			if (str <= 0 || str >= 7) {
				System.out.println("존재하지 않는 항목입니다.");
				System.out.println("연산자를 다시 입력해주세요.");
				continue;
			}
			
			// 사용자가 종료를 누를 때까지 반복
//			if ("exit".equals(str)) {
//				System.out.println("시스템을 종료합니다.");
//				break;
//			}
			if (6 == str) {
				System.out.println("시스템을 종료합니다.");
				break;
			}

			// 두 수를 입력 ex) 2, 3
			System.out.print("첫번째 숫자 입력 : ");
			double num1 = scan.nextDouble();
			System.out.print("두번째 숫자 입력 : ");
			double num2 = scan.nextDouble();

			// 두번째 숫자 값이 0인경우 '/' '%' 연산은"0으로 나눌 수 없습니다."
//			if (("/".equals(str) || "%".equals(str)) && (num2 == 0)) {
				while ((4 == str || 5 == str) && (num2 == 0)) {
				System.out.println("'/' 혹은 '%' 연산은 0으로 나눌 수 없습니다.");
				System.out.print("다시 입력해주세요 : ");
				num2 = scan.nextDouble();
			//	continue;
			}

			// 결과 출력 ex) 2 + 3 = 5
			switch (str) {
//			case "+":
			case 1:
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				continue;
//			case "-":
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				continue;
//			case "*":
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				continue;
//			case "/":
			case 4:
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				continue;
//			case "%":
			case 5:
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				continue;
			default:
				System.out.println("연산자 입력이 잘못되었습니다.");
				System.out.println("다시 입력해주세요.");
				continue;

			}

		}
		scan.close();
	}

}
