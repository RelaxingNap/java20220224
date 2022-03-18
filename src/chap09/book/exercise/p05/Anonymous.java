package chap09.book.exercise.p05;

public class Anonymous {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("자전거가 달립니다.");
		}	//중첩클래스사용하여 무명클래스로 구현클래스 만들어서 인터페이스 재정의
	};
	
	void method1() {
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
			}
		}; //외부 메소드 안에서 무명클래스로 구현클래스 만들어서 인터페이스 재정의 후 내부 구현클래스의 메소드 실행 	
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();	// 무명클래스를 매개변수에서 인터페이스 재정의하고 구현화시켜서 내부 구현클래스의 메소드를 실행시키게 함
	}
}
