package chap15.book.exercise.p09;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		// 모두 탐색
		// 1. entry set
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		// 2. keySet
//		Set<String> keySet = map.keySet();
//		for(String key : keySet) {
//			System.out.println(key);
//		}
		
		// 3. forEach
		map.forEach((k, v) -> System.out.println(k + "=" + v));
		
		
		
	}
}
