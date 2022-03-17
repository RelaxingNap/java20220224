package chap08.lecture.p02polymorphism;

public class App03 {
	public static void main(String[] args) {
		MyInterface3 i1 = new MyClass3();
		i1.method1();
		
		MyInterface3 i2 = new MyClass4();
		i2.method1();	// 재정의가 되어있다는것이 안전하게 보장되어 사용가능. 재정의를 강제함.
	
		otherMethod(i1);
		otherMethod(i2);
		otherMethod(new MyClass3());
		otherMethod(new MyClass4());
		
	}
	
	public static void otherMethod(MyInterface3 param) {
		param.method1();
	}
}

interface MyInterface3 {
	void method1();
}

class MyClass3 implements MyInterface3 {

	@Override
	public void method1() {
		System.out.println("재정의한 추상메소드1");
	}
	
}

class MyClass4 implements MyInterface3 {

	@Override
	public void method1() {
		System.out.println("마이클래스4에서 재정의한 메소드 1");
	}
	
}