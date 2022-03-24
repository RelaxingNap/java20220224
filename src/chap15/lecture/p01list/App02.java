package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Collections;

public class App02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(2);
		
		// 최대값, 최소값 구하는 코드
		
		int max = Collections.max(list);
		int min = Collections.min(list);
		
		System.out.println(max);
		System.out.println(min);
	}
}
