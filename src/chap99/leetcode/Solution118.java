package chap99.leetcode;

import java.util.*;

public class Solution118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();

			if (i != 0) {
				row.add(1);
			}

			for (int j = 0; j < i - 1; j++) {
				row.add(list.get(i - 1).get(j) + list.get(i - 1).get(j + 1));
			}
			row.add(1);
			list.add(row);
		}

		return list;
	}
}
