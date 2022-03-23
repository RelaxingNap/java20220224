package chap99.leetcode;

import java.util.Arrays;

public class Solution1816 {
	public String truncateSentence1(String s, int k) {
		String[] arr1 = s.split(" ");
		String result = "";

		for (int i = 0; i < k; i++) {
			result += arr1[i];
			if (i < k - 1) {
				result += " ";
			}
		}
		return result;
	}

	public String truncateSentence2(String s, int k) {
		String[] arr1 = s.split(" ");
		String[] res = Arrays.copyOf(arr1, k);
		String result = String.join(" ", res);

		return result;
	}
}
