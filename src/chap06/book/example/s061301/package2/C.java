package chap06.book.example.s061301.package2;

import chap06.book.example.s061301.package1.*;

public class C {
//	A a;	// default(package private)상태. 컴파일 에러. 다른패키지에 있는 C클래스에서 사용 불가
	B b;	// public상태. 다른패키지에 있는 C클래스에서 사용 가능.
			
}
