package day01;

public class Operator {

	public static void main(String[] args) {
		// 연산자
		/* 대입연산자 : = 오른쪽에 있는 리터럴 값을 왼쪽의 변수에 저장
		 * a = b : b 변수의 값을 a 변수로 덮어쓰기 (대입, 저장)
		 * 왼쪽은 반드시 변수여야함
		 * ex) a = 10 가능 / 10 = a 불가능
		 */
		int a = 10;
		int b = 20;
		a = 30; // a에 들어있던 10은 사라진다
		a = b + 10; // a값은 b+10이 된다
		System.out.println(a);
		// 10 = a; 는 왼쪽이 변수가 아니기에 에러발생
		
		// 문자 연결 : +
		System.out.println("a = "+a); // 연산의 결과는 문자가 들어있었기에 String 이다
		
		// 산술연산자 : + - * / %(나머지)
		System.out.println(4+3);
		System.out.println(1-3);
		System.out.println(4*3);
		System.out.println(4/3);
		System.out.println(4%3);
		
		/* 나누기
		 * 정수 / 정수로 나누면 정수로만 나온다(소수점 버림)
		 * 정수 / 실수 = 실수
		 * 실수 / 정수 = 실수
		 * 실수 / 실수 = 실수
		 */
		System.out.println(4/3.0);
		
		// 자료형 변환 casting 사용법 : (자료형)변수
		System.out.println((double)a/b);
		
		// ==(같다), !=(같지않다), >(초과), <(미만), >=(이상), <=(이하)
		// 비교연산의 결과는 항상 true / false
		System.out.println(a>b);
		System.out.println(a==b);
		
		// 논리연산자 : !(not), &&(and) ||(or)
		System.out.println(!(a==b)); // !(not)을 넣었으니 이 결과를 반대로 입력해줘
		// &&(and) : 모든 조건이 참이여야 참
		// ||(or) : 하나만 참이여도 참
		System.out.println((1<3) && (3>4));
		System.out.println((1<3) || (3>4));
		
		// 삼항연산자 (조건선택연산자)
		// 조건식 ? true : false
		System.out.println(a==b ? "a와 b가 같습니다." : "a와 b는 다릅니다.");
		
		// 증감연산자 : ++(1씩증가), --(1씩감소)
		System.out.println(a); // 30
		a++; // 31
		System.out.println(a); // 31
		a--; // 30
		System.out.println(a); // 30
		System.out.println(a++); // 30 출력 후 1 증가
		// a = 31
		System.out.println(a);
		// 증가 후 1을 출력하고 싶다면?
		System.out.println(++a); // 32
		
		a = a + 2;
		System.out.println(a); // 34
		++a; // 증가 우선
		a++; // 나중 증가
		
		// 복합연산자 : +=, -=
		a += 2; // a = a + 2
		
		a = b + 2;
		
		

	}

}
