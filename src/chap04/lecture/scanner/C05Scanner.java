package chap04.lecture.scanner;

import java.util.Scanner;

public class C05Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 값 > ");
		int num1 = scanner.nextInt();
		
		System.out.println("두번째 값 > ");
		int num2 = scanner.nextInt();
		
		System.out.print("새 문자열 > ");	// 문자열 구분은 공백문자로 구분함
		String str = scanner.nextLine();	// 문제 발생 : 새 문자열 출력 후 바로 enter를 만나서 빈 문자열이 str에 들어가게 됨.
		
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(str);
		
		scanner.close();
		
	}

}
