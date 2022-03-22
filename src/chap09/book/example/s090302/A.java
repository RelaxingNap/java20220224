package chap09.book.example.s090302;

public class A {
	//멤버 클래스에서 사용제한
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;	// 내부클래스에서 외부 멤버에 접근가능
			method1();
			
			field2 = 10;
			method2();
		}
	}
	
	static class C {
		void method() {
//			field1 = 10;	// 내부클래스라도 인스턴스 멤버면 접근불가
//			method1();
			
			field2 = 10;
			method2();
		}
	}
	
}
