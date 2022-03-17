package chap07.book.example.s070502;

public class SportsCar extends Car {

	@Override
	public void speedUp() {	speed += 10;}
	
//	@Override
//	public void stop() {	final method라서 override가 안된다고 에러냄
//		System.out.println("차를 멈춤");
//		speed = 0;
//	}
}
