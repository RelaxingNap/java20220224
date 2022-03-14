package chap06.lecture.p04method;

public class App04 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		long res = c1.plus(10, 20);	// return값을 쓰고 싶을 경우 return값을 받을 변수를 사용해야함.
		
		System.out.println(res);
		System.out.println(c1.plus(30, 40));
	}
}
