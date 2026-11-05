package day01;

public class Exam02 {

	public static void main(String[] args) {
		// kor, eng, math 세 점수를 입력하고, 합계와 평균을 출력
		// 각 점수는 0~100 여야만 한다 이탈하면 "잘못입력되었습니다." 입력
		// pass : 평균 60점 이상이면 합격 아니면 불합격

		// kor, eng, math 세 점수를 입력
		int kor = 100, eng = 40, math = 40;
		int total = kor + eng + math;
		double avg = total / 3.0;
		String pass = (avg >= 60 ? "합격입니다." : "불합격입니다.");

		if (kor < 0 || kor > 100) {
			System.out.println("국어 점수가 잘못 입력되었습니다.");
		} else if (eng < 0 || eng > 100) {
			System.out.println("영어 점수가 잘못 입력되었습니다.");
		} else if (math < 0 || math > 100) {
			System.out.println("수학 점수가 잘못 입력되었습니다.");
		} 
		else {
			System.out.print("합계 : " + total);
			System.out.print("점, 평균 : " + avg);
			System.out.println("점");
			System.out.println(pass);
		}
		/*
		 * 선생님 풀이 
		 * int kor = 78; int eng = 55; int math = 101;
		 * 각 점수가 조건에 맞는 지 확인 조건에 맞다면 계산
		 * if ( (kor > 0 || kor < 100) || (eng > 0 || eng 100) || (math > 0 || math < 100) ) {
		 * 계산 불가시
		 * System.out.println("점수가 잘못 입력되었습니다");
		 * } else {
		 * 계산 
		 * int total = kor + eng + math;
		 * double avg = (double)total / 3;
		 * System.out.println("total : " + total + " average : " + avg); if (avg >= 60)
		 * System.out.println("합격");
		 * } else { System.out.println("불합격");
		 * }
		 */

	}
}
