package day04;

public class For06 {

	public static void main(String[] args) {
		// 이중 for 연습
		// 줄 => i, 별 갯수 => j
		// *****
		// *****
		// *****
		// *****
		// *****
		
		for (int i = 1; i <= 5; i++) {  // 줄
			for (int j = 1; j <= 5; j++) {  // 별
				System.out.print("*");
		}
			System.out.println();
			System.out.println("------------");
		}
		
		// *      i=1, j=1
		// **     i=2, j=1,2
		// ***    i=3, j=1,2,3
		// ****   i=4, j=1,2,3,4
		// *****  i=5, j=1,2,3,4,5
		for (int i = 1; i <= 5; i++) {  // 줄
			
			for (int j = 1; j <= i; j++) {  // 별
				System.out.print("*");
			}			
			System.out.println();
		}
		System.out.println("--------------");
		// 역순이면?
		for (int i = 1; i <= 5; i++) {  // 줄
			
			for (int j = 5; j >= i; j--) {  // for (int j = 1; j <= (6-1); j++)
				System.out.print("*");
			}			
			System.out.println();
		}
	}

}
