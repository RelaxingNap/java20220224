package chap10.lecture.p02try;

public class App06 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {3, 0};
		
		try {
			int r = arr1[0] / arr1[1];
			System.out.println(r);
			
		} catch (RuntimeException e) {
			System.out.println("RuntimeException 발생");
		}
		// ArithmeticException, NullPointerException을 동시에 처리하기 위해 상위 타입인 RuntimeException이용
		// Exception처리시 Exception이 같은 일을 하게 된다면 상위타입의 Exception을 사용하여 처리 할 수 있음.
		
		System.out.println("프로그램 실행 계속");
	}
}
