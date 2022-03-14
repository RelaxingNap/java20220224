package chap06.book.example.s060801;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);	// byte타입은 integer타입으로 강제형변환가능
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();

	}

}