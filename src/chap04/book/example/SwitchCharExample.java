package chap04.book.example;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'D';	
		
		switch (grade) {	// switch문의 괄호에는 정수타입 (byte, char, short, int, long)변수나 정수값을 산출하는 연산식이나 String 타입의 변수가 올 수 있다.
			case 'A' :
			case 'a' :
				System.out.println("우수회원입니다.");
				break;
			case 'B' : 
			case 'b' :
				System.out.println("일반회원입니다.");
				break;
			default :
				System.out.println("손님입니다.");
		}
	}

}
