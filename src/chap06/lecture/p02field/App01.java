package chap06.lecture.p02field;

public class App01 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.speed = 20;
		c2.speed = 50;
		
		System.out.println(c1.speed);
		System.out.println(c2.speed);
		
		c1.color = "red";
		c2.color = "blue";
		
		c1.model = "model Y";
		c2.model = "avante";
		//각자의 값을 가지고 있기 때문에, 영향을 미치지 않음.
	}
}
