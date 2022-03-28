package chap15.lecture.p01list;

import java.util.*;

public class App08 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		for(int i = 0; i < 10; i++) {
			list.set(i, i * 2);
		}
		System.out.println(list);
		
		list.replaceAll(e -> e * 2);
		System.out.println(list);
		
	}
}
