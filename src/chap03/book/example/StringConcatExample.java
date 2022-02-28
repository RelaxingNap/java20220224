package chap03.book.example;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 = "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";	// 왼쪽부터 먼저 계산이라 숫자 더하기 연산이 됨.
		System.out.println(str3);
		System.out.println(str4);
	}
}
