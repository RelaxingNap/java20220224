package chap04.book.example;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 91;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}
}
