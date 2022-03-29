package chap15.book.example.s150201;

import java.util.*;

public class ArrayAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		
		for (String name : list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1, 2, 3); // auto boxing
		for (int value : list2) {	// auto unboxing
			System.out.println(value);
		}
		
//		책 못한거
//		591~596
//		14장
//		722~739
	}
}
