package chap11.book.example.s111102;

import java.util.Arrays;

public class EqualsExample {
	public static void main(String[] args) {
		int[][] original = { {1, 2}, {3, 4} };
		
		//얕은 복사 후 비교
		System.out.println("[얕은 복사 후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교 : " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교 : " + Arrays.deepEquals(original, cloned1));
		
		//깊은 복사 후 비교
		System.out.println("[깊은 복사 후 비교]");
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		for(int i = 0; i < original.length; i++) {
			cloned2[i] = Arrays.copyOf(original[i], original[i].length);
		}
		System.out.println("배열 번지 비교 : " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교 : " + Arrays.deepEquals(original, cloned2));
		
	}
}
