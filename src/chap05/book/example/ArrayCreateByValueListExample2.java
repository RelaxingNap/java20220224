package chap05.book.example;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 : " + sum1);
		
		int sum2 = add(new int[] {83, 90, 87});	
		// 값 목록으로 배열을 생성함과 동시에 add() 메소드의 매개값으로 사용하고 할때는 반드시 new연산자를 사용해야 한다.
		System.out.println("총합 : " + sum2);
		System.out.println();
	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		return sum;
		//총합을 계산해서 리턴하는 메소드
	}
}
