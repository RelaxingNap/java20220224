package chap15.lecture.p01list;

import java.util.*;

public class App09 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++)	{
			list.add(i);
		}
	
		// 홀수 element 삭제
		
// removeIf() 사용 -> 람다식 사용		
		list.removeIf(e -> (e % 2) == 1);
		
// remove() 사용		
//		int i = 0;
//		while(i < list.size()) {
//			
//			int elem = list.get(i);
//			if(elem % 2 == 1) {
//				list.remove(i);
//				continue;
//			}
//			
//			i++;
//		}
		
// Iterator remove() 사용		
//		Iterator<Integer> iter = list.iterator();
//		
//		while(iter.hasNext()) {
//			if(iter.next() % 2 == 1) {
//				iter.remove();
//			}
//		}
		
		System.out.println(list);
	}
}
