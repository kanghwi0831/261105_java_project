package day09;

import java.util.Scanner;

public class Class04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Car c = new Car("카니발", 2025);

//		System.out.print("차량 이름 : ");
//		c.setName(scan.next());

		while (c.getEnd() != 4) {
//			System.out.println(c.getName());
			c.printInfo();
			c.menuPrint();
			c.input(scan.nextInt());
		}
		System.out.println("종료합니다.");
		scan.close();
	}

}

class Car {
	// 기능 : 시동켜기, 시동끄기, 속도 up, 속도 down
	// power, speed
	// name, year
	private String name;
	private int year;
	private boolean power;
	private int speed;
	private int end;

	// 생성자 - 멤버변수 아래
	// 객체를 생성할 때 (new) 초기값을 지정해주는 역할
	// 기본생성자 : 컴파일러가 자동으로 제공 (컴파일시 생성자가 없으면..)
	// - object = null / 숫자 = 0 / boolean = false
	// - 다른 생성자가 존재하면 자동으로 주지 않음.
	// 기본생성자는 사용자가 직접 생성가능.
	// 생성자는 여러개 생성 가능 (생성자 오버로딩)
	// 생성자 오버로딩 조건 : 매개변수의 갯수가 다르거나, 타입이 달라야 함.
	// 생성자 이름은 클래스이름과 동일
	// 생성자는 리턴타입이 없는 메서드와 같은 구조.
	// public 클래스명(매개변수) {
	// 멤버변수 값 설정;
	// }
	public Car() {} // 기본생성자

	// 매개변수로 이름과 연식을 받아서 제공
	public Car(String name, int year) {
		this.name = name;
		this.year = year;
	}

	// 출력메서드
	public void printInfo() {
		System.out.println(name + "(" + year + "년식)");
	}

	// 메뉴
	public void menuPrint() {
		System.out.println("| 1. 속도 UP | 2. 속도 DOWN | 3. 시동 ON/OFF | 4. 그만하기 |");
		System.out.print("입력 : ");
	}

	// scan input
	public void input(int input) {
		if (input == 1) {
			speedUp();
		} else if (input == 2) {
			speedDown();
		} else if (input == 3) {
			power();
		} else if (input == 4) {
			setEnd(4);
		} else
			System.out.println("메뉴에 있는 항목을 선택해주세요.");
	}

	// 현재속도 print
	public void speedPrint() {
		System.out.println("--------------------------" + speed + "km--------------------------");
	}

	// 시동 켜기
	public void power() {
		if (isPower() == false && getSpeed() == 0) {
			setPower(true);
			System.out.println("시동이 켜졌습니다.");
		} else if (isPower() == true && getSpeed() == 0) {
			setPower(false);
			System.out.println("시동이 꺼졌습니다.");
		} else if (getSpeed() > 0) {
			speedPrint();
			System.out.println("차량이 멈춰있지 않아 시동을 끌 수 없습니다.");
		}
	}

	// speedUp
	public void speedUp() {
		if (isPower() == false) {
			System.out.println("시동을 켜주세요.");
		} else if (getSpeed() >= 200) {
			speedPrint();
			System.out.println("속도를 더이상 올릴 수 없습니다.");
		} else
			setSpeed(speed += 20);
		speedPrint();
	}

	public void speedDown() {
		if (isPower() == false) {
			System.out.println("시동을 켜주세요.");
		} else if (getSpeed() <= 0) {
			speedPrint();
			System.out.println("차량이 이미 멈춰있습니다.");
		} else
			setSpeed(speed -= 20);
		speedPrint();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

}