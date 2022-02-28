package chap03.lecture.method;

public class C04Method {
	public static void main(String[] args) {
		
		// myMethod1();		error 매개변수에 값을 안넣으면 안됨.
		// myMethod1(3); 	error 매개변수를 2개 선언해놓았으면 2개다 넣어야 함.
		myMethod1(3,5);
		myMethod1(33, 55);
		myMethod1('가', 33);

		myMethod2(999, 888);
	}
	
	public static void myMethod1(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}
	
	//파라미터명 LowerCamelCase
	//선언된 변수명 동시에 바꿀 시 ctrl + 1로 힌트 얻어서 rename함.
	//값은 method가 호출될때 결정
	public static void myMethod2(int age, int weight) {
		System.out.println(age * 2);
		System.out.println(weight * 2);
	}
	
	public static void myMethod3(int i, boolean b, long l, double d) {
		
	}
}
