package chap13.lecture.p01generic;

public class App14 {
	public static void main(String[] args) {
		App14.<String>method("java");	// 정석적으로 쓴 방식
		method("java"); // 생략가능, 추론하여 적용가능함.
		
		String s1 = App14.<String>method2();
		String s2 = method2();
		
		String s3 = App14.<String>method3("java");
		String s4 = method3("java");
	}
	
	// method에 type parameter추가 : type parameter를 리턴 타입전에 추가
	// type parameter를 추가하면 -> generic method
	// parameter나 리턴타입에 결정하여 호출할 수 있음
	
	public static <T> void method(T param) {
		
	}
	
	public static <T> T method2() {
		return null;
	}
	
	public static <T> T method3(T param) {
		return null;
	}
}
