package chap15.lecture.p01list;

import java.util.*;

public class Test {
	public static void main(String[] args) {
//
//		List<List<Integer>> list1 = new ArrayList<>();
//		int rowIndex = 5;
//		
//		for(int i = 0; i < rowIndex; i++) {
//			List<Integer> row = new ArrayList<>();
//			
//			if(i != 0) {
//				row.add(1);
//			}
//			
//			for(int j = 0; j < i - 1; j++) {
//				row.add(list1.get(i - 1).get(j) + list1.get(i - 1).get(j + 1));
//			}
//			
//			row.add(1);
//			list1.add(row);
//		}
		
		
		
		
		int rowIndex = 1;
		List<Integer> list1 = new ArrayList<>();
		//list1.add(1);

		for(int i = 0; i < rowIndex; i++) {
			List<Integer> list2 = new ArrayList<>();
			list2.add(1);
			
			for (int j = 0; j < list1.size() - 1; j++) {
				list2.add(list1.get(j) + list1.get(j + 1));
			}
			list2.add(1);
			list1 = list2;
		}
		
		System.out.println(list1);
	}
	
	// 이전의 list가 필요해서 list를 가져와서 새로운 list로 옮겨서 갱신
	public static List<Integer> a(List<Integer> list1) {
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		
		for (int i = 0; i < list1.size() - 1; i++) {
			list2.add(list1.get(i) + list1.get(i + 1));
		}
		list2.add(1);
		
		return list2;
	}
	
}


