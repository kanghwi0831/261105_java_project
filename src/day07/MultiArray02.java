package day07;

public class MultiArray02 {

	public static void main(String[] args) {
		// 2차원 배열 행5 열3
		// 1 2 3
		// 4 5 6
		// 7 8 9
		// 10 11 12
		// 13 14 15
		
		int[][] arr = new int[5][3];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {        // 0행부터 갖고있는 총 행수까지
			for (int j = 0; j < arr[i].length; j++) { // 0열부터 0행의 총 열수까지
				count++;                              // 반복할때마다 카운트 1씩 올림
				arr[i][j] = count;                    // 해당하는 열에 카운트를 넣음
				System.out.print(arr[i][j] + " ");    // 해당하는 행,열 출력
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		for (int i = 0; i < arr.length; i++) {           // 0행부터 갖고있는 총 행수까지
			for (int j = 0; j < arr[i].length; j++) {    // 0열부터 0행의 총 열수까지
				arr[i][j] = (int)(Math.random()*90)+10;  // 해당하는 열에 랜덤 수를 입력
				System.out.print(arr[i][j] + " ");       // 해당하는 행,열 출력
			}
			System.out.println();
		}

	}

}
