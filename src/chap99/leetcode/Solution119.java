package chap99.leetcode;

import java.util.*;

public class Solution119 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<>();

		if (rowIndex == 0) {
			list.add(1);
		} else {
			for (int i = 0; i < rowIndex; i++) {
				List<Integer> list2 = new ArrayList<>();
				list2.add(1);

				for (int j = 0; j < list.size() - 1; j++) {
					list2.add(list.get(j) + list.get(j + 1));
				}
				list2.add(1);
				list = list2;
			}
		}

		return list;
	}
}
