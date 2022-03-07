package chap99.programmers;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class Solution12935 {

	@Test
	public void test() {
		assertArrayEquals(new int[] {4, 3, 2}, solution(new int[] {4, 3, 2, 1}));
	}
	
	
	public int[] solution(int[] arr) {
	    int min = Integer.MAX_VALUE;
	    
	    for(int i = 0; i < arr.length; i++) {
	        if(min > arr[i]) {
	            min = arr[i];
	        }
	    }
	    
	    int j = 0;
	    if(arr.length > 1) {
	        int[] answer = new int[arr.length-1];
	        for(int i = 0; i < arr.length; i++) {
	            if(min != arr[i]) {
	               answer[j] = arr[i];
	               j++;
	            }
	        }
	    } else {
	        int[] answer = new int[arr.length];
	        answer[j] = -1;
	    }
	    
	    return answer;
	}
}


