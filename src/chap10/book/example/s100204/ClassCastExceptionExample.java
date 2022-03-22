package chap10.book.example.s100204;

public class ClassCastExceptionExample {
	public static void main(String[] args) {
		// 특별한 관계가 없는 클래스를 강제로 타입변환할 경우 발생
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
		
	}
	
	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog) {
			Dog dog = (Dog) animal;		// ClassCastException발생
		//}
	}
	
}	

	class Animal {}
	class Dog extends Animal {}
	class Cat extends Animal {}
	

