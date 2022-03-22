package chap10.lecture.p06custom;

public class ValueOutOfBoundsException extends Exception {
	public ValueOutOfBoundsException() {
		
	}
	// exception을 직접 만듬.
	// exception을 상속받을지, Runtime exception을 상속받을지 선택해야함.
	public ValueOutOfBoundsException(String message) {
		super(message);
	}
}
