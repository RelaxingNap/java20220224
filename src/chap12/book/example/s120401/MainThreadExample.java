package chap12.book.example.s120401;

public class MainThreadExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);
		user1.start();	// 계산기 메모리 100으로 세팅하고 사용중임.
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);
		user2.start();	// 사용중에 끼어들어서 계산기 메모리 100으로 세팅한것을 50으로 바꾸어서 문제 생김
		// 문제 해결을 위해 스레드가 사용중인 객체를 다른 스레드가 변경할 수 없도록 해야함.
	}
}
