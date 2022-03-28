package chap15.lecture.p01list;

import java.util.*;

public class App06 {
	public static void main(String[] args) {
		// List 탐색 방법
		
		List<String> list = new ArrayList<>();
		list.add("spring");
		list.add("java");
		list.add("hello");
		list.add("lunch");
		
		// 그냥 for문으로 탐색
		System.out.println("#for");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// 향상된 for문으로 탐색
		System.out.println("#향상된 for");
		for (String element : list) {
			System.out.print(element + " ");
		}
		System.out.println();
		
		// foreach()로 탐색
		System.out.println("#foreach()");
		list.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		// Iterator로 탐색
		System.out.println("#Iterator");
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
	}
}
