package chap99.leetcode;

public class Solution2000 {
	public String reversePrefix(String word, char ch) {
		String result = "";
		int index = 0;

		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == ch) {
				index = i;
				break;
			}
		}

		for (int i = index; i >= 0; i--) {
			result += word.charAt(i);
		}

		result += word.substring(index + 1);

		return result;
	}

}
