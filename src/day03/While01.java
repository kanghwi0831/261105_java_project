package day03;

public class While01 {

	public static void main(String[] args) {
		// While
		// while(조건식) { 실행문; }
		// 조건식이 참이면 실행문 실행
		// 몇 번 실행할 지도 본인이 정할 수 있다
		// 반복할 조건의 증감식이 항상 실행문에 포함!
		// for : 반복 횟수가 정해져 있을 경우
		// while : 반복 횟수가 정해져 있지 않을 경우

		// 1~10 까지 출력하세요
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		int i = 1;
//		while (true) { // i<=10; 같은 조건보다 true 조건을 쓰는 경우가 많다
//			
//			System.out.println(i);
//			i++;
//			// 증감식 대신 조건을 이용한 break;
//			// 빠져나올 수 있는 조건을 항상 만들어야 한다
//			if(i == 5) {
//				break;
//			}
//		}

		// while을 이용해서 1~10까지 출력

		i = 0;

		while (i <= 10) {
			System.out.println(i);
			i++;
			if (i <= 11) {

			}
		}
		
		// 짝수만 출력
		i = 0;

		while (i <= 10) {
			i++;
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// 트루를 이용해서 짝수출력하고 짝수끼리 합계
		i = 0;
		int sum = 0;
		while (true) {
			i++;
			if (i % 2 == 1) {
				return;
			} else if (i % 2 == 0) {
				System.out.println(i);
				sum += i;
				return;
			} else if (i == 11) {
				break;
			}

		}
		System.out.println(sum);

	}

}
