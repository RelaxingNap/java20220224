package chap99.leetcode;

public class Solution1929 {
	public int[] getConcatenation(int[] nums) {
		int[] ans = new int[(nums.length) * 2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < nums.length; j++) {
				ans[(nums.length * i) + j] = nums[j];
			}
		}

		return ans;
	}
}
