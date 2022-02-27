package chap03.lecture.binary;

public class C02Arithmetic {
	public static void main(String[] args) {
		int n1 = 2000000000;
		int n2 = 1000000000;
		
		System.out.println(n1 + n2);// integer가 표현할 수 있는 표현이 넘어감. overflow
		
		int n3 = -2000000000;
		int n4 = -1000000000;
		
		System.out.println(n3 + n4);// integer가 표현하라 수 있는 표현이 넘어감 underflow
		// 해결책 : 표현할 수 있는 범위가 큰 long type을 쓸것
		
		long n5 = 2000000000;
		long n6 = 1000000000;
		
		System.out.println((n5 + n6));
		
		long n7 = -2000000000;
		long n8 = -1000000000;
		
		System.out.println((n7 + n8));
		
	}
}
