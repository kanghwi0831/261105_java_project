package day03;

import java.util.Scanner;

public class Dowhile01 {

	public static void main(String[] args) {
		// 반복문
		// do{ 실행문; }while(조건식);
		// 실행문을 먼저 실행하고 조건식을 나중에 비교한다
		// for, while : 조건식이 맞지 않으면 한 번도 실행을 못할 수 있다
		// do~while : 반드시 1번은 실행한다
		
		int i = 1;
		do {
			System.out.println("실행문 실행");
			i++;
		}while(i <= 5);
		
		// 한글자를 입력받아 출력 / 입력형식 : char
		// y 를 입력하면 종료
		Scanner scan = new Scanner(System.in);
		String str = new String();
		char ch = ' ';
		
		do {
		System.out.println("글자를 입력하세요");
		
		ch = scan.next().charAt(0);
		
		System.out.println(ch);
		} while (ch != 'y'); {
			
			}
		}
	
	
		
	
			
	
		
		
		

	}

