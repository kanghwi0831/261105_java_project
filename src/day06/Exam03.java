package day06;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 야구게임
		// 컴퓨터가 랜덤으로 3자리의 숫자를 생성
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// 배열로 저장
		int comArr[] = new int[3];
		// 각 자리의 숫자는 0~9 까지 중 랜덤 숫자 => 중복 불가능
		for (int i = 0; i < comArr.length; i++) {
			comArr[i] = ran.nextInt(10);

			for (int j = 0; j < i; j++) {
				if (comArr[j] == comArr[i]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(comArr));

// 유저는 3자리를 맞추는 게임
		int userArr[] = new int[3];
		while (true) {
			System.out.print("입력 : ");

//			// String으로 받아서 split "" => 한글자씩 잘라서 배열로 리턴 (Integer.palseInt())
//			String myNum = scan.next();
//			
//			// 한글자씩 나눠서 배열에 저장
//			String myArr[] = myNum.split("");
//			for (int i = 0; i < myArr.length; i++) {
//				userArr[i] = Integer.parseInt(myArr[i]);
//			}

			for (int i = 0; i < userArr.length; i++) {
				userArr[i] = scan.nextInt();
			}
			
			int stCount = 0;
			int blCount = 0;
			for (int i = 0; i < userArr.length; i++) {
				for (int j = 0; j < comArr.length; j++) {
// 숫자만 맞으면 ball (숫자는 맞지만 위치가 안 맞을때)
					if (userArr[i] == comArr[j]) {
// 위치와 숫자가 맞으면 strike
						if (i == j) {
							stCount++;
						} else
							blCount++;
					}
				}
			}
// user : 7 8 9 => out! (아무것도 안 맞으면)
			if (stCount == 0 && blCount == 0) {
				System.out.println("OUT!");
// user 정답은 아닌데 뭐라도 맞으면
			} else if (stCount != 3) {
				System.out.println(stCount + "S " + blCount + "B");
			}
// user : 1 2 3 => 정답!! break;
			if (stCount == 3) {
				System.out.println("정답!!");
				break;
			}
		}
		scan.close();
	}
}

// ex) com : 1 2 3
// user : 1 9 8 => 1s
// user : 2 3 8 => 2b
// user : 1 3 2 => 1s 2b
// user : 1 2 5 => 2s
