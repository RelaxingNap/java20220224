package chap02.book;

public class FromIntToDouble {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;	// 이렇게 선언해야 data손실없이 안전하게 형변환가능.
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
	}
}
