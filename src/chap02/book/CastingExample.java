package chap02.book;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);	// 소수점 이하자리는 값의 손실 발생.
		// 강제타입변환시 사용자로부터 입력받은 값을 변환할 때, 값의 손실이 발생하면 안된다.
		// 따라서, 강제타입변환을 하기전에 값이 안전하게 보존 될 수 있는지 검사하는것이 좋다.
		
		
	}
}
