package day11;

public class Card {
	// 숫자 (1~13) 1 = A, 11(J), 12(Q), 13(K)
	// 모양 : ♠, ◆, ♥, ♣
	// ex) ♥A(1), ♥5 ♣J(11)
	// 범위에 없는 모양이면 하트로 변경 => !2 => '♥'2 // 새로운 메서드 없이 만들기 숫자가 없으면 1 모양이 없으면 하트
	// 범위에 없는 숫자면 1로 변경 => '1' => A

	// 멤버변수 : 숫자(int num), 모양(String shape)
	private int num;
	private String shape;

	public Card() {
		this.num = 1;
		this.shape = "♥";
	}

	// - 출력메서드 (숫자가 입력될 때, A J Q K 에 해당되면 변경 후 출력)
	// 숫자를 문자로 변경 String.valueOf()

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

	// - toString
	@Override
	public String toString() {
		return "Card [num=" + num + ", shape=" + shape + "]";
	}

	// - getter/setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		// 범위 설정
		if(num < 1 || num > 13) {
			this.num = 1;
			return;
		}
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		// 모양 범위 설정 ♠, ◆, ♥, ♣
		if ("♠".equals(shape) || "◆".equals(shape) || "♥".equals(shape) || "♣".equals(shape)) {
			this.shape = shape;
		} else
			this.shape = "♥";
	}

}
