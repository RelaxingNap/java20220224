package chap11.lecture.p03wrapper;

public class App05 {
	public static void main(String[] args) {
		Integer i1 = null;
		int i2 = i1; // auto unboxing시 NullPointerException 발생.
		
		System.out.println("프로그램 계속 실행......");
	}
}
