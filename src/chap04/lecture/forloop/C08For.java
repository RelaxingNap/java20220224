package chap04.lecture.forloop;

public class C08For {
	public static void main(String[] args) {
		int[] arr1 = {3, 1, 9, 0, 7};
		
		// arr1에 있는 모든 값을 더해서 출력 
		int sum = 0;
		for(int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
		}
		
		System.out.println(sum);
		
		int big = arr1[0];
		int small = arr1[0];
		// arr1의 값중 가장 큰 값을 출력
		// arr1의 값중 가장 작은 값을 출력
		for (int i = 1; i < arr1.length; i++) {
//			if(big < arr1[i]) {
//				big = arr1[i];
//			}
			big = (big < arr1[i]) ? arr1[i] : big;
			
			if(small > arr1[i]) {
				small = arr1[i];
			}
		}
		System.out.println(big);
		System.out.println(small);
	}
}
