package chap09.book.example.s090203;

public class A {
	A() { System.out.println("A객체가 생성됨"); }
	
	
	//인스턴스 멤버 클래스
	class B {
		B() { System.out.println("B객체가 생성됨"); }
		int field1;
		//static int field2;
		void method1() {
			
		}
		//static void method2() { }		
	}
	
	// 정적 멤버 클래스
	static class C {
		C () { System.out.println("C객체가 생성됨"); }
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	// 로컬 클래스
	void method() {
		class D {
			D() {System.out.println("D객체가 생성됨"); }
			
			int field1;
			//static int field2;
			void method1() {}
			//static void method2() {}
		}
		
		D d = new D();
		d.method1();
		d.field1 = 3;
	}
	
}
