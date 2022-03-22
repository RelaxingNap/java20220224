package chap10.lecture.p04throw;

public class App03 {
	public static void main(String[] args) {
		method1();
		
		System.out.println("프로그램 실행 계속....");
	}
	
	private static void method1() {
		method2();
		
		System.out.println("메소드1 실행 계속...");
	}
	
	private static void method2() {
		try {
			method3(); // Exception이 발생할 수 있는 코드
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메소드2 실행 계속...");
	}
	
	private static void method3() throws Exception { // 예외처리된다는 것을 명시
		throw new Exception();	// 의도적으로 exception을 만들어서 던짐
	}
	
}
