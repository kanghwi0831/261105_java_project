package day07;

import java.util.Scanner;
import java.util.Random;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표
		// 전체인원 > 3명 (입력) 인원수만큼 배열 생성
		// 이름 국어 영어 수학 합계 평균 등수
		// sin 30 20 100 ...
		// dong .. ... ..
		// bin .. ...

		// 이름, 국어, 영어, 수학 점수를 입력받아 합계 평균 등수 구하기
		// 각각의 필요한 배열을 따로 생성해서 같은 번지의 학생은 같은 값으로 정의
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("성적 산출할 인원 수를 정하세요 : ");
		int tester = scan.nextInt();
		String[] name = new String[tester];

		System.out.print("과목 수를 정하세요 : ");
		int subject = scan.nextInt();

		int[][] scores = new int[tester][subject];
		int[] total = new int[tester];
		double[] avg = new double[tester];
		int[] rank = new int[tester];

		for (int i = 0; i < tester; i++) {
			System.out.print(i + 1 + "번 이름 입력 : ");
			name[i] = scan.next();
			for (int j = 0; j < subject; j++) {
				System.out.print(name[i] + "의 " + (j + 1) + "과목 점수 : ");
				scores[i][j] = scan.nextInt();
				if (scores[i][j] < 0 || scores[i][j] > 100) {
					System.out.println("점수를 0 ~ 100사이로 다시 입력해주세요.");
					j--;
					continue;
				}
//				scores[i][j] = ran.nextInt(70) + 30; // 입력 귀찮으니 랜덤으로 구해보기

				total[i] += scores[i][j];
				avg[i] = total[i] / subject;
			}
		}
		System.out.print("이름\t"); // 성적표 이름란
		for (int i = 0; i < subject; i++) { // 성적표 이름 n번
			System.out.print((i + 1) + "과목\t"); // 성적표 과목란
		}
		System.out.println("합계\t 평균\t 등수"); // 성적표 합계 평균 등수란

		for (int i = 0; i < tester; i++) { // for 이름은 내가 입력한 tester 만큼 출력할거다
			rank[i]++;
			System.out.print(name[i] + "\t"); // 1번 이름 출력
			for (int j = 0; j < subject; j++) { // for 과목은 내가 입력한 subject 만큼 출력
				System.out.print(scores[i][j] + "점\t"); // 1번 tester의 0행 0열 scores값 출력
			}
			for (int t = 0; t < tester; t++) {
				if (total[i] < total[t]) {
					rank[i]++;
				}
			}
			System.out.print(total[i] + "점\t"); // 1번 tester의 합계 출력
			System.out.printf("%.2f", avg[i]); // 1번 tester의 평균 출력
			System.out.println("점\t" + rank[i] + "등");
		}
		scan.close();
	}
}
