package chap09.lecture.p02anonymous;

public class App05 {
	MyAbstractClass1 o1 = new MyAbstractClass1() {
		@Override
		public void method1() {
			System.out.println("퍼블릭 메소드 재정의");
		}
		
		@Override
		protected void method2() {	// protected보다 범위가 넓은제한자로 바꿀 수 있지만 웬만하면 그대로 씀
			System.out.println("프로텍티드 메소드 재정의");
		}
		
		@Override
		void method3() { // package private보다 범위가 넓은제한자로 바꿀 수 있지만 웬만하면 그대로 씀
			System.out.println("패키지 프라이빗 메소드 재정의");	
		}
	};
}
