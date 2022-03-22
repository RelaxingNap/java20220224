package chap10.lecture.p02try;

public class App03 {
	public static void main(String[] args) {
		int i = 3;
		int j = 0;

		try {
			int k = i / j;	// ArithmeticException
			System.out.println("몫 : " + k);
		
		} catch(ArithmeticException e) {
			// () : 발생한 exception 객체의 타입과 변수명
			System.out.println("잘못된 연산입니다.");
		}
		//발생할것같은 Exception을 적절하게 맞추어서 사용해야 잘 잡아낸다.
		System.out.println("프로그램 실행 계속");
	}
}
