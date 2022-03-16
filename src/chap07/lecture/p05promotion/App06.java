package chap07.lecture.p05promotion;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Canine;
import chap07.lecture.p99polymorphism_class.Chihuahua;
import chap07.lecture.p99polymorphism_class.Feline;
import chap07.lecture.p99polymorphism_class.StreetCat;

public class App06 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		StreetCat streetCat = new StreetCat();
		
		Canine canine = chihuahua;  // 바로 위인 부모 
		Feline feline = streetCat;	// 바로 위인 부모 
		
		Animal animal1 = canine;  // 바로 위인 부모 
		Animal animal2 = feline;  // 바로 위인 부모 
		
		Animal animal3 = chihuahua; // 부모의 부모를  
		Animal animal4 = streetCat; // 부모의 부모를
		
		//중복 상속 불가
		//다중 상속 불가
	}
}
