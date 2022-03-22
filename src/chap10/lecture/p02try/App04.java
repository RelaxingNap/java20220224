package chap10.lecture.p02try;

public class App04 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 0};
		
		try {
			int r = arr1[0] / arr1[1];
			System.out.println(r);
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}
		//여러개 catch block으로 Exception처리, Exception은 하나만 처리됨. 
		
		
		System.out.println("프로그램 실행 계속");
	}
}
