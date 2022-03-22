package chap10.book.example.s100203;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		//숫자로 변환할 수 없는 문자가 포함되어있는경우 발생
		String data1 = "100";
		String data2 = "s1000";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);	// NumberFormatException발생
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}
}
