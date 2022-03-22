package chap10.lecture.p01exception;

public class App05 {
	public static void main(String[] args) {
		//ArithmeticException
		//실행예외는 if else로 처리가능하지만 일반예외는 처리어려움
		int i = 5;
		int j = 0;
		
		if(j != 0 ) {
			System.out.println(i / j);
		}
		
		System.out.println("프로그램 실행 계속.....");
	}
}
