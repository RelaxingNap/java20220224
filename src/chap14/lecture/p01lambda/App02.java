package chap14.lecture.p01lambda;

public class App02 {
	public static void main(String[] args) { // 컴파일러에 의해 다 예측이 가능해서 몸통만 남아도 됨.
		
		MyInterface2 o1 = (int c, int e) -> {
			System.out.println(c);
			System.out.println(e);
		};	// lambda expression
			// 추상메소드가 1개있을때만 쓸 수 있음.
		
		MyInterface2 o2 = new MyInterface2() {

			@Override
			public void method1(int a, int b) {
				// TODO Auto-generated method stub
				
			}
			
		};
	}
}

interface MyInterface2 {
	void method1(int a, int b);
}