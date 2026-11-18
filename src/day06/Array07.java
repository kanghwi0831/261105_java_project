package day06;

import java.util.Arrays;

public class Array07 {

	public static void main(String[] args) {
		// String 배열
		
		String strArr[] = new String[5];
		
		strArr[0] = "홍길동";
		strArr[1] = "신동빈";
		strArr[2] = "노동빈";
		strArr[3] = "대동빈";
		strArr[4] = "엄동빈";
		
		System.out.println(Arrays.toString(strArr));
		
		// 배열의 단점 : 배열의 길이는 고정
		
		// 배열의 데이터를 늘리는 경우
		// 더 큰 배열을 만들어서 기존 데이터를 옮겨줘야 함.
		String strArr2[] = new String[strArr.length+3];
		System.out.println(Arrays.toString(strArr2));
		
		// 기존 데이터 이동 (기존 배열까지만 순회)
		for (int i = 0; i < strArr.length; i++) {
			// 받을대상 = 주는대상
			strArr2[i] = strArr[i];
		}
		System.out.println(Arrays.toString(strArr2));
		
		// 위처럼 하면 뭐가 많고 복잡하므로 한번에 하는 명령어가 있다
		// 배열복사 arraycopy
		// System.arraycopy(구배열, 시작번지, 신배열, 시작번지, 갯수);
		System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
		
		strArr = strArr2; // 원래 배열의 주소를 버리고, 새 배열의 주소를 저장
		strArr[5] = "동빈이는못말려";
		System.out.println(Arrays.toString(strArr));
		
	}

}
