package chap14.lecture.p01lambda;

public class App03 {
	public static void main(String[] args) {
		
		MyInterface3 o1 = new MyInterface3() {

			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void method2() {
				// TODO Auto-generated method stub
				
			}
			
		};
		// 추상 메소드가 1개 일때만 람다식 작성가능
//		MyInterface3 o2 = () -> {
//			
//		};
		
	}
}

interface MyInterface3 {
	void method1();
	void method2();
}