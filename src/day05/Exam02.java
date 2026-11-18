package day05;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {


		// 주민등록 번호를 참고하여 생년월일과 성별, 나이를 출력
		// String regNum = "990101-1234567"; // 1900년생 => 1(남), 2(여)
		// String regNum = "010101-3234567"; // 2000년생 => 3(남), 4(여)
		int year = 2026;

		Scanner scan = new Scanner(System.in);
		
		System.out.print("주민등록번호를 입력해주세요 : ");
		String input = scan.nextLine();

		String birthYear = input.substring(0, 2);
		int birthInt = Integer.parseInt(birthYear);

		// 출력결과
		// 생년월일 : 990101
		System.out.println("생년월일 : " + input.substring(0, input.indexOf("-")));

		String gender = input.substring(7, 8);
		// 성별 : 남
		if (gender.equals("1") || gender.equals("3")) {
			System.out.println("성별 : 남");
		}
		if (gender.equals("2") || gender.equals("4")) {
			System.out.println("성별 : 여");
		}
		// 나이 : 28세
		if (gender.equals("1") || gender.equals("2")) {
			birthInt += 1900;
			System.out.println("나이 : " + (year - birthInt) + "세");
		}
		if (gender.equals("3") || gender.equals("4")) {
			birthInt += 2000;
			System.out.println("나이 : " + (year - birthInt) + "세");
		}
		
		scan.close();
		}
	}