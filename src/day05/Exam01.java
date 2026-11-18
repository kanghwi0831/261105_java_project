package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 각 메뉴마다 카운팅하는 변수 만들기
		Scanner scan = new Scanner(System.in);
		// 1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5.종료
		String menu[] = { "과자", "라면", "사탕", "젤리", "종료" };
		int price[] = { 2000, 3000, 500, 500 };
		int count[] = new int[menu.length];

		// menu
		while (true) {
			System.out.println("---------------------------------MENU--------------------------------");
			System.out.println("| 1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5.종료 |");
			System.out.print("입력 : ");
			int pick = scan.nextInt();
// 1~5를 벗어난 메뉴는 "다시 입력하세요"
			if (pick < 1 || pick > 5) {
				System.out.println("1~5번 중에 다시 입력해주세요");
				continue;
			}

			switch (pick) {
			// menu > 1
			// 과자 1개를 선택했습니다. 2000원
			case 1:
				count[0]++;
				System.out.println(menu[0] + "를 선택하였습니다.(" + price[0] + "원)");
				continue;
			case 2:
				count[1]++;
				System.out.println(menu[1] + "를 선택하였습니다.(" + price[1] + "원)");
				continue;
			case 3:
				count[2]++;
				System.out.println(menu[2] + "를 선택하였습니다.(" + price[2] + "원)");
				continue;
			case 4:
				count[3]++;
				System.out.println(menu[3] + "를 선택하였습니다.(" + price[3] + "원)");
				continue;
			}
			// menu > 5(종료)
			// 종료를 누를때까지 반복
			if (pick == 5) {
				break;
			}
		}
		// 과자 n개 n원
		// 라면 n개 n원
		// ------------
		// 총금액 n원.
		int total = 0;
		for (int i = 0; i < menu.length-1; i++) {
			
			if(count[i] != 0) {
				
		System.out.println(menu[i] + " : " + count[i] + "개 " + price[i]*count[i] + "원");
		total += price[i]*count[i];
		}
		}
		System.out.println("-----------------------------");
		System.out.println("총 금액 : " + total + "원");
		scan.close();
//		int a = count[0] * price[0];
//		int b = count[1] * price[1];
//		int c = count[2] * price[2];
//		int d = count[3] * price[3];
//		System.out.println(menu[1] + " : " + count[1] + "개 " + b + "원");
//		System.out.println(menu[2] + " : " + count[2] + "개 " + c + "원");
//		System.out.println(menu[3] + " : " + count[3] + "개 " + d + "원");

	}
}
