package day10;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {

		// Report class 객체 생성 => 실행
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		DecimalFormat df = new DecimalFormat("##.00");

		// 성적 산출 인원 > 입력
		System.out.print("성적 산출 인원 : ");
		int count = scan.nextInt();

		// 이름, 국어, 영어, 수학 (입력 or 랜덤)
		Report[] reportArr = new Report[count];

		for (int i = 0; i < count; i++) {
			System.out.print((i + 1) + "번 이름 : ");
			String name = scan.next();
			int kor = ran.nextInt(101);
			int eng = ran.nextInt(101);
			int math = ran.nextInt(101);
			Report r = new Report(name, kor, eng, math);
			r.sum(kor, eng, math);
			r.avg();
			// Report[] = new Report[입력갯수];
			reportArr[i] = r;
		}
		scan.close();

		// 순위
		for (int i = 0; i < count; i++) {
			int rank = 1;
			for (int j = 0; j < count; j++) {
				if (reportArr[i].getAvg() < reportArr[j].getAvg()) {
					rank++;
				}
			}
			reportArr[i].setRank(rank);
		}

		// 이름 국어 영어 수학 합계 평균 등수 \t 활용
		Report r = new Report();
		Test t = new Test();
		System.out.println("이름\t국어\t영어\t수학\t합계\t 평균\t등수");
		// name 100 100 100 300 100 1
		t.allPrintArr(reportArr);
		// Report 객체가 들어가는 배열
		// Report r = new Report("이름", 100, 50, 62);
		// Report[i] = r;

	}

}

class Test {
	public void allPrintArr(Report[] reportArr) {
		for (int i = 0; i < reportArr.length; i++) {
			reportArr[i].printReport();
		}
	}
}
