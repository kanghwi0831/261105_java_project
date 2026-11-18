package day05;

import java.util.*;

public class Exam03 {

	public static void main(String[] args) {
		// 가위 바위 보
		// 컴퓨터와 유저가 가위바위보 게임을 진행
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		// 가위 = 0, 바위 = 1, 보 = 2
		int S = 0;
		int R = 1;
		int P = 2;
		int Win = 0;
		int Lose = 0;
		int Draw = 0;

		int i = 0;
		while (i != 10000) {
//			for(int i = 0; i <= 100; i++) {
			// 컴퓨터는 랜덤으로 지정 0, 1, 2 중 선택
			int com = ran.nextInt(3);
			// System.out.println(com);
			// 유저도 input 0 1 2 중 선택
			System.out.println("| 0.가위 | 1.바위 | 2.보 | 3.종료 |");
//			System.out.print("입력 : ");
//			int input = scan.nextInt();
			int input = ran.nextInt(3);			

			// 3 누르고 종료
//			if (i == 100) {
//				break;
//			}
			// ex) com = 0 / me = 0
			// com(가위) / me(가위) => 무승부
			if (com == input) {
				System.out.println("무승부");
				Draw++;
				i++;
				continue;
			}
			// com = 0 / me = 1
			// com(가위) / me(바위) => 승리
			else if ((com == S && input == R) || (com == R && input == P) || (com == P && input == S)) {
				System.out.println("승리!");
				Win++;
				i++;
				continue;
			} else if ((input == S && com == R) || (input == R && com == P) || (input == P && com == S)) {
				System.out.println("패배..");
				Lose++;
				i++;
				continue;
				// 유저의 입력값 중 0, 1, 2 외의 다른 값이 입력되면 "입력오류", "다시 입력하세요"
			} else {
				System.out.println("입력오류!");
				System.out.println("다시 입력하세요.");
				continue;
			}
			}
		scan.close();
		System.out.println("가위바위보를 종료합니다.");
		System.out.println("승리 : " + Win + "회");
		System.out.println("패배 : " + Lose + "회");
		System.out.println("무승부 : " + Draw + "회");
		System.out.println("승률 : " + i/(float)Win*10 + "%");
		System.out.printf("%.1f", i/(float)Win*10);
		}
		}
	