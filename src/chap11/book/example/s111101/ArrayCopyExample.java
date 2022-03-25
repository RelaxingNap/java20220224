package chap11.book.example.s111101;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };
		
		// 방법 1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);	// arr1전체를 arr2에 복사
		System.out.println(arr2.toString());
		
		// 방법 2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);	// arr1[1] ~ arr1[2]를 arr3[0] ~ arr3[1]로 복사
		System.out.println(arr3.toString());
		
		// 방법 3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);// arr1전체를 arr4에 복사
		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}
		
		// 방법 4
		char[] arr5 = arr1.clone();
		for (int i = 0; i < arr5.length; i++) {
			System.out.println("arr5[" + i + "] = " + arr5[i]);
		}
		
	}
}
