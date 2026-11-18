package day05;

public class String01 {

	public static void main(String[] args) {
		// String class : 문자열을 다루기 위한 클래스 => 참조 자료형
		// class : 해당 기능을 가지고 있는 정의서
		// 클래스 타입 객채명 = new 클래스타입(값);
		// String은 워낙 자주쓰는 클래스라서 기본 자료형처럼 제공 (new를 안써도 됨)
		// String str = new String();  // 가능하지만 잘 쓰지 않는다
		
		String str = "abc d efg h";  // 1.a 2.b 3.c 4. 5.d 6.e ...등 띄어쓰기도 한 글자로 친다
		// string은 한 문자열을 배열로 넣었다 생각
		// length : 총길이
		System.out.println(str.length());  // 공백 포함해서 11글자가 된다
		
		// 배열처럼 index를 가짐 => 0부터 시작
		// charAt(index) : index 번지에 있는 문자를 반환 => (리턴값은 char)
		System.out.println("--charAt()--");
		System.out.println(str.charAt(3));  // 3번지에 있는 공백이 출력된다
		
		// substring : 원하는 문자를 추출
		System.out.println("--substring--");
		System.out.println(str.substring(6));  // substring 시작값만 주면 거기서부터 끝까지 출력
		System.out.println(str.substring(6, 8)); // endindex 전까지 출력된다 (8번은 주지않음) 항상 마지막은 미포함
		
		// equals() : 두 문자가 같은 값인지 비교(대소문자 구분)
		// 참조 자료형에서 == 는 주소가 같은지 비교
		// equals는 true / false로 리턴한다
		System.out.println("--equals()--");
		System.out.println(str.equals("abc"));  // false
		System.out.println(str.substring(0,3).equals("abc")); // true
		System.out.println("abc".equals(str.subSequence(0, 3))); // true 위와 같은 결과
		
		// indexOf() : 문자의 위치(index)를 찾아주는 기능
		// 한 문자열에 같은 단어가 여러개라면 처음 일치하는 index를 리턴
		// 찾는 문자가 없다면 -1을 리턴
		// 시작 위치를 정할 수도 있음.
		str = "abc h abc d";
		System.out.println("--indexOf--");
		System.out.println(str.indexOf("abc"));  // 앞에서부터 "abc"가 들어있는 번지를 찾아라
		System.out.println(str.indexOf("abc", 3)); // 3번지 이상부터 "abc"가 들어있는 번지를 찾아라
		
		// lastIndexOf() : 뒤에서부터 찾음.
		System.out.println(str.lastIndexOf("c"));  // 뒤에서부터 'c'를 찾기에 8(번지)가 나온다
		
		// email에서 id만 추출
		String email = "abcdefg@gmail.com";
		System.out.println(email.substring(0, email.indexOf("@")));
		// email에서 @이후 닷컴을 찾으려면?
		System.out.println(email.substring(email.indexOf("@")+1));
		
		// compareTo() : str.compareTo("str2")
		// 사전순(국어사전, 영어사전 등)으로 기준값(str)이 비교값(str2)보다 앞에 있으면 -, 같으면 0, 뒤에 있으면 +
		// 문자정렬시 사용
		System.out.println("--compareTo--");
		System.out.println("a".compareTo("c"));
		
		// contains() : 해당 문자가 있는 지 없는 지 확인 true / false
		System.out.println("--contains--");
		System.out.println(str.contains("abc")); // str 문자열 중에 "abc" 가 있는지?
		
		// concat : 이어붙이기 (+ 연결연산자와 같은 의미)
		System.out.println("--concat--");
		System.out.println("abc".concat("def")); // "abc" 뒤에 "def" 를 붙여줘
		System.out.println("abc"+"def");  // 같은 의미다
	}

}
