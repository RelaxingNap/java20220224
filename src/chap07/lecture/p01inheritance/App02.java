package chap07.lecture.p01inheritance;

public class App02 {
	public static void main(String[] args) {
		SuperClass1 o1 = new SuperClass1();
		o1.setField("필드값");
		System.out.println(o1.getField());
		o1.someMethod();
		
		SubClass1 o2 = new SubClass1();	
		// 내부적으로는 부모클래스 객체가 먼저 생성된 후 자식 객체가 생성된다.
		// 명시적으로 선언하지 않는다면 컴파일러는 super()라는 기본생성자를 생성한다.
		// super()는 부모클래스의 기본생성자를 호출한다.
		o2.setField("서브클래스 인스턴스 필드값");
		System.out.println(o2.getField());
		o2.someMethod();
	}
}
