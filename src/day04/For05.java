package day04;

public class For05 {

	public static void main(String[] args) {
		// 구구단
		int dan = 2; // 2~9까지 반복

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}

		System.out.println("----------------------------");

		for (dan = 2; dan <= 9; dan++) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}
		System.out.println("-----------------------");

		// 2x1=2 3x1=3 4x1=4
		// 2x2=4 3x2=6 4x2=12
		// 2x3=6 3x3=9 4x3=16 ...

		for (dan = 1; dan <= 9; dan++) {

			for (int i = 2; i <= 9; i++) {

				for (; i <= 9; i++) {
				System.out.print("| " + i + " x " + dan + " = " + (dan * i) + " | ");

				if (i == 9) {
					System.out.println();
				}
				}
			}
		}
	}
}
