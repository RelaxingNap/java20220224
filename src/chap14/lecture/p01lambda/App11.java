package chap14.lecture.p01lambda;

import java.util.ArrayList;

public class App11 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("java");
		list1.add("spring");
		list1.add("hello");
		list1.add("jsp");
		list1.add("friday");
		
		list1.replaceAll(c -> c.toUpperCase());
		list1.forEach(c -> System.out.println(c));
		
		list1.removeIf(e -> e.startsWith("J") || e.endsWith("O"));
		
		System.out.println(list1.size());
		
//		14장 전체
//		코딩뱃 모든 람다식 다 풀어서 써볼것
	}
}
