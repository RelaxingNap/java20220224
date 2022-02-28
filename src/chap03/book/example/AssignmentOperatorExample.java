package chap03.book.example;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;	// 대입연산자 사용
		result += 10;	
		System.out.println("result = " + result);
		
		result -= 5;
		System.out.println("result = " + result);
		
		result *= 3;
		System.out.println("result = " + result);
		
		result /= 5;
		System.out.println("result = " + result);
		
		result %= 3;
		System.out.println("result = " + result);
		
	}
}
