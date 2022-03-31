package chap15.lecture.p03map;

import java.util.*;

public class App03 {
	public static void main(String[] args) {
		Map<Integer, Integer> map1 = new HashMap<>();
		
		map1.compute(3, (k, v) -> 100);
		
		System.out.println(map1.size());
		System.out.println(map1);
		
		map1.compute(4, (k, v) -> {
			System.out.println(k);
			System.out.println(v);
			
			return 0;
		});
		
		System.out.println(map1.size());
		System.out.println(map1);
		
		int[] nums = { 9, 8, 7, 7 };
		
		Map<Integer,Integer> map2 = new HashMap<>();
		/*
		map2.compute(9, (k , v) -> v == null ? 1 : v + 1);
		map2.compute(8, (k , v) -> v == null ? 1 : v + 1);
		map2.compute(7, (k , v) -> v == null ? 1 : v + 1);
		map2.compute(7, (k , v) -> v == null ? 1 : v + 1);
		*/
		
		for(int num : nums) {
			map2.compute(num, (k, v) -> v == null ? 1 : v + 1);
		}
		// 향상된 for문(for each loop)은 iterable interface의 하위 interface와 class들이 사용가능
		
		System.out.println(map2);
	}
}
