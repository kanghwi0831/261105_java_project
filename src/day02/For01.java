package day02;

public class For01 {

	public static void main(String[] args) {
		// 반복문
		// for, while, do~while 세가지가 있다
		// for : 반복 횟수가 정해져 있을 때
		// while : 횟수가 정해져 있지 않을 때
		
		
		// for(초기화; 조건식; 증감식) {
		//   실행문;
		// }
		// 1. 초기화 : 반복 횟수를 세는 변수값  (국룰로 " i " 를 많이 쓴다)
		// 2. 조건식 : 반복 횟수가 끝나는 조건을 만든다 (조건이 참이 돼야 실행한다)
		// 3. 증감식 : 반복 횟수 증가 or 감소 담당
		// 4. 실행문 : 조건식이 참일 때 실행한다
		// 실행순서
		// 1. 초기화 => 2. 조건식 => 4. 실행문 => 3. 증감식   ( 2. 조건식이 false 될 때까지 반복한다 )
		
		
		// 1~5까지 출력해보자
		for (int i=0; i<5; i++) {
			System.out.println(i);
			
		}
		
		// 1~10
		for (int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		// 줄바꿈이 필요하면 그냥 printlf 넣어버리기
		System.out.println();
		
		System.out.println("출력값");
		
		// 1~10까지 중 짝수만 출력
		for (int i=1;  i<=10; i++)
			if ( i%2 == 0 ) {
			System.out.print(i+" ");
			}
		
		// 줄바꿈
		System.out.println();
		
		
		// 1~10까지 합계를 출력	
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i ;
			
			
				
			}
		System.out.println(sum);
		}
}
