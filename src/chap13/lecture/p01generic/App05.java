package chap13.lecture.p01generic;

import chap08.lecture.p01interface.example_class.*;

public class App05 {
	public static void main(String[] args) {
		Container5<Chihuahua> o1 = new Container5<>();
		o1.method(new Chihuahua());
		
		Container5<Cat> o2 = new Container5<>();
		o2.method(new Cat());
	}
}

// 제한된 타입 파라미터 (bounded type parameter)
// 구현된 클래스의 메소드를 안전하게 쓰기위해서 사용
// interface던 class던 abstract class던 extends를 사용
class Container5<T extends Pet> {
	public void method(T param) {
		param.roll();	
		param.toString();
	}
}