package chap13.book.example.s1304;

import chap13.book.example.s1302.Box;

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
		
	}
}
