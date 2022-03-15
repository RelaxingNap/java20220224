package chap07.lecture.p01inheritance;

public class App01 {
	public static void main(String[] args) {
		Computer com1 = new Computer();
		com1.cpu = "펜티엄";
		com1.ram = "32g";
		com1.ssd = "1tb";
		com1.executeGame();
		
		QuantumComputer com2 = new QuantumComputer();	
		//Computer의 내용을 작성하진 않았지만, 상속받아서 Computer의 내용을 가지고 있음.
		//보통 필드는 private로 접근지정자를 지정하기 때문에 상속받지 않음.
		com2.cpu = "양자컴퓨터";
		com2.ram = "1tb";
		com2.ssd = "32tb";
		com2.executeGame();
		com2.executeQuantum();
		
		System.out.println();
	}
}
