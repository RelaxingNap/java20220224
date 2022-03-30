package chap15.book.example.s150401;

import java.util.*;

public class HashMapExample1 {
	public static void main(String[] args) {
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	
		// 중복된 키값으로 인해, 가장 최근에 실행된 메소드의 값으로 덮어씌움
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println();
		
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();  // Key Set 얻기
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}
}
