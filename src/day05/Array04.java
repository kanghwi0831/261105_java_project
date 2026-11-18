package day05;

public class Array04 {

	public static void main(String[] args) {
		// 임의로 배열값 지정
		int arr[] = {2401,42014,512,201,2042,510,506,347,3047,3405,2305,536,2757,27,46,634,60};
		
		// 합계와 평균 출력
		int sum = 0;
		
		int max = arr[0];
		double min = arr[0];
		
		for (int i = 0; i <= arr.length-1; i++) {
			sum += arr[i];
			// 가장 큰 값, 가장 작은 값
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / arr.length);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		// Math.max(a, b) 활용
		System.out.println("----Math Class 활용----");
		max = arr[0];
		min = arr[0];
		for (int i = 0; i <= arr.length-1; i++) {
				max = Math.max(arr[i], max);
				min = Math.min(arr[i], min);			
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		}
		
		

	}
