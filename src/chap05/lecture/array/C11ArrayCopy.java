package chap05.lecture.array;

import java.util.Arrays;

public class C11ArrayCopy {
	public static void main(String[] args) {
		int[] a = {9, 5, 2, 1};
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}	// 방법 1
		
		int[] c = Arrays.copyOf(a, a.length);	// 방법 2
		int[] d = new int[a.length];
		System.arraycopy(a, 0, d, 0, a.length);	// 방법 3
		
	}
}
