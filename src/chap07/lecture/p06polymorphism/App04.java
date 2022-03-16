package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Canine;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.Feline;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App04 {

	public static void main(String[] args) {
		method(new Animal());
		method(new Canine());
		method(new Feline());
		method(new Chihuahua());	// 오버라이딩하면 재정의한 메소드가 실행
		method(new StreetCat());	// 오버라이딩하면 재정의한 메소드가 실행

	}
	
	public static void method(Animal animal) {
		animal.breathe();
		animal.cry();
	}

}
