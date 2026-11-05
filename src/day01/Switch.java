package day01;

public class Switch {

	public static void main(String[] args) {
		// 조건문 : if, switch
		/*
		 * switch(변수 / 식){ case 값1: 실행문; break; case 값2: 실행문; break; ... ... default:
		 * 실행문; break;(선택) }
		 * 
		 * break : 실행중인 구문을 강제로 빠져나오게 하는 구문 (조건문 동반)
		 */

		int number = 22;

		switch (number % 2) {
		case 0:
			System.out.println("짝수");
			break;

		case 1:
			System.out.println("홀수");
			break;
		default:
			System.out.println("이상한 수");
			break;
		}
		// 1~6까지의 주사위 숫자를 dice 라고 가정한다.
		// switch 문을 이용하여 dice 값만큼 전진
		int dice = 6;
		switch (dice) {
		case 1:
			System.out.println("1칸 전진");
			break;
		case 2:
			System.out.println("2칸 전진");
			break;
		case 3:
			System.out.println("3칸 전진");
			break;
		case 4:
			System.out.println("4칸 전진");
			break;
		case 5:
			System.out.println("5칸 전진");
			break;
		case 6:
			System.out.println("6칸 전진");
			break;
		default:
			System.out.println("다시 입력하세요.");
			break;
		}

		switch (dice) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println(dice + "칸 전진");
			break;
		default:
			System.out.println("다시 입력하세요.");
			break;
		}

		int month = 12;
		// 3~5 봄, 6~8 여름, 9~11 가을, 12~2 겨울
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월은 겨울");
			break;
		default:
			System.out.println("not found");
			break;

		}

	}

}
