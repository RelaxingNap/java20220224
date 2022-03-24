package chap13.lecture.p01generic;

import java.util.ArrayList;

import chap08.lecture.p01interface.example_class.*;

public class App11 {
	public static void main(String[] args) {
		ArrayList<Pet> list1 = new ArrayList<>();
		ArrayList<Canine> list2 = new ArrayList<>();
		ArrayList<Cat> list3 = new ArrayList<>();
		
		method(list1);
		method(list2);
		method(list3);
	}
	// 값을 가져올때는 extends
	// 값을 꺼낼때는 super
	// 값을 가져올껀데 Object타입으로 받을꺼면 ?
	// 값을 가져오거나 꺼내는게 동시에 발생시 : 와일드 카드 쓰지말고 명시
	
	public static void method(ArrayList<?> list) {
		
	}
}
