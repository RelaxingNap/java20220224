package chap05.lecture.array;

public class C10Array {
	public static void main(String[] args) {
		int[] a = {3, 4, 5, 7};
		int[] b = a;	//참조값을 복사
		
		b[0] = 9;	// b값이 변하면 a값도 변함(원치않음)
		System.out.println(a[0]);
		
		int[] c = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		c[0] = 30;
		
		System.out.println(a[0]);
		System.out.println(c[0]);
	}
}
