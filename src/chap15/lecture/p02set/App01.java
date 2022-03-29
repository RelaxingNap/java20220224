package chap15.lecture.p02set;

import java.util.*;

public class App01 {

	public static void main(String[] args) {
		// Set : 순서 없고, 중복 X
		// 구현클래스 : HashSet
		
		Set<String> set = new HashSet<>();
		
		// add : element 추가
		set.add("jimin");
		set.add("suga");
		set.add("jin");
		set.add("rm");
		
		// size : 크기
		System.out.println(set.size());
		
		set.add("rm");	// 중복 허용 X
		System.out.println(set.size());	// size가 변함 없음
		
		// 탐색
		// 향상된 for문 사용. 인덱스가 없어서 일반적인 for문 사용 불가
		// get메소드는 없음.
		for (String item : set) {
			// 순서가 보장이 안됨
			System.out.println(item);
		}
		
		// Iterator를 이용하여 검색
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// remove
		set.remove("rm");
		System.out.println(set.size());
		
		set.remove("winter");
		System.out.println(set.size());	// set에 없는 것을 remove할시 없기 때문에 set의 size는 변함이 없다.
		
		// element 있는지
		System.out.println(set.contains("rm"));
		System.out.println(set.contains("jimin"));
	}

}
