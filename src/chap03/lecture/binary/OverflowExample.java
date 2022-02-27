package chap03.lecture.binary;

public class OverflowExample {
	public static void main(String[] args) {
//		int x = 1000000;
//		int y = 1000000;
//		
//		int z = x * y;
//		System.out.println(z);
		//int형이 표현할 수 있는 정수값을 넘어버림. 그래서 이상한값이 나옴.
		
		long x = 1000000;
		long y = 1000000;
		
		long z = x * y;
		System.out.println(z);
		
	}
}
