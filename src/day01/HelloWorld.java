package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// main : 메서드 (method) = 함수(function)
		// ㄴ 실행 담당(콘솔 실행)
//		ctrl + / = 주석 생성
//		ㄴ 한 번 더 누르면 주석 해제
		/* 여러줄 주석
		 * 
		 * java 실행 순서 package > class > method
		 * 
		 * main : 실행을 담당
		 * orintln() : 괄호 안의 값을 콘솔 출력 (줄바꿈 포함)
		 * print() : 괄호 안의 값을 콘솔 출력 (줄바꿈 미포함)
		 * 줄바꿈 사용 시 반드시 "ln"을 사용
		 * 
		 * 항상 마지막 끝처리 > ;
		 * 
		 * 문자 : String 클래스를 사용
		 */
		
		System.out.println(123*45);
		
		/* 숫자 : +, - (부호), 사칙연산 가능
		 * 문자열 : " " (문자는 모두 큰따옴표로 묶기)
		 * 한글자의 문자 : ' ' (작은 따옴표) > char
		 * char : 유니코드 문자를 사용
		 */
		System.out.println("Hello World");
		System.out.println('a');
		
		// = (대입) : 오른쪽의 리터럴 값을 왼쪽의 변수에 넣는다
		int number = 10;
		System.out.println(number);
		System.out.println(number+number);
		
		number = 20;
		
		long asdf = 50000;
		System.out.println(number);
		System.out.print(asdf);
		System.out.println("원");
		
		
		String str = "abc";
		System.out.println(str);
		
		String won = "원";
		System.out.print(asdf);
		System.out.println(won);
		
		//-------------------------
		
		byte b = 20;
		short s = 100;
		long l = 100L; // 접미사 l/L 선택적 사용
		float f = 1.1f; // 접미사 f/F 반드시 사용
		double d = 1.1;
		char ch = 'a'; // 큰따옴표 사용 시 스트링으로 인식하여 사용불가
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
