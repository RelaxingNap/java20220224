package chap06.book.example.s061002;

public class CalculatorExample {
	public static void main(String[] args) {
		//원칙적으로는 static필드와 static메소드는 클래스이름으로 접근해야 함.
		//하지만 객체참조변수로도 접근 가능함.
		double result1 = 10 * 10 * Calculator.pi;
		int result2 = Calculator.plus(10, 5);	
		int result3 = Calculator.minus(10, 5);
		
//		Calculator myCalcu = new Calculator();
//		double result1 = 10 * 10 * myCalcu.pi;
//		int result2 = myCalcu.plus(10, 5);	
//		int result3 = myCalcu.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
	}

}
