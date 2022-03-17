package chap07.book.example.s0706.package2;

import chap07.book.example.s0706.package1.A;

public class D extends A {
	public D () {
		super();	// 가능. new연산자 사용해서 직접 호출은 불가. 자식생성자에서 super()로 호출
		this.field = "value";	// 가능
		this.method();	// 가능
		
	}
}
