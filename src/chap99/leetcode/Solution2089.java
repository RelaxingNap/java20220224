package chap99.leetcode;

import java.util.*;

public class Solution2089 {
	public List<Integer> targetIndices(int[] nums, int target) {

		List<Integer> list = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				list.add(i);
			}
			
			if(nums[i] > target) {
				break;
			}
		}

		return list;

	}
}
