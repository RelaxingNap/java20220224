package chap03.lecture.binary;

public class InputDataCheckNaNExample {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);	
		
		double currentBalance = 10000.0;
//		
//		currentBalance += val;		//NaN은 산술연산이 가능해서 데이터가 엉망이 될 수 있음.
//		System.out.println(currentBalance);
		
		if(Double.isNaN(val)) {
			System.out.println("NaN값이 입력되어 처리할 수 없음");
			val = 0.0;
		} 
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
