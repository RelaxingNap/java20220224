package chap15.book.example.s150401;

import java.util.*;
public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 95);
		
		// key로 사용할 객체가 사용자 정의 객체일 경우. hashCode()와 equals()를 재정의 해야 한다.
		
		System.out.println("총 Entry 수 : " + map.size());
		
	}
}
