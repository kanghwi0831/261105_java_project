package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색어를 포함하는 파일이 없다면 => "일치하는 항목이 없습니다"

		Scanner scan = new Scanner(System.in);
		String[] fileName = { "이것이자바다.java", "java의정석.java", "arry.txt",
				"array.java", "String.txt", "StringMethod.jpg",
				"ArrayMethod.jpg", "method.png", "javaMethod.png" };

		int count = 0;
		System.out.print("검색 : ");
		String search = scan.next();
		String lowerSearch = search.toLowerCase();
		scan.close();

		for (int i = 0; i < fileName.length; i++) {
			String lowerFileName = fileName[i].toLowerCase();

			if (lowerFileName.contains(lowerSearch)) {
				System.out.println(fileName[i]);
				count++;
			}
		}
		if (count <= 0) {
			System.out.println("일치하는 항목이 없습니다.");
		}
	}
}
