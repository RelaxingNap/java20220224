package chap06.book.example.s060803;

public class Calculator {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);	//객체 내부에서는 method를 그냥 사용
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("실행결과 : " + result);
		
	}

	void println(String message) {
		System.out.println(message);
		
	}

}
