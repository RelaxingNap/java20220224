package chap99.leetcode;

import java.util.*;

public class Solution771 {
	public int numJewelsInStones1(String jewels, String stones) {
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
	
	 public int numJewelsInStones2(String jewels, String stones) {
	        int result = 0;
	        
	        Set<Character> set = new HashSet<>();
	        
	        for(char c : jewels.toCharArray()){
	            set.add(c);
	        }
	        
	        for(char c : stones.toCharArray()){
	            if(set.contains(c)){
	                result++;
	            }
	        }
	        
	        return result;
	    }
	
}
