package day11;

public class Method07 {

	public int sum(int... num) {
		// ...num => 배열로 인식
		int result = 0;
		for (int tmp : num) {
			result += tmp;
		}
		return result;
	}

	public static void main(String[] args) {
		// 가변인자 메서드
		// - 매개변수의 갯수가 고정되어 있지 않을 경우 (... 으로 사용한다)

		Method07 m = new Method07();
		System.out.println(m.sum(1, 2, 3, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9));
	}

}
