package chap99.leetcode;

public class Solution2114 {
	/*	public int mostWordsFound(String[] sentences) {
			int max = 0;
			String str = "";
	
			for (int i = 0; i < sentences.length; i++) {
				int count = 1;
				str = sentences[i];
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(j) == ' ') {
						count++;
					}
				}
	
				if (max < count) {
					max = count;
				}
			}
			return max;
		}
	*/	
	public int mostWordsFound(String[] sentences) {
		int max = 0;

		for (int i = 0; i < sentences.length; i++) {
			String[] arr = sentences[i].split(" ");
			max = (arr.length > max) ? arr.length : max;

		}
		return max;
	}

}
