package day09;

import java.util.Arrays;

public class Memo {

	public static void main(String[] args) {

		T1 t = new T1();
		System.out.println(t.toString());
		t.tv();
		t.power();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.pick();
		t.chDown();
		t.pick();
		t.favorList();
	}
}

class T1 {
	private final String BRAND = "LG";
	private boolean power;
	private int ch;
	private int vol;
	private int[] favor;
	private int index;
	private int count;

	public void tv() {
		this.ch = 3;
		this.vol = 3;
		this.favor = new int[5]; // 생성자로 객체 생성 시 배열의 실 객체를 메모리에 올림
	}

	// 메서드
	// pick() : 선호채널 등록 => 메서드를 한 번 호출하면 배열 1개가 채워짐
	// 번지로 사용할 변수가 필요함 => 메서드를 호출할 때마다 +1 증가
//	public void pick() {
////		int index = 0; // 이러면 호출할 때마다 0번지로 변경
//		boolean check = false;
//		if (power) {
//			if (favor.length == index) {
//				// 더이상 등록될 자리가 없을 때
//				// 1. 0번지로 이동
//				index = 0;
//			}
//			// 채널의 중복 방지
//			for (int i = 0; i < favor.length; i++) {
//				if (favor[i] == ch) {
//					check = true;
//				}
//			}
//			if (!check) {
//				favor[index] = ch;
//				index++; // 선호채널 하나 등록
//				count++; // 선호채널 등록한 횟수
//			}
//			System.out.println(ch + "번 선호채널 등록완료");
//		}
//	}
	
	public void pick() {
		// 2. 배열을 늘려서 값을 더 추가
		boolean check = false;
		if (power) {
			
			if (index == favor.length) {
				// 2. 배열을 늘려서 추가
				int[] arr = new int[favor.length+3];  // 현재 배열의 3개 추가
				System.arraycopy(favor, 0, arr, 0, favor.length);
				// 배열의 주소 변경
				favor = arr;
			}
			for (int i = 0; i < favor.length; i++) {
				if (favor[i] == ch) {
					check = true;
				}
			}
			if(!check) {
				favor[index] = ch;
				index++;
			}
		}
	}

	// favorList() : 선호채널 리스트
	public void favorList() {
		// index의 위치에 따라 선호채널 등록 갯수 확인
		System.out.println("--선호채널 리스트--");
		if (index == 0) {
			System.out.println("등록된 선호채널이 없습니다");
			return;
		}
		int cnt = count > index ? favor.length : index;
		
		for (int i = 0; i < cnt; i++) {
			System.out.print(favor[i] + " ");
		}
		System.out.println();
	}

	// power on/off
	public void power() {
		this.power = !this.power;
		if (this.power) {
			System.out.println(BRAND + "TV 전원이 켜집니다.");
		} else {
			System.out.println(BRAND + "TV 전원이 꺼집니다.");
		}
//		System.out.println(power ? BRAND + "TV 전원이 켜집니다." : BRAND + "TV 전원이 꺼집니다.");
	}

	// chUp (1~10까지 순환구조)
	public void chUp() {
		if (power) {
			ch++;
			if (ch > 10) {
				ch = 1;
			}
			System.out.println("ch : " + ch);
		}
	}

	// chDown (1~10까지 순환구조)
	public void chDown() {
		if (power) {
			ch--;
			if (ch < 1) {
				ch = 10;
			}
			System.out.println("ch : " + ch);
		}
	}

	// volUp
	public void volUp() {
		if (power) {
			vol++;
			if (vol > 10) {
				vol = 10;
			}
			System.out.println("vol : " + vol);
		}
	}

	// volDown
	public void volDown() {
		if (power) {
			vol--;
			if (vol <= 0) {
				vol = 0;
				System.out.println("음소거");
				return;
			}
			System.out.println("vol : " + vol);
		}
	}

	// toString : 멤버변수를 String으로 리턴
	@Override
	public String toString() {
		return "TV [BRAND=" + BRAND + ", power=" + power + ", ch=" + ch + ", vol=" + vol + ", favor="
				+ Arrays.toString(favor) + "]";
	}

	// ----getter/setter----

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int[] getFavor() {
		return favor;
	}

	public void setFavor(int[] favor) {
		this.favor = favor;
	}

}
