package chap05.lecture.array;

public class C06Array {
	public static void main(String[] args) {
		int[] arr1 = {3, 5, 1};
		method(arr1);	// 참조값이 복사됨.
		
		System.out.println(arr1[0]);
		
		int[] arr2 = {10, 20, 30};
		
		method(arr2);
		
		System.out.println(arr2[0]);
		
		int[] param = {-1, -5, -6};
		System.out.println(param[0]);
		
		method(param);
		System.out.println(param[0]);

	}

	public static void method(int[] param) {
		param[0] *= 2;
	}
}
