package chap99.leetcode;

import java.util.Arrays;

public class Solution2160 {
	public int minimumSum1(int num) {
		String str = Integer.toString(num);
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		String min1 = ch[0] + "" + ch[2];
		String min2 = ch[1] + "" + ch[3];
		int a = Integer.parseInt(min1);
		int b = Integer.parseInt(min2);

		return a + b;

	}
	
	public int minimumSum2(int num) {
		int[] arr = new int[4];
		for (int i = 0; i < 4; i++) {
			arr[i] = num % 10;
			num = num / 10;
		}

		Arrays.sort(arr);

		return arr[0] * 10 + arr[1] * 10 + arr[2] + arr[3];
	}
}
