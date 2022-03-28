package chap15.book.example.s150201;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// String 객체를 저장
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2 , "DataBase");	// 순서 지정 가능
		list.add("iBATIS");
		
		int size = list.size(); // 저장된 총 객체수 얻기
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		String skill = list.get(2); // 2번 인덱스의 객체 얻기
		System.out.println("2 : " + skill);
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {	// 저장된 총 객체수만큼 읽어오기
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println();
		
		list.remove(2);	// 2번 인덱스객체 삭제(DataBase)
		list.remove(2); // 2번 인덱스객체 삭제(Servlet/JSP)
		list.remove("iBATIS"); // 원하는 객체 삭제가능
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		System.out.println();
		
		
		
		
	}
}
