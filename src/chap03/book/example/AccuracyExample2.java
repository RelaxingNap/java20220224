package chap03.book.example;

public class AccuracyExample2 {
	public static void main(String[] args) {
		int apple = 1;
		
		int totalPiece = apple * 10;	//정확한 계산을 위해 정수연산으로 변환한 뒤 다시 계산
		int number = 7;
		int temp = totalPiece - number;
		
		double result = temp / 10.0;
		System.out.println("사과 한개에서");
		System.out.println("0.7조각을 빼면");
		System.out.println(result + "조각이 남는다.");
		
	}
}
