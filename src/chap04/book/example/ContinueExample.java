package chap04.book.example;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {	// 홀수인 경우 
				continue;		// 건너뜀
			}
			System.out.println(i);	// 짝수인 경우 출력
		}
	}
}
