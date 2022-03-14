package chap06.book.example.s061004;

public class Car {
	
	int speed;
	
	void run () {
		System.out.println(speed + "으로 달립니다.");
	}
	
	
	public static void main(String[] args) {
//		speed = 60;
//		run();
// 정적 블록과 정적 메소드는 객체가 없어도 실행되기 때문에, 
// 이들 내부에 인스턴스 필드나 인스턴스 메소드를 사용못함		
		
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
}
