package day02;

import java.util.*;

public class Exam03 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 랜덤으로 생성 (0~100)
		Random ran = new Random();

		// 각 점수를 출력하고 합계, 평균, pass
		/*
		 * System.out.println("국어 점수 : " + kor + "점"); System.out.println("영어 점수 : " +
		 * eng + "점"); System.out.println("수학 점수 : " + math + "점");
		 * 
		 * // 합계 System.out.println(kor + " + " + eng + " + " + math + " = " + total +
		 * "점"); // 합계, 평균 System.out.println("합계 = " + total + "점, " + "평균 = " + avg +
		 * "점"); // pass 80점 이상이면 상, 60점 이상이면 중, 나머지는 하 if (avg >= 80) {
		 * System.out.println("'상'등급 입니다."); } else if (avg >= 60 && avg < 80) {
		 * System.out.println("'중'등급 입니다."); } else { System.out.println("'하'등급 입니다.");
		 * }
		 */

		// (for문 활용 추가) 5명의 값을 출력

		// 5회 반복해야한다
		for (int i = 1; i <= 5; i++) {      
			
			int kor = ran.nextInt(100);       // 나는 Random 객체를 만들었지만 만들지 않고 사용하고 싶다면
			int eng = ran.nextInt(100);       // int kor = (int)(Math.random()*100); 식으로도 가능하다
			int math = ran.nextInt(100);
			int total = kor + eng + math;
			double avg = total / 3.0;
			
			// pass 상중하 가정 틀을 만든다
			String pass = "";
			if (avg >= 80) {
				pass = "상";
			}
			if (avg >= 60 || avg < 80) {
				pass = "중";
			}
			if (avg < 60) {
				pass = "하";
			}

			// 1명씩 각 점수와 합계를 만들어야한다
			System.out.println(i + "번 응시자 : " + kor + "+" + eng + "+" + math + " = " + total);
			System.out.println("합계 = " + total + "점, 평균 = " + avg + "점");
			System.out.println(pass);
			// 평균을 보고 패스를 매긴다
		}
		
		
	}
}
