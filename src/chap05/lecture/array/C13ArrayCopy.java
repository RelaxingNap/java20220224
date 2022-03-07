package chap05.lecture.array;

import java.util.Arrays;

public class C13ArrayCopy {
	public static void main(String[] args) {
		int[][] a = {{3, 5}, {10, 11, 12}, {20, 10}};
		int[][] b = a;
		
		b[0][0] = 99;
		System.out.println(a[0][0]);
		
		int[][] c = Arrays.copyOf(a, a.length);	// a.length만큼의 a의 내용을 복사(참조주소도 복사)
		System.out.println(c[0][0]);			// 그래서 c의 주소는 복사되지 않았지만 안의 내용은 a와 동일함
												// 그래서 c안의 내용을 변경시키면 a안의 내용도 변경되는 현상 발생
												// 얕은 복사
		c[0][0] = 999;
		System.out.println(a[0][0]);
		
		c[0] = new int[] {22, 23};
		System.out.println(c[0][0]);	// 22
		System.out.println(a[0][0]);	// 22 ? 999 ? (999)
		
	}
}
