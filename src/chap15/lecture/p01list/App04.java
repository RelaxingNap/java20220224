package chap15.lecture.p01list;

import java.util.*;

public class App04 {
	// List : 순서가 있고, 중복 허용 됨.
	// 구현 클래스 : ArrayList, Vector, LinkedList
	// 특별한 경우 아니면 일반적으로 ArrayList 사용할 것
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		
		// element 추가
		list1.add("jimin");		// index 0에 들어감
		list1.add("v");			// index 1에 들어감
		list1.add("jungkuk"); 	// index 2에 들어감
		
		// element 탐색
		String s1 = list1.get(0);
		String s2 = list1.get(1);
		String s3 = list1.get(2);
//		String s4 = list1.get(3);	OutOfBoundsException 발생
		
		// element 변경
		list1.set(0, "suga");
		System.out.println(list1); // List는 toString()이 재정의 되어있음
		
		// element 삭제
		list1.remove(1);	// remove로 지우면 index가 하나씩 당겨짐
		System.out.println(list1);
		System.out.println(list1.get(1));
		
		
	}
}
