package day09;

import java.util.Random;
import java.util.Scanner;

public class Class03 {

	public static void main(String[] args) {
		// 클래스 생성
		// 각각 멤버변수의 getter / setter 생성

		StudentClass c = new StudentClass();
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		System.out.print("이름 : ");
		c.setName(scan.nextLine());

//		System.out.print("국어점수 : ");
//		c.setKor(scan.nextInt());
		c.setKor(ran.nextInt(101));
		while (c.getKor() == -1) {
			System.out.print("국어점수 : ");
			c.setKor(scan.nextInt());
		}
//		System.out.print("영어점수 : ");
//		c.setEng(scan.nextInt());
		c.setEng((int)(Math.random()*101));
		while (c.getEng() == -1) {
			System.out.print("영어점수 : ");
			c.setEng(scan.nextInt());			
		}
//		System.out.print("수학점수 : ");
//		c.setMath(scan.nextInt());
		c.setMath((int)(Math.random()*101));
		while (c.getMath() == -1) {
			System.out.print("수학점수 : ");
			c.setMath(scan.nextInt());			
		}

		c.print();
		System.out.println("합계 : " + c.sum());
		System.out.println("평균 : " + c.avg());
		scan.close();

		// 클래스에도 배열이 가능함
		StudentClass[] studentClass = new StudentClass[10];
		studentClass[0] = new StudentClass();
		studentClass[0].setName("길동");
		studentClass[0].setKor(77);
		studentClass[0].setEng(52);
		studentClass[0].setMath(44);
		studentClass[0].print();
	}
}


class StudentClass {

	// 학생이름, 국어점수, 영어점수, 수학점수 를 객체로 하는 클래스 생성
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;

	// 이름 (국어, 영어, 수학) => 출력메서드 생성
	public void print() {
		System.out.println("| 이름 : " + getName() + " | 국어 : " + getKor() + " | 영어 : " + getEng() + " | 수학 : " + getMath() + " |");
	}

	// 메서드 호출하면 국+영+수 리턴되는 => 합계메서드 생성
	public int sum() {
		this.sum = getKor() + getEng() + getMath();
		return this.sum;
	}

	// 메서드를 호출하면 합계/3 평균이 리턴되는 => 평균메서드 생성
	public double avg() {
		this.avg = (double)this.sum / 3;
		return avg;
	}

	// 이름 setter
	public void setName(String name) {
		this.name = name;
	}

	// 이름 getter
	public String getName() {
		return this.name;
	}

	// 국어점수 setter
	public void setKor(int kor) {
		if (kor < 0 || kor > 100) {
			System.out.println("0~100점 사이로 입력해주세요.");
			this.kor = -1;
			return;
		} else
			this.kor = kor;
	}

	// 국어점수 getter
	public int getKor() {
		return this.kor;
	}

	// 영어점수 setter
	public void setEng(int eng) {
		if (eng < 0 || eng > 100) {
			System.out.println("0~100점 사이로 입력해주세요.");
			this.eng = -1;
			return;
		} else
			this.eng = eng;
	}

	// 영어점수 getter
	public int getEng() {
		return this.eng;
	}

	// 수학점수 setter
	public void setMath(int math) {
		if (math < 0 || math > 100) {
			System.out.println("0~100점 사이로 입력해주세요.");
			this.math = -1;
			return;
		} else
			this.math = math;
	}

	// 수학점수 getter
	public int getMath() {
		return this.math;
	}

	
	
}
