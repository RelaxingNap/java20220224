package chap06.lecture.p06final;

public class App02 {
	
	int i = 3;
	final int j = 5;
	final int k;	// final로 정의한 변수는 생성자에서 딱 한번 값을 할당받을 수 있고 그 이후에는 값을 할당 받을 수 없음.	
	App02() {
		k = 30;
	}
	
	public static void main(String[] args) {
		App02 o1 = new App02();
		System.out.println(o1.i);
		
		o1.i = 4;
//		o1.j = 6;
		System.out.println(o1.i);
	}
}
