package chap99.leetcode;

import java.util.*;

public class Solution1046 {
		public int lastStoneWeight(int[] stones) {
	       List<Integer> list = new ArrayList<>();
	        for(int i = 0; i < stones.length; i++) {
	           list.add(stones[i]);
	        }
//	        
//	        
//	        while(list.size() > 1) {
//	        
//	            Collections.sort(list);
//	            int first = list.get(list.size()-1);
//	            int second = list.get(list.size()-2);
//	            if(first > second) {
//	                list.set(list.size()-1, (first - second));
//	                list.remove(list.size()-2);
//	            } else if (first == second) {
//	                list.remove(list.size()-1);
//	               list.remove(list.size()-1);
//	            }
//	
//	        }
			while(list.size() > 1) {
		        
	            Collections.sort(list);
	            int first = list.remove(list.size()-1);		// remove() 할 시에 지워지는 내용물을 리턴해줌.
	            int second = list.remove(list.size()-1);
	            if(first != second) {
	                list.add(first - second);
	            } 

	        }
			
	        if(list.isEmpty()) {
	        	return 0;
	        } else {
	        	return list.get(0);
	        }
	        
	    }
		
	
}
