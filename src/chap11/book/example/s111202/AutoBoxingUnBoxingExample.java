package chap11.book.example.s111202;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		//자동 Boxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue());
		
		//대입 시 자동 UnBoxing
		int value = obj;
		System.out.println("value : " + value);
		
		//연산 시 자동 UnBoxing
		int result = obj + 100;	// 더하기 연산은 숫자자료형과 숫자자료형이 만나서 더해지면 기본은 int형으로 변환
		System.out.println("result : " + result);
	}
}