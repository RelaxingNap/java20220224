package chap09.book.example.s090304;

public class Outter {
	String field = "Outter-field";
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {	
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);	
			Outter.this.method(); // 내부클래스에서 외부클래스 접근시 외부클래스명.this를 사용하면 접근가능
		}
	}
}
