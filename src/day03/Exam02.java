package day03;

import java.util.*;

public class Exam02 {

	public static void main(String[] args) {
		// 연도를 숫자로 입력받아 어린이(13), 청소년(19), 성인으로 구분
		// 어린이 5000원, 청소년 7000원, 성인 10000원 입장료 출력
		// ex) 2017 => 9살 어린입니다. 입장료는 5000원 입니다.
		// 2026 생년을 기준으로 2026 - 2017 => 나이
		// 생년의 유효한 값을 1900 ~ 2026
		// 기준에 넘어간 데이터는 다시 입력하라고 요청
		// 생년이 유효하지 않습니다. 다시입력해주세요 (1900~2026) >

		// 한 가족(20명)의 입장료
		// 반복적인 생년을 입력받고 싶음 => 종료 키워드 (0)
		// 반복이 종료되면 최종결제금액 출력

		// Scanner
		Scanner scan = new Scanner(System.in);

		int year = 2026;
		int total = 0;
		int count = 0;

		// 종료 키워드 안내문
		System.out.println("0을 입력하시면 프로그램이 종료됩니다.");
		
		while (true) {
			
//			if (count == 5) {
//				break;
//			}
			System.out.print("생년을 입력하시오 : ");
			int birthYear = scan.nextInt();
			int age = year - birthYear;

			// 종료 키워드
			if (birthYear == 0) {
				System.out.println("종료합니다.");
				System.out.println("최종금액"+ "(" + count + "명)" + " : " + total + "원 입니다.");
				break;
			}
			
			// 재입력 키워드
			if (birthYear < 1900 || birthYear > year) {
				System.out.println("!!유효하지 않는 연도입니다!!");
				continue;
			}

			// 정상입력시. total 누적키워드
			if (age <= 13) {
				System.out.println(age + "세 어린이입니다. 입장료는 5000원 입니다.");
				total = total + 5000; // total += 5000;
				count++;
				continue;
			} else if (age <= 19) {
				System.out.println(age + "세 청소년입니다. 입장료는 7000원 입니다.");
				total = total + 7000;
				count++;
				continue;
			} else {
				System.out.println(age + "세 성인입니다. 입장료는 10000원 입니다.");
				total = total + 10000;
				count++;
				continue;
			}

		}
		scan.close();

	}

}
