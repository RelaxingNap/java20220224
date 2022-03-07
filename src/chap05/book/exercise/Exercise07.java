package chap05.book.exercise;

public class Exercise07 {
	public static void main(String[] args) {
//		int max = 0;	// 배열안의 값이 음수인 경우, 원하는 결과가 나오지 않음.
		int[] array = {-1, -5, -3, -8, -2};
//		int max = array[0];
		int max = Integer.MIN_VALUE;	// 해결방법 
		for (int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
		
	}
}
