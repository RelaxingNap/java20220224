package chap03.lecture.method;

public class C02Method {

	public static void main(String[] args) {
		System.out.println("명령문 1");
		myMethod1(300);
		System.out.println("명령문 2");
		myMethod1(3);
		System.out.println("명령문 3");
	}
	// 메소드명 : lowerCamelCase
	
	
	// ()에 parameter 타입과 이름 작성 가능
	// -> parameter
	public static void myMethod1(int i) {
		System.out.println("마이 메소드1");
		System.out.println("파라미터 i의 값 : " + i);
	}
}
