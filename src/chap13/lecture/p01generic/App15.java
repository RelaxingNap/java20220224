package chap13.lecture.p01generic;

import chap08.lecture.p01interface.example_class.*;

public class App15 {
	public static void main(String[] args) {
		MyClass15 o1 = new MyClass15();
		o1.<String>method1("java");
		o1.method1("java");
		
		o1.method1(3);
		o1.<String, Integer>method2("aaa", 5);
		o1.method2("bbb", 77);
		
		o1.<Cat>method4(new Cat());
		o1.method4(new Cat());
		
		o1.<Chihuahua>method4(new Chihuahua());
		o1.method4(new Chihuahua());
	}
}

class MyClass15 {
	public <T> void method1(T param) {
		
	}
	
	public <T, U> void method2(T param1, U param2) {
		
	}
	
	public <T, U> U method(T param) {
		return null;
	}
	
	public <T extends Pet> void method4(T param) {
		
	}
}