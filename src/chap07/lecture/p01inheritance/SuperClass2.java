package chap07.lecture.p01inheritance;

public class SuperClass2 {
	public SuperClass2() {
		// 상위 클래스의 생성자 호출.
		// 생략해도 자동으로 추가됨.
		// 순서가 바뀌면 안됨.
		super();	
		System.out.println("슈퍼클래스2 생성자 실행");
	}
}
