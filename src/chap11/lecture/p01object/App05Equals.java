package chap11.lecture.p01object;

public class App05Equals {
	public static void main(String[] args) {
		Car car1 = new Car("kia", "k5");
		Car car2 = new Car("kia", "k5");
		
		System.out.println(car1.equals(car2));// true : 만약 Car의 company와 model이 같으면 true
	}
}

class Car {
	private String company;
	private String model;
	
	Car(String company, String model) {
		this.company = company;
		this.model = model;
	}

	// equals 메소드를 재정의하게 되면 hashcode 메소드도 재정의를 꼭 해야함
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car car = (Car) obj;
			if(car.model.equals(obj) && car.company.equals(obj)) {
				return true;
			}
		}
		return false;
	}
	
	
}