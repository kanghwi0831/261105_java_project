package day04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// 각 메뉴마다 카운팅하는 변수 만들기

		int bCount = 0;
		int nCount = 0;
		int cCount = 0;
		int jCount = 0;
		while (true) {
			int bSum = bCount * 2000;
			int nSum = nCount * 3000;
			int cSum = cCount * 500;
			int jSum = jCount * 500;
			int total = bSum + nSum + cSum + jSum;
			// --menu--
			System.out.println("---menu---");
			// 1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5.종료
			System.out.println("1.과자(2000원) | 2.라면(3000원) | 3.사탕(500원) | 4.젤리(500원) | 5.종료");
			System.out.print("입력 : ");
			int pick = scan.nextInt();
			// 종료를 누를때까지 반복
			// menu > 5(종료)
			// 과자 n개 n원
			// 라면 n개 n원
			// ------------
			// 총금액 n원.
			if (pick == 5) {
				System.out.println("과자 " + bCount + "개를 선택했습니다. " + bSum + "원");
				System.out.println("라면 " + nCount + "개를 선택했습니다. " + nSum + "원");
				System.out.println("사탕 " + cCount + "개를 선택했습니다. " + cSum + "원");
				System.out.println("젤리 " + jCount + "개를 선택했습니다. " + jSum + "원");
				System.out.println("---------------------------");
				System.out.println("총금액 : " + total + "원");
				break;
			}
			// 1~5를 벗어난 메뉴는 "다시 입력하세요"
			if (pick < 1 || pick > 5) {
				System.out.println("1~5 중에 다시 입력하세요.");
				continue;
			}
			// menu > 1
			// 과자 1개를 선택했습니다. 2000원
			// menu > 2
			// 라면 1개를 선택했습니다. 3000원
			switch (pick) {
			case 1:
				System.out.println("과자 1개를 선택했습니다. 2000원");
				bCount++;
				continue;
			case 2:
				System.out.println("라면 1개를 선택했습니다. 3000원");
				nCount++;
				continue;
			case 3:
				System.out.println("사탕 1개를 선택했습니다. 500원");
				cCount++;
				continue;
			case 4:
				System.out.println("젤리 1개를 선택했습니다. 500원");
				jCount++;
				continue;
			}
			scan.close();
		}
	}

}
