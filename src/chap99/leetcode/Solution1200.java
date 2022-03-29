package chap99.leetcode;

import java.util.*;

public class Solution1200 {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {

		Arrays.sort(arr);
		List<List<Integer>> list = new ArrayList<>();
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length - 1; i++) {
			min = Math.min(min, arr[i + 1] - arr[i]);
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (min == (arr[i + 1] - arr[i])) {
				list.add(Arrays.asList(arr[i], arr[i + 1]));
			}
		}

		return list;
	}
}
