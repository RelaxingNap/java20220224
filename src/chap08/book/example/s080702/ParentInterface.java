package chap08.book.example.s080702;

public interface ParentInterface {
	void method1();
	default void method2() {
		System.out.println("ParentInterface - method2");
	}
}
