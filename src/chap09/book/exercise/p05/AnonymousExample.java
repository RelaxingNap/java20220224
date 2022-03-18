package chap09.book.exercise.p05;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();	// 중첩클래스 사용
		anony.method1();	// 지역클래스 사용
		anony.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
		});	// 매개변수 이용
	}
}
