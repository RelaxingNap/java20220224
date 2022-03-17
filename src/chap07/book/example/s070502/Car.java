package chap07.book.example.s070502;

public class Car {
	public int speed;
	
	public void speedUp() {speed++;}
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
