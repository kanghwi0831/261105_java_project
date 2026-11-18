package day08;

import java.util.Scanner;

public class Method03 {

	// 변수가 어떤것을 저장하느냐에 따라 분류
	// 일반변수 : 값을 저장 => 기본 & 자료형
	// 참조변수 : 주소를 저장 => 그 외
	
	// 정수 하나를 입력받아 해당 정수의 구구단을 출력
	
	public void dan(int num) {
		for (int i = 1; i <= 9; i++) {
			if (i == 5) {
				System.out.println();
			}
			System.out.print(num + " * " + i + " = " + (num*i) + "\t");
			if (i == 9) {
				System.out.println();
			}
		}
		}
	
	public static void main(String[] args) {
		
		Method03 method = new Method03();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("0 입력 시 종료");
		System.out.print("입력 : ");
		int input = scan.nextInt();
		if (input == 0) {
			System.out.println("종료합니다.");
			break;
		}
		method.dan(input);
		}
		scan.close();
		for (int i = 2; i <= 9; i++) {
			method.dan(i);
		}
	}

}
