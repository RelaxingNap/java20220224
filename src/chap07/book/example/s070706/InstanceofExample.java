package chap07.book.example.s070706;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - child로 변환 성공");
		} else {
			System.out.println("method1 - child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;	// ClassCastException이 발생할 가능성 있음
		System.out.println("method2 - child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
//		method2(parentB);	예외 발생 
//		프로그램이 종료될 수 있기 때문에 종료되는것을 막기위해 instanceof 연산자로 점검해야 함.
	}
}
