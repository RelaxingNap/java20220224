package chap99.leetcode;

public class Solution1672 {
	public int maximumWealth(int[][] accounts) {
		int max = 0;

		for (int[] person : accounts) {

			int sum = 0;
			for (int wealth : person) {
				sum += wealth;
			}
			if (sum > max) {
				max = sum;
			}

		}
		
		return max;
	}
}
