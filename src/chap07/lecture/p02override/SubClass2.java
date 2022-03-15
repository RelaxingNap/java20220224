package chap07.lecture.p02override;

public class SubClass2 extends SuperClass2 {
	@Override
	public void method1() {
		// 부모클래스에서 하던일에 추가로 하려할 때
		// super : 상위 클래스 멤버에 접근하기 위해 사용
		// 순서는 상관이 없음.
		super.method1(); 
		System.out.println("서브클래스2의 메소드 1이 하는 일...");
	}
}
