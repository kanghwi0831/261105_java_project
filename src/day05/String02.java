package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		// String method
		
		// toLowerCase() / toUpperCase() : 소문자 변환 / 대문자 변환
		// jpg, JPG, Jpg => jpg 하고싶을때 쓴다
		System.out.println("--toLowerCase()/toUpperCase()--");
		System.out.println("JPg".toLowerCase()); // 어떻게 적어도 소문자로 처리해줄게
		System.out.println("jPG".toUpperCase()); // 대문자
		
		// isEmpty() : 값이 비었는지 확인 (공백도 있는 것으로 간주한다!) 얘도 리턴은 true / false 로 친다
		System.out.println("--isEmpty()--");
		System.out.println(" ".isEmpty()); // false. (공백도 있는거라 펄스다)
		
		//isBlank() : 값이 비었는지 확인 (공백도 비어있는 것으로 간주한다)
		System.out.println("--isBlank()--");
		System.out.println(" ".isBlank()); // true. (공백도 비어있음으로 간주해서 트루다)
		
		// trim() : 불필요한 공백 제거
		System.out.println("--trim--");
		System.out.println("                   abc         ".trim());  // 쓸모없는 앞 뒤의 공백을 지우고 출력해줌
		
		// replace() : 글자를 변환
		System.out.println("--replace()--");
		// 2026-11-09 => 2026/12/9
		System.out.println("2026-11-09".replace("-", "/"));   // "-" 를 "/" 로 바꾸고 싶다
		
		// split : 특정 값으로 나누기 => 배열로 리턴
		String str = "apple, banana, kiwi, orange";
		System.out.println("--split--");
		String[] arr = str.split(",");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(str.split("")));
		System.out.println(Arrays.toString("1234".split("")));
		
		// split : 나누기 / join : 배열 => String
//		String p = String.join("구분자", 배열);
		String p = String.join("........", str);
		System.out.println("-----");
		System.out.println(p);
		
		
		// 문자를 숫자로 변경 => Integer.parseInt()
		String num = "123";
		int num2 = Integer.parseInt(num);
		System.out.println(num2);
		
		// 숫자를 문자로 변경 String.valueOf()
		String num3 = String.valueOf(num2);
		System.out.println(num3);
		
		// instanceof : 같은 클래스인지 비교하는 연산자 (클래스 자료형만 가능. 기본형은 불가)
		System.out.println(num3 instanceof String);

	}

}
