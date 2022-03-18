package chap09.book.exercise.p04;

public class NestedCarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();		// instance nested class 생성
		Car.Engine engine = new Car.Engine();	// static nested class 생성
		
	}
}
