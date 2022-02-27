package chap02.book;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;	// byte -> int 자동 type변환
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; 	// char -> int 자동 type변환
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue;	// int -> long 자동 type변환
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	// int -> double 자동type변환
		System.out.println(doubleValue);
		
		
		//작은 datatype에서 큰datatype으로는 자동 형변환이 이루어짐.
		//단, char는 같은 2byte크기인 short으로는 자동형변환 이루어지지 않음.
		//short shortValue = charValue;
		//char은 양수범위에서만 표현하고, short은 음수와 양수 모두 표현하기 때문에 서로 표현할 수 있는 data의 범위를 포함하지 않음.
		
		
	}
}
