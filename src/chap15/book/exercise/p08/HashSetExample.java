package chap15.book.exercise.p08;

import java.util.*;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();
		
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "홍길동"));	// 학번이 같으므로 저장되지 않음
		
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student student = iter.next();
			System.out.println(student.studentNum + " : " + student.name);
		}
		
	}
}
