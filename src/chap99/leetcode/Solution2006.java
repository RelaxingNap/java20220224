package chap99.leetcode;

import java.util.*;

public class Solution2006 {
	public int countKDifference(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int temp = 0;

		for (int num : nums) {
			if (map.containsKey(num - k)) {
				temp += map.get(num - k);
			}

			if (map.containsKey(num + k)) {
				temp += map.get(num + k);
			}

			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		return temp;
	}
}
