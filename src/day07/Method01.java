package day07;

public class Method01 {

	// 메서드 작성 위치
	// 두 정수가 주어지면 두 수의 합을 리턴하는 메서드
	// 매개변수 : int a b
	// 메서드명 : sum
	// 리턴타입 : 합, int 
	public int sum(int a, int b) {
		return a + b;
	}
	
	
	// 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	// 매개변수 : int a b
	// 메서드명 : pr
	// 리턴타입 : void (출력하고 말 것이라 "없음")
	public void pr(int a, int b) {
	System.out.println(a+b);
	}
	
	// 매개변수가 없고 return은 있는 케이스
	// 매개변수 : 없음
	// 메서드명 : sum3
	// 리턴타입 : 합, int
	public int sum3() {
		int a = 5;
		int b = 3;
		return a+b;
	}
	
	// 매개변수가 없고 리턴도 없는 케이스
	// 매개변수 : 없음
	// 메서드명 : sum4
	// 리턴타입 : void (없음)
	public void sum4() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// 실행용 메인 메서드
		int num1 = 100;
		int num2 = 80;
		Method01 method = new Method01();
		int sum = method.sum(num1, num2);
		// 객체 생성 후 출력
		System.out.println(sum);
		method.pr(num1, num2); // pr 메서드에서 알아서 내부출력했기에 syso를 할 필요가 없다
		
		int sum1 = method.sum3();
		System.out.println(sum1);
		method.sum4();
		
	}
}
