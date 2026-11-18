package day06;

public class Exam02 {

	public static void main(String[] args) {
		// 그림파일만 출력 => (.jpg .png)
		// 없으면 그림파일이 없습니다.
		String[] fileName = { "이것이자바다jpg.java", "java의정석.java", "arry.txt", "array.java", "String.txt",
				"StringMethod.jpg", "ArrayMethod.jpg", "method.png", "javaMethod.png" };

		for (int i = 0; i < fileName.length; i++) {

			int last = fileName[i].lastIndexOf(".") + 1;
			String suffix = fileName[i].substring(last);
//			System.out.println(suffix);

			if (suffix.equals("jpg") || suffix.equals("png")) {

				System.out.println(fileName[i]);
			} else
				continue;
		}
	}
}