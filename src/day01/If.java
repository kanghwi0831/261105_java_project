package day01;

public class If {

	public static void main(String[] args) {
		// 조건문 : if switch
		// 삼항연산자 : 조건 선택 연산자
		// if (조건식) 조건식이 참이면 실행

		int number = 0;

		if (number % 2 == 0) {
			// 조건식이 참일때 실행 구문
			System.out.println("짝수");

		}

		if (number % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		// number 0보다 크면 양수
		// number 0보다 작으면 음수
		// 나머지는 0(은 0밖에 해당안됨)
		// else if{조건식 하나 더}
		if (number > 0) {
			System.out.println("양수");
		} else if (number < 0) {
			System.out.println("음수");
		} else if (number == 0) {
			System.out.println("0");
		} else {
			System.out.println("not found");
		}

		{
			// 중괄호 = scope(스코프) : 해당 값이 영향을 미치는 범위
			// 자동 정렬 : ctrl + shift + F

		}
		
		

	}

}
