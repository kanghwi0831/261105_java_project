package day10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Report {
	Scanner scan = new Scanner(System.in);
	// DecimalFormat("##.00") => 객체명.format(avg)
	DecimalFormat df = new DecimalFormat("##.00");
	// 한사람 성적 클래스
	// 멤버변수 : 이름, 국어, 영어, 수학, 합계, 평균, 등수
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private int avg;
	private int rank;

	// 생성자 : 이름, 국어, 영어, 수학 => 매개변수로 등록
	public Report(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum(kor, eng, math);
		avg();
	}

	// 기본생성자도 같이 오버로딩 해서 생성
	public Report() {
	}

	// 합계, 평균 계산
	public void sum(int kor, int eng, int math) {
		this.sum = kor + eng + math;
	}

	public void avg() {
		 this.avg = sum / 3;
	}

	// # : 선택. 해당 자릿수가 있으면 출력, 없으면 안함
	// 0 : 필수. 해당 자릿수가 없으면 0으로 맞춰서 출력
	// 출력 메서드 => 평균은 소수점 2자리 DecimalFormat("##.00")
	public void printReport() {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + " \t" + df.format(avg) + "\t" + rank + "등");
	}
	public void printAvg() {
		System.out.print(df.format(avg));
	}

	public void printKor() {
		System.out.print(kor);
	}

	public void printEng() {
		System.out.print(eng);
	}

	public void printMath() {
		System.out.print(math);
	}

	public void printSum() {
		System.out.print(sum);
	}
	
	public void rank() {
	}

	// -------------------------------------

	public DecimalFormat getDf() {
		return df;
	}

	public void setDf(DecimalFormat df) {
		this.df = df;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

}
