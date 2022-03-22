package chap10.lecture.p02try;

public class App05 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 0};
		
		try {
			int r = arr1[0] / arr1[1];
			System.out.println(r);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("NullPointerException 발생");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException 발생");
		} catch (RuntimeException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}
		// 상위타입 Exception사용시, 하위타입 Exception에 도달하지 못해서 에러 발생. 
		// 상위타입 Exception을 잘 사용해야함. 
		// catch블럭 여러개 작성 시 하위타입보다 상위타입을 아래에 작성.
		
		System.out.println("프로그램 실행 계속");
	}
}
