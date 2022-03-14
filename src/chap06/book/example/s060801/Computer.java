package chap06.book.example.s060801;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
	
	int sum2(int...values) {	// 매개변수 타입이 배열이므로 처리내용이 같아짐.
		int sum = 0; 
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum;
	}
}
