package chap06.lecture.p06final;

public class App03 {
	static int i = 3;
	static final int j = 5;
	static final int k;
	//final은 주로 변하지 않는 수를 정의할 때 사용함.
	static final double PI = 3.14;
	// static final 변수명 항상 대문자, 단어 사이는 _로 구분
	static final int STUDENT_NUMBER = 30;
	static {
		k = 99;
	}
	
	public static void main(String[] args) {
		i = 4;	//스태틱변수도 다른 값을 할당할 수 있다.
//		j = 6;		X
//		k = 100;	X
		
	}
}
