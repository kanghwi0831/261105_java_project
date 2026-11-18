package day11;

public class Class06 {

	public static void main(String[] args) {
		// 객체를 생성할 때 값을 초기화 하는 방법
		// - 기본값, 명시적 초기값, 초기화 블럭, 생성자

		// 1. 기본값 : 멤버변수를 선언하면 컴파일러가 기본적으로 주는 값
		// 정수 = 0, 객체 = null, boolean = false
		// 2. 명시적 초기값 : 내가 직접 값을 명시해주는 값
		// brand = "LG";
		// 3. 초기화 블럭 : 중괄호 안에 초기값을 지정.
		// { 초기값 지정 } => 내 멤버변수를 초기화
		// 4. 생성자 : 객체를 생성할 때 호출하여 초기값을 지정
		// new 객체 생성시 딱 1번만 호출

		// 초기값 우선순위
		// 기본값 < 명시적 초기값 < 초기화 블럭 < 생성자(가장 우선순위가 높다)

		Student s = new Student("홍길동");
		System.out.println(s);
	}

}

class Student {
	private String gigum = "부평"; // 내가 직접 값을 넣어서 명시적 초기값.
	private String name;
	private int age;
	private String birth;
	{
		// 초기화 블럭 영역
		this.name = "미상";
		this.age = 20;
		this.birth = "없음";
	}

	public Student(String name) { // 생성자
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [gigum=" + gigum + ", name=" + name + ", age=" + age + ", birth=" + birth + "]";
	}

}
