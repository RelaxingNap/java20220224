package chap07.lecture.p02override;

public class QuantumComputer extends Computer {
	
	// 메소드 재정의(method override)
	// 부모클래스의 메소드와 같은이름(파라미터 타입, 순서, 개수)의 메소드를 만들어야함.
	public void execute() {	
		System.out.println("더 빠른 연산을 합니다.");
	}
	
	public void otherExecute() {
		System.out.println("다른 연산을 합니다.");
	}
}
