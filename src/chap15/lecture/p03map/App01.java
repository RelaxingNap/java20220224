package chap15.lecture.p03map;

import java.util.*;

public class App01 {
	public static void main(String[] args) {
		// Map : (Key, Value) 쌍으로 저장
		// (Key, Value) : entry, entry는 순서가 없음
		// Key는 중복 안됨.
		
		Map<String, String> map = new HashMap<>();
		
		// put() : entry 추가 
		
		map.put("bts", "boy group");
		map.put("aespa", "girl group");
		map.put("tesla", "car");
		map.put("tesla", "elon musk"); // key값이 같고 value가 다르면 
									   // 제일 나중에 실행한것이 덮어씌어서 map에 들어가있음
									   // 갱신시 갱신전의 value값 리턴	
		
		// size() : entry 수
		int size = map.size();
		
		// get() : key를 사용해서 value를 얻음
		String val1 = map.get("bts");
		String val2 = map.get("aespa");
		String val3 = map.get("tesla");
		String val4 = map.get("bitcoin");
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4); // map에 키값이 없으면 null값 리턴
		
		// keySet() : key를 Set타입으로 리턴
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		// 전체탐색 1 : keySet, get() 이용
		Set<String> keyset = map.keySet();
		
		for (String key : keyset) {
			String value = map.get(key);
			
			System.out.println(key + " : " + value);
		}
		
		// 전체탐색 2 : entrySet() 이용
		Set<Map.Entry<String, String>> entries = map.entrySet();
		
		for (Map.Entry<String, String> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		// remove : key로 entry삭제하는 방법과 entry전체를 작성하여 삭제하는 방법이 존재 
		// key값만 이용해서 지울 시 지워지는 entry의 value값 리턴
		// entry전체를 작성 시, 삭제 성공, 실패여부 리턴
		map.remove("tesla");
		
		
		// containsKey : key가 있는지 확인
		System.out.println(map.containsKey("tesla"));
		System.out.println(map.containsKey("aespa"));
		
		
		
	}
}
