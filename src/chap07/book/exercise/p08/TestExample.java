package chap07.book.exercise.p08;
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends B {}
class F extends C {}

public class TestExample {
	public static void main(String[] args) {
		// 오른쪽 인스턴스는 왼쪽 참조변수이다.
		B b1 = new B();
		B b2 = new D();
		B b3 = new E();
//		B b4 = (B) new A();	exception발생
		
		method(new B());
		method(new D());
		method(new E());
//		method((B) new A()); exception발생
		
		A a1 = new D();
		method((B) a1);
	}
	
	public static void method(B b) {
		
	}
}
