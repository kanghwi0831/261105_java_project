package day02;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// return; (리턴을 만나면 메서드를 빠져나온다)
		
		Scanner sc = new Scanner(System.in);

		// 국어, 영어, 수학 점수를 입력받는다
		// 입력받은 점수는 0~100점 사이의 값만 한다 (넘어가면 잘못 입력된 값)
		System.out.println("국어 점수를 입력하세요.");
		// 국어점수 입력
		int kor = sc.nextInt();
		// 국어 0~100 이 틀렸을 시
		if ( kor < 0 || kor > 100 ) {
			System.out.println("국어 점수가 잘못 입력되었습니다.");
		// 빠져나온다
			return;
		} 
		// 0~100 이 맞았을 시
		else if ( kor > 0 || kor < 100 )
			System.out.println("국어 점수 : " + kor + "점");
		// 영어점수 입력으로 넘어간다
		    System.out.println("영어 점수를 입력하세요.");
		// 영어점수 입력
		int eng = sc.nextInt();
		// 영어 0~100 틀렸을 시
		if ( eng < 0 || eng > 100 ) {
			System.out.println("영어 점수가 잘못 입력되었습니다.");
		// 빠져나온다
			return;
		} 
		
		else if ( eng > 0 || eng < 100 )
			System.out.println("영어 점수 : " + eng + "점");
		
		System.out.println("수학 점수를 입력하세요");
		
		int math = sc.nextInt();
		
		if ( math < 0 || math > 100 ) {
			System.out.println("수학 점수가 잘못 입력되었습니다.");
		    return;
		} 
		
		else if ( math > 0 || math < 100 )
			System.out.println("수학 점수 : " + math + "점");
		
		// 합계, 평균, pass 여부 출력
		
		// 합계 = 국+영+수
		int total = kor + eng + math;
		System.out.println("합계 : " + total + "점");
		
		// 평균 = 합계/3
		double avg = total/3.0;
		
		System.out.println("평균 : " + avg + "점");
		
		// 평균 60점 이상일 시 합격
		String pass = avg>=60 ? "합격입니다." : "불합격입니다.";
		
		System.out.println(pass);
		
		sc.close();
		  }
}
