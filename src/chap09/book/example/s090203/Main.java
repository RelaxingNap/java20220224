package chap09.book.example.s090203;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		// 인스턴스 클래스 멤버 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		// 정적 클래스 멤버 객체 생성
		A.C c = new A.C();
		c.field1 = 5;
		c.field2 = 7;
		c.method1();
		c.method2();
		
		// 로컬 클래스 멤버 객체 생성
		a.method();
	}
}
