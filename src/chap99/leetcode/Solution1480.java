package chap99.leetcode;

public class Solution1480 {
	public int[] runningSum(int[] nums) {
		int[] ans = new int[nums.length];
		//int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			//    sum += nums[i];
			//    ans[i] = sum;
			if (i == 0) {
				ans[i] = nums[i];
			} else {
				ans[i] = ans[i - 1] + nums[i];
			}

		}

		return ans;
	}
}
