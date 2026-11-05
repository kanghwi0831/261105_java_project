package day02;

import java.util.Scanner;

public class Input_01 {

	public static void main(String[] args) {
		// Input class
		// console input : 콘솔에서 값을 입력받는 것
		// Scanner 클래스 : 입력받는 값의 형식 변환을 편리하게 해주는 클래스
		// 클래스는 객체를 생성해야 사용할 수 있다. => 사용하려면 new 키워드를 사용
		
		// 기본 자료형 8개는 타입, 변수명 = 값; (ex : int number = 1;)
		// 클래스 자료형은 클래스명, 객체명 = new 클래스명() or (값) < 값은 넣어도 되는것과 안넣어도 되는것이 있다
		
		Scanner sc = new Scanner(System.in);
		
		// 입력을 받을 때 sc.메서드
		// sc.next() : 한 문자만 입력(한단어), 띄어쓰기를 포함하지 않는 단어 => String
		// sc.nextLine() : 여러 단어를 입력, 띄어쓰기 포함 => String
		// sc.nextInt() : 정수 입력 => int
		// sc.next자료형() : 해당 자료형으로 입력 => 자료형  (ex : sc.nextDouble() )
		
		System.out.println("이름을 입력해주세요 > ");
		String name = sc.next();
		System.out.println("이름: "+name);
		
		// 나머지 데이터를 버리는 작업
		sc.nextLine();  // 잘못 입력했을 때 에러없이 다음으로 넘어가고 싶을 때 걸어두는 쓰레기통 작업
		
		System.out.println("숫자를 입력해주세요 > ");
		double num = sc.nextDouble();

		System.out.println("숫자: "+num);
	
		// 숫자를 입력받아 짝수인지 홀수인지 출력
		double a = num%2;
		
		if ( a == 1 ) {
			System.out.println("홀수입니다.");
		}	else if ( a == 0 ) {
			System.out.println("짝수입니다.");	
			} else {
				System.out.println("숫자를 다시 입력해주세요.");
		}
		
		// char : 아스키 코드의 한글자 입력
		// sc.next().charAt( 위치(0) ) : 입력받은 단어의 첫글자만 아스키 코드로 변환하여 char로 리턴
		// 항상 모든 시작위치는 0부터다
		System.out.println("한 글자만 입력해주세요 > ");
		char ch = sc.next().charAt(0);
		System.out.println("입력받은 글자 > " + ch);
		
		
		sc.close();

	}

}
