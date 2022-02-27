package chap03.lecture.binary;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4 = " + result4);
		
//		'A' == 65 -> true;
//		3 == 3.0 -> true;
//		
//		0.1 == 0.1f -> false;	0.1을 정확히 표현하지 못하기 때문에 근사값이 나와서 false가 나옴
	}
}
