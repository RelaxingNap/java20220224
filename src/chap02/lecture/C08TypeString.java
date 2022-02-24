package chap02.lecture;

public class C08TypeString {
	public static void main(String[] args) {
		// 문자열 String - 메모리 범위 얼마나 차지하는지 알수 없음
		String var1 = "";
		String var2 = "A";
		String var3 = "hello world";
		String var4 = "hello \tworld";
		String var5 = "I am \"ironman\"";
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
	}
}
