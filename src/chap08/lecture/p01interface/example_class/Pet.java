package chap08.lecture.p01interface.example_class;

public interface Pet {
	// 인터페이스명 : UpperCamelCase
	// interface 키워드 사용
	
	void roll();	// public abstract 생략
	
	default void sit() {	
		// default method - method추가시 implements한 구현클래스에서 모두 재정의를 해야하는 문제발생.
		// -> 인터페이스에 정의된 코드블럭이 있는 인스턴스 메소드인 default 메소드로 해결.
		// 선언하지 않아도 public생략
		// 직접구현하는것때문에 추상클래스와의 차이점이 없어지게됨.
		
		System.out.println("반려동물이 앉습니다.");
	}
}
