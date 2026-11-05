package day01;

public class Exam01 {

	public static void main(String[] args) {
		// % : 나눈 나머지를 나타내는 연사자 / 삼항연산자
		// 문제 : number 의 수가 짝수인지 홀수인지 출력
		
		// 숫자를 나눴을 때 나머지가 있으면 홀수
		
		int number = 15152;
	
		String j = (number%2 ==0) ? "짝수" : "홀수";
		
		System.out.println(j);
		

	}

}
