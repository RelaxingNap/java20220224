package chap04.book.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("선택 > ");
			
			String menu = scanner.nextLine(); 	
			if (menu.equals("1")) {
				System.out.print("예금액 > ");
				//balance += scanner.nextInt(); // 개행문자인 "\n"를 제거하지 않음. 
				//scanner.nextLine();		// 개행문자 "\n"인 enter값 없애줌.
				//balance += Integer.parseInt(scanner.nextLine());
				balance += Integer.valueOf(scanner.nextLine());
				continue;
			} else if(menu.equals("2")) {
				System.out.print("출금액 > ");
				//balance -= scanner.nextInt();
				//scanner.nextLine();		
				//balance -= Integer.parseInt(scanner.nextLine());
				balance -= Integer.valueOf(scanner.nextLine());
				continue;
			} else if(menu.equals("3")) {
				System.out.print("잔고 > ");
				System.out.println(balance);	
				continue;
			} else if(menu.equals("4")) {
				System.out.println();
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		scanner.close();
	}
}
