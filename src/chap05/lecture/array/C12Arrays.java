package chap05.lecture.array;

import java.util.Arrays;

public class C12Arrays {
	public static void main(String[] args) {
		int[] a = {-1, 9, 2, 3, 10};
		System.out.println(a);	// 16진법으로 되어있는 참조값
		
		System.out.println(Arrays.toString(a));	// 배열의 내용이 보기좋게 출력가능.
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int[] b = new int[10];
//		for (int i = 0; i < b.length; i++) {
//			b[i] = 5;
//		}
		
		Arrays.fill(b, 5);
		System.out.println(Arrays.toString(b));
		
	}
}
