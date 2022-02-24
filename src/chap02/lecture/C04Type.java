package chap02.lecture;

public class C04Type {
	public static void main(String[] args) {
		double v1 = 3.14;	// type에 맞게 변수값을 넣을 수 있음
		//int v2 = 3.14;	X
		
		// 데이터 타입(자료형)
		// 기본타입(primitive) 8개
		// 정수 
		// byte, short, int, long
		
		// 실수
		// float, double
		
		// 논리
		// boolean
		
		// 문자(정수)
		// char
		
		// 참조형 (reference type) 위 8개빼고 다
		// chapter5에서 설명
		
		/////////////////////////////////////////////////////
		
		// 정수 (byte(1), short(2), int(4), long(8))
		
		int val1 = 30;
		int val2 = 2147483647;
		int val3 = -2147483648;
		
		short val4 = 32767;
		short val5 = -32768;
		
		byte val6 = 127;
		byte val7 = -128;
		
		System.out.println(val2 + 1);
		
		long val8 =	9223372036854775807L;	// integer 범위보다 큰 literal은 끝에 L(l)을 붙여야함.
		System.out.println(val8);
		
		long val9 = -9223372036854775808L;
		System.out.println(val9);
		
		//큰 정수 사용 시 _ 조합 가능.
		int val10 = 21_3864_1234;
		System.out.println(val10);
		int val11 = 2_138_761_234;
		System.out.println(val11);
	}
}
