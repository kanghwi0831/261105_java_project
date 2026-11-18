package day11;

import java.util.Random;

public class CardPack {
	// 모양 : ♠, ◆, ♥, ♣
	// 52장의 Card 객체를 배열로 저장하는 pack

	// 멤버변수 : 52장의 Card 객체를 담을 수 있는 배열 + 번지
	// private Card[] pack = new Card[52]; // 초기값 null
	// - 생성자 : pack의 초기값을 52장의 카드로 초기화
	// - 메서드
	// 1. 카드를 섞는 기능
	// 2. 플레이어에게 한장씩 나눠주는 기능
	// 3. 카드 초기화 기능 (나눠준 카드 회수)
	Random ran = new Random();
	private String shape;
	private int num;

	public CardPack() {
	}
	
	public void randomCard(CardPack[] card, CardPack[] user) {
		for (int i = 0; i < user.length; i++) {
			int ranNum = ran.nextInt(52);
			if (card[ranNum] == null) {
				i--;
				continue;
			} else
			user[i] = card[ranNum];
			card[ranNum] = null;
		}
	}
	public void cardCollect(CardPack[] user, CardPack[] card) {
		for (int i = 0; i < user.length; i++) {
			for(int j = 0; j < card.length; j++) {
				if (card[j] != null) {
					continue;
				} else
				card[j] = user[i];
				user[i] = null;				
			}
		}
	}
	public void playerCardOpen(CardPack[] user) {
		for(int i = 0; i < user.length; i++) {
			user[i].printCard();
			}
	}

	public void printCard() {
		System.out.print(shape);
		switch (num) {
		case 1:
			System.out.print("A ");
			break;
		case 11:
			System.out.print("J ");
			break;
		case 12:
			System.out.print("Q ");
			break;
		case 13:
			System.out.print("K ");
			break;
		default:
			System.out.print(num + " ");
		}
	}

	public void setNum(int num) {
		// 범위 설정
		if (num < 1 || num > 13) {
			this.num = 1;
			return;
		}
		this.num = num;
	}

	public void setShape(String shape) {
		// 모양 범위 설정 ♠, ◆, ♥, ♣
		if ("♠".equals(shape) || "◆".equals(shape) || "♥".equals(shape) || "♣".equals(shape)) {
			this.shape = shape;
		} else
			this.shape = "♥";
	}

	@Override
	public String toString() {
		return "CardPack [shape=" + shape + ", num=" + num + "]";
	}

	public CardPack(String shape, int num) {
		super();
		this.shape = shape;
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public int getNum() {
		return num;
	}

}
