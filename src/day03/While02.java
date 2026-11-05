package day03;

public class While02 {

	public static void main(String[] args) {
		// 1~50까지 짝수만 출력
		// 2 4 6 8 10
		// 12 14 16 18 20
		// 22 24 26 28 30
		// ... 50

		int i = 0;
		int sum = 0;
		int count = 0;
		while (true) {
			i++; // 1 올린다
			if (i == 51) {
				break;
			}
			if (count == 5) {
				System.out.println();
				count = 0;

			}
			if (i % 2 == 0) { // 짝수면
				count++;
				System.out.print(i + " "); // 입력한다

			}
		}
		System.out.println();
		System.out.println("-----------------------------");

		// 10의 배수면 enter
		i = 1;
		while (i <= 50) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			if (i % 10 == 0) {
				System.out.println();
			}
			i++;

		}
		System.out.println("-----------------------------");
		
		// 5번 출력 enter => 출력 count 변수가 필요하다
		i = 1;
		count = 0;
		
		while(i <= 50) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				count++;
			}
			if (count == 5) {
				System.out.println();
				count = 0;
			}
			i++;
		}
		
		
		
	}

}
