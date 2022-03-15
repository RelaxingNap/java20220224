package chap07.lecture.p01inheritance;

public class QuantumComputer extends Computer { 
	/*상속 받은 클래스 : sub class, child class // 상속해준 클래스 : super class, parent class
	public String cpu;
	public String ram;
	public String ssd;
	
	public void execute() {
		System.out.println("게임을 실행합니다.");
	}
	*/
	public void executeQuantum() {
		System.out.println("복잡한 연산을 합니다.");
	}
}
