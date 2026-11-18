package day10;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Student s = new Student();
		String[] subject = new String[5];
//		subject[0] = "AI풀스택";
//		subject[1] = "JAVA";
		String[] period = new String[5];
//		period[0] = "26.11.02 ~ 27.05.17";
//		period[1] = "26.10.01 ~ 26.11.01";
		// 학생 정보를 관리하기 위한 클래스 생성
		// 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일
//		System.out.print("학생 이름 : ");
//		String name = scan.next();
//		System.out.print(name + "학생 전화번호 : ");
//		String number = scan.next();
//		System.out.print(name + "학생 주소 : ");
//		String address = scan.next();
//		System.out.print(name + "학생 생년월일 : ");
//		String birth = scan.next();
//		// 학원 정보 : 학원명(final) = "더조은", 지점
//		System.out.print(s.getCLASS() + "학원 지점 : ");
//		String branch = scan.next();
		// 수강 정보 : 수강과목[], 기간[](26.11.02 ~ 27.05.17)
//		for (int i = 0; i < subject.length; i++) {
//			System.out.print("과목명 : ");
//			subject[i] = scan.next();
//			System.out.print("기간 : ");
//			period[i] = scan.next();
//		}
		Student studentInfo = new Student("가", "010-1234-5678", "인천", "990831", "부평");
		Student studentInfo2 = new Student("나", "010-1234-5678", "부천", "990831", "중동");
		Student studentInfo3 = new Student("다", "010-1234-5678", "시흥", "990831", "능곡");
		Student studentInfo4 = new Student("라", "010-1234-5678", "인천", "990831", "부평");
		Student studentInfo5 = new Student("마", "010-1234-5678", "인천", "990831", "부평");
		Student studentInfo6 = new Student("바", "010-1234-5678", "안산", "990831", "중앙");
		studentInfo.insertSunject("AI풀스택", "26.11.02 ~ 27.05.17");
		studentInfo.insertSunject("JAVA", "26.10.01 ~ 26.11.01");
		studentInfo2.insertSunject("AI풀스택", "26.11.02 ~ 27.05.17");
		studentInfo2.insertSunject("JAVA", "26.10.01 ~ 26.11.01");
		studentInfo3.insertSunject("AI풀스택", "26.11.02 ~ 27.05.17");
		studentInfo3.insertSunject("JAVA", "26.10.01 ~ 26.11.01");

		Student[] student = new Student[6];
		student[0] = studentInfo;
		student[1] = studentInfo2;
		student[2] = studentInfo3;
		student[3] = studentInfo4;
		student[4] = studentInfo5;
		student[5] = studentInfo6;

//		for (int i = 0; i < student.length; i++) {
//			student[i].printStudentInfo();
//			student[i].printClassInfo();
//			student[i].printSubject();
//		}

		// 인천사는 학생만 출력 - 학원정보, 학생정보
		for (int i = 0; i < student.length; i++) {
			if (student[i].getAddress().equals("인천")) {
				student[i].printStudentInfo();
				student[i].printClassInfo();
			}
		}

		// AI풀스택 과정을 수강하는 학생만 출력 - 학생정보, 수강정보
//		for (int i = 0; i < student.length; i++) {
//			if (student[i].getSubject().equals("JAVA")) {
//				student[i].printStudentInfo();
//				student[i].printSubject();
//			}
//		}
		int cnt = 0;
		while(cnt < student.length) {
			for(int i = 0; i < student[cnt].getIndex(); i++) {
				if (student[cnt].getSubject()[i].equals("AI풀스택")) {
					student[cnt].printStudentInfo();
					student[cnt].printSubject();
				}
			}
			cnt++;
			
		}

//		studentInfo.printStudentInfo();
//		studentInfo.printClassInfo();
//		studentInfo.printSubject();

		// 수강과목은 여러과목을 들을 수 있다. 수강과목[5] / 기간[5]
		// 같은 번지는 같은 값으로 인지
		// ex) 홍길동, 010-1111-1111, 인천, 001123
		// 더조은, 인천지점
		// AI풀스택, 26.11.02 ~ 27.05.17
		// JAVA, 26.10.01 ~ 26.11.01
		// 과목을 추가하는 메서드
		// - 수강과목이 5개를 넘어가면 배열을 늘려서 처리
		// 각 정보를 출력하는 메서드
		// - 수강정보 출력 시 수강정보가 없다면 => "수강정보가 없습니다"

		scan.close();
	}

}
