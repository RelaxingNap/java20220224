package chap10.lecture.p01exception;

public class App01 {
	// NullpointerException
	public static void main(String[] args) {
		String s = "java";
		System.out.println(s.length());
		
		String t = null;
		System.out.println(t.length());
		
		System.out.println("프로그램 계속 실행.....");
		
	}
}
