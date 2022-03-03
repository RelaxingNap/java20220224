package chap04.book.example;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		for(float x = 0.1F; x <= 1.0F; x += 0.1F) {	
			//float타입으로 0.1을 정확하게 표현 못해서 x에 더해지는 실제값은 0.1보다 약간 큼.
			//그래서 총 9번 실행										
			System.out.println(x);
		}
	}
}
