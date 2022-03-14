package chap06.book.example.s0609;

public class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. ( 시속 : " + this.speed + "km/h )");
		}
		
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
	

}
