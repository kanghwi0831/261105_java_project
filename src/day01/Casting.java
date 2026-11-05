package day01;

public class Casting {

	public static void main(String[] args) {
		// casting : 자료형 변환
		// a(int) = b(double);   두 변수의 자료형이 맞지 않다면 오류발생
		// 자동 자료형 변환 : auto casting
		// 정수 크기 byte < short < char < int < long
		// 실수 크기 float < double
		// 명시적 자료형 변환  : 변수 앞에 (타입)변수 ex( (double)3 식
		
		byte b = 11;
		int a = b;  // int가 byte보다 큼으로 오토캐스팅 가능
		/*
		 * int aa = 111;
		 * byte c = aa; 라는 식은 불가능
		 */
		int aa = 111;
		byte c = (byte)aa; // 명시적 캐스팅
		
		System.out.println(c);
		
		long l = a;
		
		double d = 3.14159;
		int pi = (int)d; // 인트로 형변환하여 소수점 버림
		
		System.out.println(d);
		System.out.println(pi);
		
		int number = 100;
		double num = number;
		System.out.println(num); // .0으로 소수점 생김
		
		// ===========================
		
		// 문자를 숫자로 : String > int
		// "123" > 123
		String str = "123";
		System.out.println(str + 10);
		
		// 기본 8가지 자료형도 클래스 타입의 타입이 존재한다
		// 추가 기능을 제공 (래퍼 클래스 : Wrapper class)
		// int의 래퍼클래스 : Integer / char : Character
		// float : Float / double : Double / boolean : Boolean
		// long : Long / byte : Byte / short : Short
		
		int strNumber = Integer.parseInt(str);
		System.out.println(strNumber+10);
		// parse 사용 시 문자를 숫자로 변환함(파싱한다)
		
		
		
		
		
	}

}
