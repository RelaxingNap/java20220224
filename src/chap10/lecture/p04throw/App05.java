package chap10.lecture.p04throw;

public class App05 {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//checked exception을 발생시키면 발생이 된다는것을 명시하고, 
		//exception을 처리하고 싶으면 try catch문으로 처리하고, 
		//다른 메소드에서 처리시키기 위해 떠넘기고 싶으면 메소드 옆에 throw를 명시하면 된다.
		System.out.println("프로그램 계속./.././");
	}

	private static void method1() throws Exception {
		method2();
		
		
		System.out.println("메소드1 계속....");
	}

	private static void method2() throws Exception {
		method3();
		
		System.out.println("메소드2 계속.....");
		
	}

	private static void method3() throws Exception {
		throw new Exception();
	}
}
