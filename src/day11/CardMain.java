package day11;

import java.util.Arrays;

public class CardMain {

	public static void main(String[] args) {
		// 모양 : ♠, ◆, ♥, ♣
		// 범위에 없는 모양이면 하트로 변경 => !2 => '♥'2
		// 멤버변수 : 52장의 Card 객체를 담을 수 있는 배열 + 번지
		CardPack[] cardPackArr = new CardPack[52]; // 초기값 null
		// - 생성자 : pack의 초기값을 52장의 카드로 초기화
		CardPack cardPack = new CardPack();
		// - 메서드
		// 1. 카드를 섞는 기능
		// 2. 플레이어에게 한장씩 나눠주는 기능
		// 3. 카드 초기화 기능 (나눠준 카드 회수)
		String shape[] = { "♠", "◆", "♥", "♣" };
		int t = 0;

		for (int i = 0; i < shape.length; i++) {
			for (int j = 1; j <= 13; j++) {
				cardPack.setShape(shape[i]);
				cardPack.setNum(j);
				// 카드 팩 객체 생성
				cardPackArr[t] = new CardPack(cardPack.getShape(), cardPack.getNum());
				t++;
			}
		}

		System.out.println("딜러가 카드를 섞고 있습니다.");
		// 카드 섞기 메서드
		CardPack[] player1 = new CardPack[7];
		CardPack[] player2 = new CardPack[7];
		CardPack[] player3 = new CardPack[7];
		CardPack[] player4 = new CardPack[7];
		// player 4명
		System.out.println("딜러가 카드를 나누고 있습니다.");
		System.out.println("player1 카드 pick");
		// 메서드 호출
		cardPack.randomCard(cardPackArr, player1);
		System.out.println("player2 카드 pick");
		// 메서드 호출
		cardPack.randomCard(cardPackArr, player2);
		System.out.println("player3 카드 pick");
		// 메서드 호출
		cardPack.randomCard(cardPackArr, player3);
		System.out.println("player4 카드 pick");
		// 메서드 호출
		cardPack.randomCard(cardPackArr, player4);

		System.out.print("player1 Card open : ");
		// 카드 출력
		cardPack.playerCardOpen(player1);
		System.out.println();
		System.out.print("player2 Card open : ");
		// 카드 출력
		cardPack.playerCardOpen(player2);
		System.out.println();
		System.out.print("player3 Card open : ");
		// 카드 출력
		cardPack.playerCardOpen(player3);
		System.out.println();
		System.out.print("player4 Card open : ");
		// 카드 출력
		cardPack.playerCardOpen(player4);
		System.out.println();

		// 카드회수
		cardPack.cardCollect(player1, cardPackArr);
		cardPack.cardCollect(player2, cardPackArr);
		cardPack.cardCollect(player3, cardPackArr);
		cardPack.cardCollect(player4, cardPackArr);

		System.out.println("----------------------카드 회수----------------------");
		// 정상회수 확인
		System.out.println(Arrays.toString(player1));
		System.out.println(Arrays.toString(player2));
		System.out.println(Arrays.toString(player3));
		System.out.println(Arrays.toString(player4));
		
		cardPack.playerCardOpen(cardPackArr);
	}
}
