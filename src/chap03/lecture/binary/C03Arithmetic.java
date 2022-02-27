package chap03.lecture.binary;

public class C03Arithmetic {
	public static void main(String[] args) {
		double n1 = 0.1;
		double n2 = 0.2;
		
		double n3 = n1 + n2;
		System.out.println(n3);// 컴퓨터가 이진법을 사용하기 때문에 출력시 미세한 문제가 발생함. (근사치연산)
							   // 해결방법은 각 회사마다 방법이 다름 그래서 그 해결방법을 따라가면 됨.
		
		//무한대 Infinity
		double n4 = 3.14;
		double n5 = 0.0;
		double n6 = n4 / n5;
		System.out.println(n6);
		System.out.println(-n6);
		
		double n7 = n4 % n5;  // Not A Number (NaN)
		System.out.println(n7);
		
		// 정수를 0으로 나눔 -> Exception 발생
		int n8 = 3;
		int n9 = 0;
		
		// int n10 = n8 / n9;	// Exception 발생 후 프로그램 종료. 문법오류가 아니라 의도를 잘못전달한것임.
		
		System.out.println("실행이어짐");
		
	}
}
