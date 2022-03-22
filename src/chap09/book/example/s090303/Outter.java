package chap09.book.example.s090303;

public class Outter {
	// 자바 7이전
	public void method1(final int arg) {
		final int localVariable = 1;
		// arg = 100; (X) 변수변경불가
		// localVariable = 100; (X) 변수변경불가
		class Inner {
			public void method1() {
				int result = arg + localVariable;
			}
		}
	}
	
	// 자바 8이후
	public void method2(int arg) {
		int localVariable = 1;	
		// arg = 100; (X) 변수변경불가
		// localVariable = 100; (X) 변수변경불가
		class Inner {
			public void method2() {
				int result = arg + localVariable;
			}
		}
	}
	
	// final이라고 명시를 안해도 되지만, final처럼 사용안하고 일반변수처럼 사용할시 에러발생
	
}
