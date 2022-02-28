package chap03.book.example;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자 이군요");
		}
		
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자 이군요");
		}
		
		if(!(charCode < 48) && !(charCode > 57)) {
			System.out.println("0~9사이의 숫자이군요");
		}
		
		int value = 6;
		
		if((value % 2 == 0) | (value % 3 == 0)) {	// 2개의 연산 결과 모두 도출
			System.out.println("2 또는 3의 배수이군요");
		}
		if((value % 2 == 0) || (value % 3 == 0)) {	// 앞의 피연산자가 true이면 뒤의 연산결과를 평가 안함.(shortcut)
			System.out.println("2 또는 3의 배수이군요");
		}
	}
}
