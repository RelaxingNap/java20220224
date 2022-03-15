package chap06.book.exercise.p20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int cnt = 0;
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			scanner.nextLine();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
	private static void createAccount() {
		System.out.println("--------");
		System.out.println("계좌생성");
		System.out.println("--------");
		Account temp = new Account("","",0);
		
		System.out.print("계좌번호 : ");
		temp.setAno(scanner.nextLine());
		System.out.print("계좌주 : ");
		temp.setOwner(scanner.nextLine());
		System.out.print("초기입금액 : ");
		temp.setBalance(scanner.nextInt());
		
		if(cnt <= 100) {
			accountArray[cnt++] = temp;	
		}
	}
	
	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록");
		System.out.println("--------");
		
		for (int i = 0; i < cnt; i++) {
			System.out.print(accountArray[i].getAno());
			System.out.print("\t");
			System.out.print(accountArray[i].getOwner());
			System.out.print("\t");
			System.out.print(accountArray[i].getBalance());
			System.out.println();
		}
	}
	
	private static void deposit() {
		String temp1 = "";
		int temp2 = 0;
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		temp1 = scanner.nextLine();
		System.out.print("예금액 : ");
		temp2 = scanner.nextInt();
		
		findAccount(temp1).setBalance(findAccount(temp1).getBalance() + temp2);
		
		System.out.println("결과 : 예금이 성공되었습니다.");
	}
	
	private static void withdraw() {
		String temp1 = "";
		int temp2 = 0;
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호 : ");
		temp1 = scanner.nextLine();
		System.out.print("출금액 : ");
		temp2 = scanner.nextInt();
		
		if(findAccount(temp1).getBalance() - temp2 > 0) {
			findAccount(temp1).setBalance(findAccount(temp1).getBalance() - temp2);
			System.out.println("결과 : 출금이 성공되었습니다.");			
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}
	
	private static Account findAccount(String ano) {
		
		int temp = 0;
		for (int i = 0; i < accountArray.length; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				temp = i;
				break;
			}
		}
		
		return accountArray[temp];
		
	}
}


