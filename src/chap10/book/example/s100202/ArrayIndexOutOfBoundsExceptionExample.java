package chap10.book.example.s100202;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		//배열에서 인덱스 범위를 초과하여 사용할 경우 발생
		
//		String data1 = args[0];
//		String data2 = args[1];
//		
//		System.out.println("args[0] : " + data1);
//		System.out.println("args[1] : " + data2);
		
		// 배열값 읽기전에 배열길이를 먼저체크
		
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] : " + data1);
			System.out.println("args[1] : " + data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.println("Java      ArrayIndexOutOfBoundsExceptionExample   ");
			System.out.println("값1     값2");
		}
	}
}
