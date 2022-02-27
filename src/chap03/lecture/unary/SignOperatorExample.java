package chap03.lecture.unary;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short s = 100;
		//short result3 = -s;	부호연산자 연산이 끝나면 int 타입으로 변함. 그래서 에러남.
		int result3 = -s;
		System.out.println("result3 = " + result3);
		
	}
}
