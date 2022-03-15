package chap06.book.example.s061302.package2;	// 패키지 다름

import chap06.book.example.s061302.package1.A;

public class C {
	A a1 = new A(true);
//	A a2 = new A(1);	// default(package private)생성자 접근 불가(컴파일 에러)
//	A a3 = new A("문자열");	// private 생성자 접근 불가(컴파일 에러)
}
