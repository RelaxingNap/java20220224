package chap13.book.example.s1302;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.set("홍길동"); // String => Object (자동타입변환)
//		String name = (String) box.get(); // Object => String (강제타입변환)
//		
//		box.set(new Apple());	// Apple => Object (자동타입변환)
//		Apple apple = (Apple) box.get(); // Object => Apple (강제타입변환)
		
		// 장점 : 모든 종류의 자바객체 저장가능
		// 단점 : 저장할 때와 읽어올 때, 타입변환이 발생. -> 성능저하발생.
		// 해결책 : 제네릭 타입으로 수정.
		
		// 제네릭 타입으로 변환.
		Box<String> box1 = new Box<>();
		box1.set("hello");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<>();
		box2.set(3); // auto boxing
		int value = box2.get();	// auto unboxing
		
	}
}
