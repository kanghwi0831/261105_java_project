package day10;

public class Student {
	// 학생 정보를 관리하기 위한 클래스 생성
	// 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일
	private String name;
	private String number;
	private String address;
	private String birth;
	// 학원 정보 : 학원명(final) = "더조은", 지점
	private final String CLASS = "더조은";
	private String branch;
	// 수강 정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17)
	// 수강과목은 여러과목을 들을 수 있다. 수강과목[5] / 기간[5]
	// 같은 번지는 같은 값으로 인지
	private String[] subject = new String[5];
	private String[] period = new String[5];
	// 멤버변수에 배열이 존재한다면 index 변수를 함께 쓰는것이 편리
	
	
	
	
	

	// 각 정보를 출력하는 메서드
	// ex) 홍길동, 010-1111-1111, 인천, 001123
	public void printStudentInfo() {
		System.out.println("이름 : " + name + " | 전화번호 : " + number + " | 주소 : " + address + " | 생년월일 : " + birth);
	}

	// 더조은, 인천지점
	public void printClassInfo() {
		System.out.println(CLASS + "학원 " + branch + "지점");
	}

	// AI풀스택, 26.11.02 ~ 27.05.17
	// JAVA, 26.10.01 ~ 26.11.01
	// - 수강정보 출력 시 수강정보가 없다면 => "수강정보가 없습니다"
	public void printSubject() {
		if (subject[0] == null) {
			System.out.println("수강정보가 없습니다.");
			return;
		}
		for (int i = 0; i < subject.length; i++) {
			if (subject[i] == null) {
				return;
			} else
				System.out.println("과목 : " + subject[i] + "\t" + "기간 : " + period[i]);
		}
	}
	// 과목을 추가하는 메서드
	private int index;
	public void insertSunject(String subject, String period) {
		if (index == this.subject.length) {
			// 배열 복사 => 늘리기
			String[] subjectTemp = new String[this.subject.length+3];
			String[] periodTemp = new String[this.period.length+3];
			
			// arraycopy
			System.arraycopy(this.subject, 0, subjectTemp, 0, this.subject.length);
			System.arraycopy(this.period, 0, periodTemp, 0, this.period.length);
			
			// 기존 배열의 참조 변수의 객체 덮어쓰기
			this.subject = subjectTemp;
			this.period = periodTemp;
		}
		this.subject[index] = subject;
		this.period[index] = period;
		index++;
	}
	// - 수강과목이 5개를 넘어가면 배열을 늘려서 처리
	public void addSubject(String subject) {
		for (int i = 0; i < this.subject.length; i++) {
			if (this.subject[i] == subject) {
				continue;
			}
			if (i == this.subject.length - 1) {
				this.subject = new String[3];
				continue;
			}
			if (this.subject[i] == null) {
			this.subject[i] = subject;
			return;
			}
		}
	}

	public Student() {
	}

	public Student(String name, String number, String address, String birth, String branch) {
		super(); // 조상의 생성자 호출
		this.name = name;
		this.number = number;
		this.address = address;
		this.birth = birth;
		this.branch = branch;
	}

	// ----------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public String getCLASS() {
		return CLASS;
	}

	public int getIndex() {
		return index;
	}

}
