package chap05.lecture.array;

import java.util.Arrays;

public class C15ArrayCopy {
	public static void main(String[] args) {
		int[][] a = {{9, 10}, {3, 4}};
		int[][] b = Arrays.copyOf(a, a.length);
		b[0][0] = 999;
		System.out.println(a[0][0]); // 얕은복사로 인해 일어난 상황. a[0][0]은 999로 변환되면 안됨
		
	}
}
