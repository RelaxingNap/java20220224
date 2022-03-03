package chap04.lecture.scanner;

import java.util.Scanner;

public class C04Scanner {
	public static void main(String[] args) {
		String str = "3 4 33 88";
		
		Scanner scanner = new Scanner(str);
		int num1 = scanner.nextInt();	//String을 읽어서 띄어쓰기 전까지의 숫자String을 Integer로 변환
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println(num1 + num2 + num3 + num4);
		
		scanner.close();
		
	}
}
