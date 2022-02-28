package chap03.lecture.method;

public class C03Method {
	public static void main(String[] args) {
		myMethod1(300);
		myMethod1(900);
		//myMethod1(3.14);// x parameter에 다른 자료형이 들어가서 error
		myMethod1('가');	//자동형변환이 일어나는 값은 넣을 수 있음
		
		int j = 999;
		myMethod1(j);
	}
	
	public static void myMethod1(int i) {
		System.out.println(i);
	}
}
