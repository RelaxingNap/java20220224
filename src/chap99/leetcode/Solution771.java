package chap99.leetcode;

public class Solution771 {
	public int numJewelsInStones(String jewels, String stones) {
		int result = 0;

		if (jewels.length() >= 1 && stones.length() <= 50) {
			for (int i = 0; i < jewels.length(); i++) {
				for (int j = 0; j < stones.length(); j++) {
					if (jewels.charAt(i) == stones.charAt(j)) {
						result++;
					}
				}
			}
		}

		return result;
	}
}
