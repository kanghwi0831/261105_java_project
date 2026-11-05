package day03;

import java.util.Random;

public class For02 {

	int a; // 메서드 밖에 써서 지역변수가 아니다
	public static void main(String[] args) {
		// for문을 사용하여 1~100까지의 합계를 출력
		
		// int sum; = 값이 없는 변수 : local variable (지역변수) : 반드시 초기화해야함
		// 메서드 안에서 쓰는 변수는 지역변수다
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
		
		sum = sum + i;  // sum += i
		
		}
		
		System.out.println(sum);
		
		// 1~100까지 짝수의 합계
		sum = 0;
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
		
		// for문 이용. 1~10까지의 랜덤 수를 5번 출력
		Random ran = new Random();
		for (int i = 1; i <= 4; i++) { 
			
			int r = ran.nextInt(10)+1;   // ( (int)(Math.random()*10)+1 )
			
			System.out.print(r + ", ");
			
		}
		System.out.println(ran.nextInt(10)+1);

	}
	

}
