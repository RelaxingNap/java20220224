package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Canine;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.Feline;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App05 {
	public static void main(String[] args) {
		Animal animal1 = method1();	// animal에 정의된 인스턴스 메소드들 실행
		animal1.breathe();
		animal1.cry();
		
		Animal animal2 = method2();
		animal2.breathe();
		animal2.cry();
		
		Animal animal3 = method3();
		animal3.breathe();
		animal3.cry();
		
		Animal animal4 = method4();
		animal4.breathe();
		animal4.cry();	//Chihuahua에 재정의한 메소드가 있기 때문에 재정의한 메소드가 실행된다.
		
		Animal animal5 = method5();
		animal5.breathe();
		animal5.cry();  //StreetCat에 재정의한 메소드가 있기 때문에 재정의한 메소드가 실행된다.
	}


	public static Animal method1() {
		return new Animal();
	}

	public static Animal method2() {
		return new Canine();
	}

	public static Animal method3() {
		return new Feline();
	}

	public static Animal method4() {
		return new Chihuahua();
	}

	public static Animal method5() {
		return new StreetCat();	
	}
}