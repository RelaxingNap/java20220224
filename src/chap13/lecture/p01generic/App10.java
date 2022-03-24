package chap13.lecture.p01generic;

import java.util.ArrayList;

import chap08.lecture.p01interface.example_class.*;


public class App10 {
	public static void main(String[] args) {
		ArrayList<Animal> list1 = new ArrayList<>();
		method(list1);
		
		ArrayList<Canine> list2 = new ArrayList<>();
		method(list2);	// 에러. 와일드카드사용
	}
	
	public static void method(ArrayList<? super Canine> list) {
		list.add(new Chihuahua());
		list.add(new Retriever());
	}
}
