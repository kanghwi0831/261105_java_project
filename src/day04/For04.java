package day04;

public class For04 {

	public static void main(String[] args) {
		// 약수 : 나누어서 떨어지는 수의 집합
		// 6의 약수 : 1, 2, 3, 6
		// 6 % 1 == 0
		// 6 % 2 == 0
		// 6 % 3 == 0
		// 6 % 4 == 2
		// 6 % 5 == 1
		// 6 % 6 == 0

		int number = 10;
		// for 1 ~ number까지 반복해서
		// number % i == 0 만 출력
		
		for (int i = 1; i <= number; i++) {
			
			if (number % i == 0) {
				System.out.println(i);
			}
			
		}
		System.out.println("------------------------");
		
		// 공약수 : 지정된 두 수의 공통된 약수
		// 6, 12의 공약수
		// 6 : 1, 2, 3, 6
		// 12 : 1, 2, 3, 4, 6, 12
		// 공약수 : 1, 2, 3, 6이 된다
		// 공약수 중 가장 큰 수 : 최대공약수 => 6
		
		int num1 = 6;  // num1 % i == 0
		int num2 = 12; // num2 % i == 0
		int gcd = 0;
		for (int i = 1; i <= num1; i++) {
			int num1s = num1%i;
			int num2s = num2%i;
			
			if (num1s == num2s) {
				gcd = i;
			}
		}
		System.out.println("최대공약수 : " + gcd);
		// i를 6부터 하나씩 감소
		for (int i=num1; ; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
			System.out.println("최대공약수 : " + i);
			break;
		}
			
	} System.out.println("----------------------------");
		// 배수 : 1부터 값을 곱해서 나오는 값
		// 10의 배수 : 10, 20, 30 ...
		// 15의 배수 : 15, 30, 45 ...
		// 공배수 : 두 수의 공통된 배수 => 30, 60, 90 ...
		// 최소공배수 : 30
		// 10*1, 10*2, 10*3...
		// 15*1, 15*2, 15*3...
		
		num1 = 10;
		num2 = 15;
		for (int i = num1; ; i = i + num1) {
			
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.println("최소공배수 : " + i);
				break;
			}
		}
		
		
	}
}
