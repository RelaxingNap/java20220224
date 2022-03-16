package chap99.leetcode;

public class Solution1528 {
	public String restoreString(String s, int[] indices) {
		char[] arr1 = new char[indices.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[indices[i]] = s.charAt(i);
		}

		return new String(arr1);
	}
}
