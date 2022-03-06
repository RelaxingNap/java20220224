package chap05.lecture.array;

public class testMatrix {
	public static void main(String[] args) {
		int[][] arr1 = {{3, 2, 1}, {1, 2, 3}};
		int[][] arr2 = {{1, 3}, {2, 4}, {3, 5}};
		int[][] arr3 = new int[arr1.length][arr2[0].length];
		
		arr3 = solution(arr1, arr2);	

		
	}
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
	        int[][] answer = new int[arr1.length][arr2[0].length];
	        
	        for(int i = 0; i < arr1.length; i++) {
	            for(int j = 0; j < arr2[i].length; j++) {
	                for(int k = 0; k < arr2.length; k++) {
	                     answer[i][j] += (arr1[i][k]*arr2[k][j]);
	                }
	               
	            }
	        }
	        
	        for(int i = 0; i < answer.length; i++) {
	        	for (int j = 0; j < answer[i].length; j++) {
					System.out.print(answer[i][j] + " ");
				}System.out.println();
	        	
	        }
	        
	        return answer;
	    }
}
