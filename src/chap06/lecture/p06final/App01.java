package chap06.lecture.p06final;

public class App01 {
	public static void main(String[] args) {
		// final : 변수 선언시 작성하면 값을 한번만 할당 할 수 있음
		int i = 9;
		i = 3;
		
		final int j = 10;
		//j = 1;  X
		
		final int k;
		k = 10;
		//k = 9;  X
		
//		public static void method1(final int i) {
////			i = 30;	   X
//		}
		
	}
}
