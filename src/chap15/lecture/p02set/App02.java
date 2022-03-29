package chap15.lecture.p02set;

import java.util.*;

public class App02 {
	public static void main(String[] args) {
		// Lotto : 1 ~ 45의 임의의 값 6개
		
		// 1 ~ 45의 임의의 값 6개를 중복없이 출력 코드 작성
		
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num);
		}
		
		System.out.println(set);
//		Iterator iter = set.iterator();
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		
	}
}
