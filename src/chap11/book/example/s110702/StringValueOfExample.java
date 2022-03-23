package chap11.book.example.s110702;

public class StringValueOfExample {
	public static void main(String[] args) {
		// valueof는 기본타입값을 문자열로 변환
		
		String str1 = String.valueOf(10);	// int를 String으로 변환
		String str2 = String.valueOf(10.5); // double을 String으로 변환
		String str3 = String.valueOf(true); // boolean을 String으로 변환
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
