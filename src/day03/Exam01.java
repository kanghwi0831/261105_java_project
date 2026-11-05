package day03;

import java.util.*;

public class Exam01 {

	public static void main(String[] args) {
		// up/down game
		// 1~50까지 중 랜덤 수 하나를 컴퓨터가 생성 => 유저는 모름
		// 유저가 그 랜덤수를 맞추는 게임
		// 출력예시)
		// "컴퓨터가 랜덤 수를 생성했습니다." (ex : 38)
		// 입력 : 30 => "UP"
		// 입력 : 40 => "DOWN"
		// 입력 : 38 => "정답!!" => 종료시키기
		// 몇 회만에 맞췄는지도 출력시키기

		Scanner scan = new Scanner(System.in);
		

		Random ran = new Random();

		int user = 0;
		
		int sc;

		int count = 0;

		int RN = ran.nextInt(50) + 1;

		
		//System.out.println(RN);
		System.out.println("컴퓨터가 랜덤 수를 생성했습니다");
		System.out.print("입력 : ");
		sc = scan.nextInt();
		count++;
		
		while(sc != RN) {
		if (sc < RN) {
			System.out.println("UP");
			System.out.print("입력 : ");
			sc = scan.nextInt();
			count++;
		}
		if (sc > RN) {
			System.out.println("DOWN");
			System.out.print("입력 : ");
			sc = scan.nextInt();
			count++;
		}
		if (sc == RN) {
			System.out.println("정답!!");
			scan.close();
			System.out.println("입력하신 횟수 : " + count);
		} 
		
		
		}
		
	}
}
