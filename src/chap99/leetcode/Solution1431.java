package chap99.leetcode;

import java.util.*;

public class Solution1431 {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		int max = Arrays.stream(candies).max().getAsInt();
		List<Boolean> list = new ArrayList<>();
		for (int i = 0; i < candies.length; i++) {
			list.add((candies[i] + extraCandies) >= max);
		}

		return list;
	}
}
