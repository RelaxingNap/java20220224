package chap11.lecture.p01object;

public class App06HashCode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		
		String s1 = new String("java");
		String s2 = new String("java");
		
		System.out.println(s1.hashCode());	// String 클래스에서는 문자열 기준으로 해쉬코드를 계산
		System.out.println(s2.hashCode());	// 그래서 같은 해시값을 가지게됨.
	}
}
