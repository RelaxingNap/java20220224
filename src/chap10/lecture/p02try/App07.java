package chap10.lecture.p02try;

public class App07 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 0};
		
		try {
			int r = arr1[0] / arr1[1];
			System.out.println(r);
			
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("ArithmeticException NullPointerException 발생");
			System.out.println(e.getMessage());
			System.out.println(e instanceof ArithmeticException);
			System.out.println(e instanceof NullPointerException);
			e.printStackTrace(); // Exception객체의 타입, 메시지, 발생된 코드의 hint를 주는 method
								 // catch 블럭에 꼭 작성	
		}
		// 하위타입 Exception에서 같은 일을 한다면 | 사용해서 하나의 catch블록에서 처리 가능
		System.out.println("프로그램 실행 계속");
	}
}
