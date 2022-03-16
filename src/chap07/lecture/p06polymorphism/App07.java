package chap07.lecture.p06polymorphism;

import chap07.lecture.p99polymorphism_class.Animal;
import chap07.lecture.p99polymorphism_class.Chihuahua;

public class App07 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		
		chihuahua.angry();
		chihuahua.breathe();
		chihuahua.cry();
		
		Animal a1 = chihuahua;
		
		a1.breathe();
		a1.cry();
//		a1.angry();  실행불가 animal이 chihuahua가 아님
	}
}
