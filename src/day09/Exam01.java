package day09;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		TV tv = new TV();
		while (tv.getEnd() != 6) {
			tv.setBrand();
			tv.menu();
			tv.input(scan.nextInt());
		}
		System.out.println("종료합니다.");
		scan.close();
	}
}

class TV {
	// brand, power, ch(0~20번, 순환구조), vol(min 0("음소거") max 10), favor[5까지만]

	// 선호채널 등록 5개까지만 등록
	// 1. 선호채널 등록 메서드
	// - 현재 채널 번호를 선호채널 배열에 넣기
	// 2. 선호채널 리스트 보기
	// - 등록된 선호채널을 리스트로 출력

	private final String BRAND = "Samsung"; // 중간에 바꿀 수 없는 값 == 상수 == final => 전부 대문자
	private boolean power;
	private int channel;
	private int volume;
	private int[] favor = new int[5];
	private int end;
	private int count;
	private int index;

	// 브랜드 지정
	public void setBrand() {
		System.out.println(BRAND);
	}

	// menu
	public void menu() {
		System.out.println(
				"| 1. 채널 Up | 2. 채널 Down | 3. 볼륨 Up | 4. 볼륨 Down | 5. 파워 On/Off | 6. 선호채널목록 | 7. 선호채널 지정 | 0. 종료 |");
		System.out.print("입력 : ");
	}

	// input
	public void input(int input) {

		switch (input) {
		case 1:
			channelUp();
			break;
		case 2:
			channelDown();
			break;
		case 3:
			volumeUp();
			break;
		case 4:
			volumeDown();
			break;
		case 5:
			power();
			break;
		case 6:
			favorList();
			break;
		case 7:
			favorPick();
			break;
		case 0:
			setEnd(6);
			break;
		default:
			System.out.println("메뉴에 있는 항목을 선택해주세요");
		}
	}

	// 파워 온오프
	public void power() {
		if (isPower() == false) {
			setPower(true);
			System.out.println("TV가 켜졌습니다.");
		} else if (isPower() == true) {
			setPower(false);
			System.out.println("TV가 꺼졌습니다.");
		}
	}

	// TV 켜고 조작하세요
	public void plzPowerOn() {
		if (isPower() == false) {
			System.out.println("TV를 켜고 시행해주세요");
		}
	}

	// 현재 채널
	public void channelNow() {
		System.out.println("현재 채널 : " + getChannel());
	}

	// 채널 up (0~20번)
	public void channelUp() {
		if (isPower() == false) {
			plzPowerOn();
		} else if (channel >= 0 && channel < 20) {
			setChannel(channel + 1);
			channelNow();
		} else if (channel == 20) {
			setChannel(0);
			channelNow();
		}
	}

	// 채널 down
	public void channelDown() {
		if (isPower() == false) {
			plzPowerOn();
		} else if (channel > 0 && channel <= 20) {
			setChannel(channel - 1);
			channelNow();
		} else if (channel == 0) {
			setChannel(20);
			channelNow();
		}
	}

	// 현재 볼륨
	public void volumeNow() {
		if (getVolume() == 0) {
			System.out.println("현재 볼륨 : 음소거");
		} else
			System.out.println("현재 볼륨 : " + getVolume());
	}

	// 볼륨 up
	public void volumeUp() {
		if (isPower() == false) {
			plzPowerOn();
		} else if (volume >= 0 && volume < 10) {
			setVolume(volume + 1);
			volumeNow();
		} else if (volume == 10) {
			System.out.println("볼륨이 최대치입니다.");
		}
	}

	// 볼륨 down
	public void volumeDown() {
		if (isPower() == false) {
			plzPowerOn();
		} else if (volume > 0 && volume <= 10) {
			setVolume(volume - 1);
			volumeNow();
		} else if (volume == 0) {
			System.out.println("이미 음소거 상태입니다.");
		}
	}

	// 선호채널 리스트
	public void favorList() {
		if (isPower() == false) {
			plzPowerOn();
		} else
			System.out.println("-----선호채널 리스트-----");
		if (count == 0) {
			System.out.println("등록된 선호채널이 없습니다.");
			return;
		}
		int cnt = count > index ? favor.length : index;

		for (int i = 0; i < cnt; i++) {
			System.out.print(favor[i] + "채널 ");
		}
		System.out.println();
	}

	// 현재채널에서 누르면 선호채널로 지정
	public void favorPick() {
		boolean check = false;
		if (isPower() == false) {
			plzPowerOn();
		} else if (favor.length == index) {
			index = 0;
		}
		for (int i = 0; i < favor.length; i++) {
			if (favor[i] == channel) {
				check = true;
			}
		}
		if (!check) {
			favor[index] = channel;
			index++;
			count++;
		}
		System.out.println(channel + "번 선호채널 등록 완료.");
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int[] getFavor() {
		return favor;
	}

	public void setFavor(int[] favor) {
		this.favor = favor;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}
}
