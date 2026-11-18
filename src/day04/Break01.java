package day04;

public class Break01 {

	public static void main(String[] args) {
		// break : 반복문을 빠져나오는 키워드
		// 조건문(if)을 동반하여 조건이 맞을 때 빠져나오도록 설계
		
		// continue : 패스, 스킵 개념
		
		// return : 메서드를 빠져나온다. 예시 => public static void main(String[] args) {
		// 리턴이 들어있는 메인 메서드를 빠져나오게 만든다.

		for(int i = 1; i <= 10; i++) {   // 5까지 출력하고 중지
			
			System.out.println(i);
			
			if (i == 5) {
				break;
			}
		}
		
		for(int i = 1; i <= 10; i++) {   // 짝수만 보게 홀수는 생략해줘
			
			if (i%2==1) {
				continue;
			}
			System.out.println(i);
			}
		
		// 반복문이 중첩적으로 있을 때 break 나를 감싸고 있는 가장 안쪽의 반복문'만' 벗어난다.
		// 반복문에 이름을 부여할 수 있다.
		// break 이름; 으로 원하는 반복문을 벗어나게 할 수 있다.
		int i=0, j=0, k=0;
		a : for(;;) {
			i++;
			for(;;) {
				j++;
				for(;;) {
					k++;
					System.out.println("I : " + i + ", J : " + j + ", K : " + k);
					if(k==10) {
						break a;
					}
				}
			}
		}
		System.out.println("");
		
	}

}
