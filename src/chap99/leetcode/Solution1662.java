package chap99.leetcode;

public class Solution1662 {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String a = "", b = "";

		for (int i = 0; i < word1.length; i++) {
			a += word1[i];
		}

		for (int i = 0; i < word2.length; i++) {
			b += word2[i];
		}

		return a.equals(b);
	}
}
