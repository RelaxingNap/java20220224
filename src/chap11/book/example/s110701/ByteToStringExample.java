package chap11.book.example.s110701;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		String str1 = new String(bytes);
		System.out.println(str1);	// unicode로 입력된 알파벳 출력
		
		String str2 = new String(bytes, 6, 4);	// byte배열 74부터 4개의 unicode를 받아 출력
		System.out.println(str2);
		
		
	}
}
