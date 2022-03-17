package chap08.lecture.p01interface;

public class App01 {
	public static void main(String[] args) {
		System.out.println(MyInterface2.FIELD1);
		System.out.println(MyInterface2.FIELD2);
		
//		MyInterface2.FIELD1 = 33;	// X
//		MyInterface2.FIELD2 = 321;	// X	값 할당 불가
		
//		추상클래스와 같이 추상적인개념이므로 인스턴스를 만들 수 없음
//		MyInterface2 o1 = new MyInterface2();	// 인터페이스로는 인스턴스를 만들 수 없음
	}
}
