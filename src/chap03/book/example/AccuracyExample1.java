package chap03.book.example;

public class AccuracyExample1 {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - (number*pieceUnit);	//부동소수점타입은 0.1을 정확하게 표현하지 못해서 근사치로 표현함.
													//오차 발생
		
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면");
		System.out.println(result + "조각이 남는다.");
	}
}
