package chap06.lecture.p11annotation;

public class App06 {
	
	
	// element명이 value이면 값을 줄 때, 생략 가능
	@MyAnnotation6(value = "spring")
	void method() {
		
	}
	
	@MyAnnotation6("java")
	void method2() {
		
	}
}
