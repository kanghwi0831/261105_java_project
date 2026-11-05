package day02;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		// Math 클래스 : 수학과 관련된 기능을 제공하는 클래스
		// Math.round(값) : 반올림 (정수로 반올림 => 소수 자릿수가 0이된다)
		// Math.floor(값) : 버림 (소수 자릿수 0)
		// Math.ceil (값) : 올림 (소수 자릿수 0)
		
		// Math.random() : 0~1사이의 아무숫자(소수가 된다) => double 이겠죠
		
		double number = 3.14159;
		
		long pi = Math.round(number);  // 리턴값은 long
		System.out.println(pi);
		
		// 실수의 기본자료형 = double, 정수의 기본자료형 = int
		// 일반적인 사용법 => 형변환을 사용하여 정수로 쓴다
		int r = (int)Math.round(number);
		
		// floor()
		int fn = (int)Math.floor(number);  // 리턴값은 double이라 int로 형변환
		
		int cn = (int)Math.ceil(number);  // ceil을 쓰는데 자바가 굳이 더블로 리턴해준대서 직접 int로 형변환
		
		// Math.random() 얘도 리턴값이 더블이다
		double ran = Math.random()*10;     // random() 뒤에 곱하기10 을 붙여 소수점이 한 칸 당겨진다
		System.out.println(ran);
		
		// 0 ~ 9 까지의 한자리를 랜덤 선택하고싶다
		int random = (int)(Math.random()*10); // 소수점을 지우고 나타내고 싶다. int로 형변환하고 괄호를 넣어 곱하기 우선시키기
		System.out.println(random);
		
		// 1 ~ 10 한자리를 랜덤 선택
		int asdf = (int)(Math.random()*10);
		System.out.println(asdf);
		
		// 원하는 수만큼 랜덤으로 하고싶다면
		// (int)Math.random()*count) + start
		
		// 예시) 주사위 값 1~6까지만 하고싶다면
		// (int)(Math.random()*6)+1 이 된다
		System.out.println("주사위 굴리기");
		System.out.println((int)(Math.random()*6)+1);
		
		// 로또 1 ~ 45까지의 수를 굴리고 싶다
		// (int)(Math.random()*45)+1
		
		// Random() 클래스 new 키워드
		Random ex = new Random();
		  // int 자료형으로 랜덤 값을 리턴한다
		// random.nextInt(카운트) + start
		System.out.println(ex.nextInt(10));  // 0을 안쓰고 1부터 쓰고싶다면 +1 사용할것 ex.nextInt(10)+1
		
		// Math.max(값1, 값2)   /  Math.min(값1, 값2)
		System.out.println(Math.max(0, 500));   // max = 둘 중에 뭐가 큰지 입력해줘    = 500
		System.out.println(Math.min(0, 100));   // min = 둘 중에 뭐가 작은지 입력해줘   = 0
		
		
		

	}

}
