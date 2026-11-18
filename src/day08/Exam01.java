package day08;

import java.util.Arrays;
import java.util.Random;

public class Exam01 {

	Random ran = new Random();

	// 1. 랜덤 수를 리턴하는 메서드 (1~45)
	public int random() {
		int a = ran.nextInt(45) + 1;
		return a;
	}

	// 난수의 갯수와 시작숫자를 정하고싶다 1~45
	public int random(int count, int start) {
		return (int) (Math.random() * count) + start;
	}

	// 범위로 난수 생성
	public int random2(int begin, int end) {
		return (int) (Math.random() * end - begin + 1) + begin;
	}

	// 2. 중복 확인 메서드 : 배열에 정수가 있는 지 확인 (true or false)
	// - 매개변수 (배열, 랜덤정수)
	public boolean cheak(int[] arr, int b) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == b) {
				return true;
			}
		}
		return false;
	}

	// 3. 배열을 매개변수로 받아 랜덤 수(1번 메서드 호출)를 중복X(2번 메서드 호출) 채워주는 메서드
	public int[] arr(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int ran = random();
			if (cheak(arr, ran)) {
				i--;
			} else
				arr[i] = ran;
		}
		return arr;
	}

	// 4. 배열을 출력하는 메서드
	// - 사용자 번호 1 2 3 4 5 6
	// - 당첨 번호 1 2 3 4 5 6 [7]<= 보너스번호
	public void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (i == 6) {
				System.out.print("[" + arr[i] + "]");
			} else
				System.out.print(arr[i] + " ");
			if (i == arr.length - 1) {
				System.out.println();
			}
		}
	}

	// 5. 당첨을 확인하는 메서드 (리턴만 해도되고 바로 출력해도 됨)
	// - 사용자 번호, 당첨 번호를 받아서 등수를 리턴하는 메서드
	public int winCount(int[] user, int[] lotto) {

		int winCount = 0;
		for (int i = 0; i < lotto.length - 1; i++) {
			int lottoNum = lotto[i];
			if (cheak(user, lottoNum)) {
				winCount++;
			}
		}
		return winCount;
	}

	public int bonusCount(int[] user, int[] lotto) {
		int bonusCount = 0;
		int bonus = lotto[lotto.length - 1];
		for (int i = 0; i < lotto.length; i++) {
			if (cheak(user, bonus)) {
				bonusCount++;
				break;
			}
		}
		return bonusCount;
	}

	public static void main(String[] args) {
		Exam01 mathod = new Exam01();
		// 로또 만들기
		// - 사용자 번호 (6개) 자동
		// - 당첨 번호 (7개) 자동
		int user[] = new int[6];
		int lotto[] = new int[7];
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int countfail = 0;



		while(true) {
			mathod.arr(user); // 사용자 번호 생성
			mathod.arr(lotto); // 로또 번호 생성
			int winCount = mathod.winCount(user, lotto); // 당첨 번호 확인
//		System.out.println("winCount : " + winCount);
			int bonusCount = mathod.bonusCount(user, lotto); // 보너스 당첨 여부 확인
//		System.out.println("bonusCount : " + bonusCount);
			int totalCount = winCount + bonusCount;
		// - 6개 일치 = 1등 (순서 상관없이 숫자만, 보너스 제외)
		if (winCount == 6) {
			System.out.println("사용자 번호");
			mathod.print(user); // 사용자 번호 출력
			System.out.println("로또 당첨 번호");
			mathod.print(lotto); // 로또 번호 출력
//			System.out.println("1등");
			count1 ++;
			break;
		}
		// - 5개 일치 + 보너스 일치 = 2등
		if (winCount == 5 && bonusCount == 1) {
//			System.out.println("2등");
			count2 ++;
		}
		// - 5개 일치 = 3등
		if (totalCount == 5) {
//			System.out.println("3등");
			count3 ++;
		}
		// - 4개 일치 = 4등
		if (totalCount == 4) {
//			System.out.println("4등");
			count4++;
		}
		// - 3개 일치 = 5등
		if (totalCount == 3) {
//			System.out.println("5등");
			count5++;
		}
		// - 나머지는 꽝
		if (totalCount <= 2) {
//			System.out.println("꽝");
			countfail ++;
		}
		}
		
		System.out.println("1등 횟수 : " + count2);
		System.out.println("2등 횟수 : " + count2);
		System.out.println("3등 횟수 : " + count3);
		System.out.println("4등 횟수 : " + count4);
		System.out.println("5등 횟수 : " + count5);
		System.out.println("꽝 횟수 : " + countfail);
		System.out.println("너가 날린 돈 : " + (countfail*1000));
	}
}