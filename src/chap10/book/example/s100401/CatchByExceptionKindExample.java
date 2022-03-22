package chap10.book.example.s100401;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		// 여러개의 예외처리
		// 여러개의 예외중 한개만 처리
		// 예외가 동시다발적으로 발생하지 않고, 하나의 예외가 발생하면 즉시 실행을 멈추고 catch블록으로 이동하기 때문
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample    num1    num2");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요");
		}
	}
}
