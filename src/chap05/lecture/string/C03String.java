package chap05.lecture.string;

public class C03String {
	public static void main(String[] args) {
		String s1 = "spring";
		String s2 = "java";
		String s3 = "우크라이나";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		
		// charAt(int) : 파라미터로 받은 인덱스의 문자(char) 리턴
		
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(0));
		System.out.println(s3.charAt(0));
		
		System.out.println(s1.charAt(s1.length() - 1));
		System.out.println(s2.charAt(s2.length() - 1));
		System.out.println(s3.charAt(s3.length() - 1));
		
		// equals(Object) : 파라미터로 받은 객체와 이 객체의 문자열을 비교한다.
		//					같으면 true, 틀리면 false
		String s4 = "spr";
		String s5 = "ing";
		String s6 = s4 + s5;
		System.out.println(s1);	// spring
		System.out.println(s6);	// spring
		System.out.println(s1 == s6);	// false
		System.out.println(s1.equals(s6));	// true
		
		// indexOf(String) : 파라미터로 받은 문자열이 처음 발견된 위치(index)를 리턴
		String s7 = "이 책을 통해 무엇을 배울 수 있죠";
		System.out.println(s7.indexOf("책을"));
		System.out.println(s7.indexOf("을"));
		System.out.println(s7.indexOf("java"));	// 문자가 발견 안되면 -1 리턴
		
		// substring(int, int) : 이 문자열의 부분 문자열을 리턴한다.
		System.out.println(s7.substring(8, 11));	// 무엇을
		System.out.println(s7.substring(12, 16));	// 배울 수	
		
		// substing(int) : 이 문자열의 부분 문자열을 리턴한다. 들어간 시작부분부터 끝까지 리턴
		System.out.println(s7.substring(8));
		System.out.println(s7.substring(12));
		
		
		
	}
}
