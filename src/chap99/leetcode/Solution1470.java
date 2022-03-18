package chap99.leetcode;

public class Solution1470 {
	public int[] shuffle(int[] nums, int n) {
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = nums[i];
			arr2[i] = nums[n + i];
		}

		for (int i = 0, j = 0; i < n; i++) {
			nums[j++] = arr1[i];
			nums[j++] = arr2[i];
		}

		return nums;
	}
}
