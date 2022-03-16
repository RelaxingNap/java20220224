package chap99.leetcode;

public class Solution344 {
	public void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;

		while (left < right) {
			swap(s, left, right);
			right--;
			left++;
		}

	}
	
	private void swap(char[]s, int left, int right) {
		char temp = s[right];
		s[right] = s[left];
		s[left] = temp;
	}
}
