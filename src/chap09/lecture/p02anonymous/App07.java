package chap09.lecture.p02anonymous;

public class App07 {
	public static void main(String[] args) {
		int var = 7;
		
		MyInterface1 o1 = new MyInterface1() {
			@Override
			public void method1() {
				System.out.println(var);
			}
		};
		
//	var = 8;	변수 변경시 오류 발생
		o1.method1();		
	}
}
